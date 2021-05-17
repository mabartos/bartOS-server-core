package org.bartos.model.jpa.adapters.home;

import org.bartos.model.HomeInvitationModel;
import org.bartos.model.HomeModel;
import org.bartos.model.jpa.entities.home.HomeInvitationEntity;
import org.bartos.common.jpa.JpaModel;
import org.bartos.spi.BartHomeSession;

import javax.persistence.EntityManager;

public class JpaHomeInvitationAdapter implements HomeInvitationModel, JpaModel<HomeInvitationEntity> {
    private final BartHomeSession session;
    protected EntityManager em;
    protected HomeModel home;
    protected HomeInvitationEntity invitationEntity;

    public JpaHomeInvitationAdapter(BartHomeSession session, HomeModel home, HomeInvitationEntity invitationEntity) {
        this.session = session;
        this.em = session.getEntityManager();
        this.home = home;
        this.invitationEntity = invitationEntity;
    }

    @Override
    public String getID() {
        return invitationEntity.getID();
    }

    @Override
    public String getIssuer() {
        return invitationEntity.getIssuer();
    }

    @Override
    public void setIssuer(String issuerID) {
        invitationEntity.setIssuer(issuerID);
        em.flush();
    }

    @Override
    public String getReceiver() {
        return invitationEntity.getReceiver();
    }

    @Override
    public void setReceiver(String receiverID) {
        invitationEntity.setReceiver(receiverID);
        em.flush();
    }

    @Override
    public HomeModel getHome() {
        return home;
    }

    @Override
    public HomeInvitationEntity getEntity() {
        return invitationEntity;
    }
}
