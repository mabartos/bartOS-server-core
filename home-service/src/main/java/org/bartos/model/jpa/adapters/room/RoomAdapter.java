package org.bartos.model.jpa.adapters.room;

import org.bartos.model.HomeModel;
import org.bartos.model.RoomModel;
import org.bartos.model.jpa.entities.room.RoomEntity;
import org.bartos.model.jpa.entities.room.RoomType;

import javax.persistence.EntityManager;
import java.util.stream.Stream;

//TODO
public class RoomAdapter implements RoomModel {
    protected RoomEntity room;
    protected EntityManager em;

    public RoomAdapter(EntityManager em, RoomEntity room) {
        this.em = em;
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
        return null;
    }

    @Override
    public void setHome(HomeModel home) {

    }

    @Override
    public Stream<String> getDevices() {
        return room.getDevices().stream();
    }

    @Override
    public void addDevice(String deviceID) {
        if (room.getDevices().add(deviceID)) {
            em.flush();
        }
    }

    @Override
    public void removeDevice(String deviceID) {

    }

    @Override
    public Long getDevicesCount() {
        return (long) room.getDevices().size();
    }
}
