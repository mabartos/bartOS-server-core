package org.bartos.model;

import java.util.stream.Stream;

public interface HomeModel {

    String getID();

    String getName();

    void setName(String name);

    /* USERS */
    Stream<String> getUsers();

    void addUser(String userID);

    void removeUser(String userID);

    Long getUsersCount();

    /* DEVICES */
    Stream<String> getUnassignedDevices();

    void addUnassignedDevice(String deviceID);

    void removeUnassignedDevice(String deviceID);

    Long getUnassignedDevicesCount();

    /* ROOMS */
    Stream<RoomModel> getRooms();

    RoomModel getRoomByID(String roomID);

    void addRoom(RoomModel room);

    void removeRoom(String roomID);

    Long getRoomsCount();

    /* INVITATIONS */
    Stream<HomeInvitationModel> getInvitations();

    HomeInvitationModel getInvitationByID(String invitationID);

    void addInvitation(String invitationID);

    void removeInvitation(String invitationID);

    Long getInvitationsCount();
}
