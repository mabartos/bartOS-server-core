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

    void setHome(HomeModel home);

    /* DEVICES */
    Stream<String> getDevices();

    void addDevice(String deviceID);

    void removeDevice(String deviceID);

    Long getDevicesCount();
}
