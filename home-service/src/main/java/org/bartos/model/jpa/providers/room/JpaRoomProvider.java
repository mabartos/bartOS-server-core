package org.bartos.model.jpa.providers.room;

import org.bartos.model.HomeModel;
import org.bartos.model.RoomModel;
import org.bartos.model.jpa.adapters.room.JpaRoomAdapter;
import org.bartos.model.jpa.entities.room.RoomEntity;
import org.bartos.model.jpa.entities.home.HomeEntity;
import org.bartos.spi.BartHomeSession;
import org.bartos.spi.model.room.RoomProvider;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.stream.Stream;

public class JpaRoomProvider implements RoomProvider {
    private final BartHomeSession session;
    protected EntityManager em;

    public JpaRoomProvider(BartHomeSession session) {
        this.session = session;
        this.em = session.getEntityManager();
    }

    @Override
    public RoomModel addRoom(HomeModel home, String roomID, String name) {
        HomeEntity homeEntity = em.find(HomeEntity.class, home.getID());
        if (homeEntity == null) return null;

        RoomEntity room = new RoomEntity();
        if (roomID != null) room.setID(roomID);
        room.setName(name);
        room.setHome(homeEntity);

        em.persist(room);
        em.flush();

        return new JpaRoomAdapter(session, home, room);
    }

    @Override
    public RoomModel getRoomByID(HomeModel home, String roomID) {
        TypedQuery<RoomEntity> query = em.createNamedQuery("getRoomByID", RoomEntity.class);
        query.setParameter("id", roomID);
        query.setParameter("homeID", home.getID());

        RoomEntity room = query.getSingleResult();
        if (room == null) return null;

        return new JpaRoomAdapter(session, home, room);
    }

    @Override
    public Stream<RoomModel> getRoomsStream(HomeModel home) {
        TypedQuery<RoomEntity> query = em.createNamedQuery("getAllRooms", RoomEntity.class);
        query.setParameter("homeID", home.getID());

        return query.getResultStream().map(room -> session.rooms().getRoomByID(home, room.getID()));
    }

    @Override
    public boolean removeRoom(HomeModel home, String roomID) {
        em.createNamedQuery("deleteRoomByID")
                .setParameter("id", roomID)
                .setParameter("homeID", home.getID())
                .executeUpdate();
        return true;
    }

    @Override
    public boolean removeRooms(HomeModel home) {
        em.createNamedQuery("deleteRoomsFromHome")
                .setParameter("homeID", home.getID())
                .executeUpdate();
        return true;
    }

    @Override
    public Integer getCountOfRooms(HomeModel home) {
        return em.createNamedQuery("getCountOfRooms", Integer.class).setParameter("homeID", home.getID()).getSingleResult();
    }
}
