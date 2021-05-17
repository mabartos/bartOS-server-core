package org.bartos.model.jpa.adapters.room;

import org.bartos.common.jpa.JpaModel;
import org.bartos.model.HomeModel;
import org.bartos.model.RoomModel;
import org.bartos.model.RoomType;
import org.bartos.model.jpa.entities.room.RoomEntity;
import org.bartos.spi.BartHomeSession;

import javax.persistence.EntityManager;
import java.util.stream.Stream;

public class JpaRoomAdapter implements RoomModel, JpaModel<RoomEntity> {
    private final BartHomeSession session;
    protected HomeModel home;
    protected RoomEntity room;
    protected EntityManager em;

    public JpaRoomAdapter(BartHomeSession session, HomeModel home, RoomEntity room) {
        this.session = session;
        this.em = session.getEntityManager();
        this.home = home;
        this.room = room;
    }

    @Override
    public String getID() {
        return room.getID();
    }

    @Override
    public String getName() {
        return room.getName();
    }

    @Override
    public void setName(String name) {
        room.setName(name);
        em.flush();
    }

    @Override
    public RoomType getType() {
        return room.getType();
    }

    @Override
    public void setType(RoomType type) {
        room.setType(type);
        em.flush();
    }

    @Override
    public HomeModel getHome() {
        return home;
    }

    @Override
    public Stream<String> getDevices() {
        return room.getDevices().stream();
    }

    @Override
    public boolean addDevice(String deviceID) {
        if (room.getDevices().add(deviceID)) {
            em.flush();
            return true;
        }
        return false;
    }

    @Override
    public boolean removeDevice(String deviceID) {
        if (room.getDevices().remove(deviceID)) {
            em.flush();
            return true;
        }
        return false;
    }

    @Override
    public Integer getDevicesCount() {
        return room.getDevices().size();
    }

    @Override
    public RoomEntity getEntity() {
        return room;
    }
}