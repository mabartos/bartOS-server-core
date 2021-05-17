package org.bartos.model.jpa.providers.invitations;

import org.bartos.model.jpa.adapters.home.JpaHomeInvitationAdapter;
import org.bartos.spi.model.home.invitations.HomeInvitationProvider;
import org.bartos.model.HomeInvitationModel;
import org.bartos.model.HomeModel;
import org.bartos.model.jpa.entities.home.HomeEntity;
import org.bartos.model.jpa.entities.home.HomeInvitationEntity;
import org.bartos.spi.BartHomeSession;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.stream.Stream;

public class JpaHomeInvitationProvider implements HomeInvitationProvider {
    private final BartHomeSession session;
    protected EntityManager em;

    public JpaHomeInvitationProvider(BartHomeSession session) {
        this.session = session;
        this.em = session.getEntityManager();
    }

    @Override
    public HomeInvitationModel createInvitation(HomeModel home, HomeInvitationModel invitation) {
        HomeInvitationEntity entity = new HomeInvitationEntity();
        entity.setIssuer(invitation.getIssuer());
        entity.setReceiver(invitation.getReceiver());

        HomeEntity homeEntity = em.find(HomeEntity.class, invitation.getHome().getID());
        if (homeEntity == null) return null;
        entity.setHome(homeEntity);

        em.persist(entity);
        em.flush();

        return new JpaHomeInvitationAdapter(session, home, entity);
    }

    @Override
    public Stream<HomeInvitationModel> getInvitations(HomeModel home) {
        HomeEntity entity = em.find(HomeEntity.class, home.getID());
        if (entity == null) return null;

        return entity.getInvitations()
                .stream()
                .map(inv -> new JpaHomeInvitationAdapter(session, home, inv));
    }

    @Override
    public HomeInvitationModel getInvitationsByID(HomeModel home, String invitationID) {
        HomeInvitationEntity entity = em.find(HomeInvitationEntity.class, invitationID);
        if (entity == null) return null;

        return new JpaHomeInvitationAdapter(session, home, entity);
    }

    @Override
    public boolean removeInvitation(HomeModel home, String invitationID) {
        if (invitationID == null) return false;

        em.createNamedQuery("deleteHomeInvitationByID")
                .setParameter("id", invitationID)
                .setParameter("homeID", home.getID())
                .executeUpdate();

        return true;
    }

    @Override
    public Integer getInvitationsCount(HomeModel home) {
        TypedQuery<Integer> query = em.createNamedQuery("getInvitationsCount", Integer.class);
        query.setParameter("homeID", home.getID());
        return query.getSingleResult();
    }
}
