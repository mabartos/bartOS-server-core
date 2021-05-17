package org.bartos.model.jpa.adapters.home;

import org.bartos.model.HomeInvitationModel;
import org.bartos.model.HomeModel;
import org.bartos.model.RoomModel;
import org.bartos.model.jpa.entities.home.HomeEntity;
import org.bartos.common.jpa.JpaModel;
import org.bartos.spi.BartHomeSession;

import javax.persistence.EntityManager;
import java.util.stream.Stream;

public class JpaHomeAdapter implements HomeModel, JpaModel<HomeEntity> {
    private final BartHomeSession session;
    protected EntityManager em;
    protected HomeEntity home;

    public JpaHomeAdapter(BartHomeSession session, HomeEntity home) {
        this.session = session;
        this.em = session.getEntityManager();
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
    public boolean addUser(String userID) {
        if (home.getUsers().add(userID)) {
            em.flush();
            return true;
        }
        return false;
    }

    @Override
    public boolean removeUser(String userID) {
        if (home.getUsers().remove(userID)) {
            em.flush();
            return true;
        }
        return false;
    }

    @Override
    public Integer getUsersCount() {
        return home.getUsers().size();
    }

    @Override
    public Stream<String> getUnassignedDevices() {
        return home.getUnassignedDevices().stream();
    }

    @Override
    public boolean addUnassignedDevice(String deviceID) {
        if (home.getUnassignedDevices().add(deviceID)) {
            em.flush();
            return true;
        }
        return false;
    }

    @Override
    public boolean removeUnassignedDevice(String deviceID) {
        if (home.getUnassignedDevices().remove(deviceID)) {
            em.flush();
            return true;
        }
        return false;
    }

    @Override
    public Integer getUnassignedDevicesCount() {
        return home.getUnassignedDevices().size();
    }

    @Override
    public Stream<RoomModel> getRooms() {
        return session.rooms().getRoomsStream(this);
    }

    @Override
    public RoomModel getRoomByID(String roomID) {
        return session.rooms().getRoomByID(this, roomID);
    }

    @Override
    public RoomModel addRoom(String roomID) {
        return session.rooms().addRoom(this, roomID);
    }

    @Override
    public boolean removeRoom(String roomID) {
        return session.rooms().removeRoom(this, roomID);
    }

    @Override
    public Integer getRoomsCount() {
        return session.rooms().getCountOfRooms(this);
    }

    @Override
    public Stream<HomeInvitationModel> getInvitations() {
        return session.invitations().getInvitations(this);
    }

    @Override
    public HomeInvitationModel getInvitationByID(String invitationID) {
        return session.invitations().getInvitationsByID(this, invitationID);
    }

    @Override
    public HomeInvitationModel createInvitation(HomeInvitationModel invitation) {
        return session.invitations().createInvitation(this, invitation);
    }

    @Override
    public boolean removeInvitation(String invitationID) {
        return session.invitations().removeInvitation(this, invitationID);
    }

    @Override
    public Integer getInvitationsCount() {
        return session.invitations().getInvitationsCount(this);
    }

    @Override
    public HomeEntity getEntity() {
        return home;
    }
}
