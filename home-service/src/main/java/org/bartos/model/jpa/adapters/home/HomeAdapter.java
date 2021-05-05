package org.bartos.model.jpa.adapters.home;

import org.bartos.model.HomeInvitationModel;
import org.bartos.model.HomeModel;
import org.bartos.model.RoomModel;
import org.bartos.model.jpa.entities.home.HomeEntity;
import org.bartos.spi.core.BartHomeSession;

import javax.persistence.EntityManager;
import java.util.stream.Stream;

//TODO add session
public class HomeAdapter implements HomeModel {
    private final BartHomeSession session;
    protected EntityManager em;
    protected HomeEntity home;

    public HomeAdapter(BartHomeSession session, EntityManager em, HomeEntity home) {
        this.session = session;
        this.em = em;
        this.home = home;
    }

    @Override
    public String getID() {
        return home.getID();
    }

    @Override
    public String getName() {
        return home.getName();
    }

    @Override
    public void setName(String name) {
        home.setName(name);
        em.flush();
    }

    @Override
    public Stream<String> getUsers() {
        return home.getUsers().stream();
    }

    @Override
    public void addUser(String userID) {
        if (home.getUsers().add(userID)) {
            em.flush();
        }
    }

    @Override
    public void removeUser(String userID) {
        if (home.getUsers().remove(userID)) {
            em.flush();
        }
    }

    @Override
    public Long getUsersCount() {
        return (long) home.getUsers().size();
    }

    @Override
    public Stream<String> getUnassignedDevices() {
        return home.getUnassignedDevices().stream();
    }

    @Override
    public void addUnassignedDevice(String deviceID) {
        if (home.getUnassignedDevices().add(deviceID)) {
            em.flush();
        }
    }

    @Override
    public void removeUnassignedDevice(String deviceID) {
        if (home.getUnassignedDevices().remove(deviceID)) {
            em.flush();
        }
    }

    @Override
    public Long getUnassignedDevicesCount() {
        return (long) home.getUnassignedDevices().size();
    }

    @Override
    public Stream<RoomModel> getRooms() {
        return null;
    }

    @Override
    public RoomModel getRoomByID(String roomID) {
        return null;
    }

    @Override
    public void addRoom(RoomModel room) {

    }

    @Override
    public void removeRoom(String roomID) {

    }

    @Override
    public Long getRoomsCount() {
        return (long) home.getRooms().size();
    }

    @Override
    public Stream<HomeInvitationModel> getInvitations() {
        return null;
    }

    @Override
    public HomeInvitationModel getInvitationByID(String invitationID) {
        return null;
    }

    @Override
    public void addInvitation(String invitationID) {

    }

    @Override
    public void removeInvitation(String invitationID) {

    }

    @Override
    public Long getInvitationsCount() {
        return (long) home.getInvitations().size();
    }
}
