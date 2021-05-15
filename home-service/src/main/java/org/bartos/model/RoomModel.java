package org.bartos.model;

import org.bartos.model.jpa.entities.room.RoomType;

import java.util.stream.Stream;

public interface RoomModel {

    String getID();

    String getName();

    void setName(String name);

    RoomType getType();

    void setType(RoomType type);

    HomeModel getHome();

    /* DEVICES */
    Stream<String> getDevices();

    boolean addDevice(String deviceID);

    boolean removeDevice(String deviceID);

    Integer getDevicesCount();
}
