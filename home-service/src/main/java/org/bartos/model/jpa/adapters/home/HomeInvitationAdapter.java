package org.bartos.model.jpa.adapters.home;

import org.bartos.model.HomeInvitationModel;
import org.bartos.model.HomeModel;
import org.bartos.model.jpa.entities.home.HomeInvitationEntity;
import org.bartos.spi.core.BartHomeSession;

import javax.persistence.EntityManager;

public class HomeInvitationAdapter implements HomeInvitationModel {
    private final BartHomeSession session;
    protected EntityManager em;
    protected HomeModel home;
    protected HomeInvitationEntity invitationEntity;

    public HomeInvitationAdapter(BartHomeSession session, EntityManager em, HomeModel home, HomeInvitationEntity invitationEntity) {
        this.session = session;
        this.em = em;
        this.home = home;
        this.invitationEntity = invitationEntity;
    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public String getIssuer() {
        return null;
    }

    @Override
    public void setIssuer(String issuerID) {

    }

    @Override
    public String getReceiver() {
        return null;
    }

    @Override
    public void setReceiver(String receiverID) {

    }

    @Override
    public HomeModel getHome() {
        return null;
    }
}
