package org.bartos.model;

import java.util.stream.Stream;

public interface HomeModel {

    String getID();

    String getName();

    void setName(String name);

    /* USERS */
    Stream<String> getUsers();

    boolean addUser(String userID);

    boolean removeUser(String userID);

    Integer getUsersCount();

    /* DEVICES */
    Stream<String> getUnassignedDevices();

    boolean addUnassignedDevice(String deviceID);

    boolean removeUnassignedDevice(String deviceID);

    Integer getUnassignedDevicesCount();

    /* ROOMS */
    Stream<RoomModel> getRooms();

    RoomModel getRoomByID(String roomID);

    RoomModel addRoom(String roomID);

    boolean removeRoom(String roomID);

    Integer getRoomsCount();

    /* INVITATIONS */
    Stream<HomeInvitationModel> getInvitations();

    HomeInvitationModel getInvitationByID(String invitationID);

    HomeInvitationModel createInvitation(HomeInvitationModel invitation);

    boolean removeInvitation(String invitationID);

    Integer getInvitationsCount();
}
