package org.bartos.model.jpa.providers.invitations;

import org.bartos.spi.model.home.invitations.HomeInvitationProvider;
import org.bartos.spi.model.home.invitations.HomeInvitationProviderFactory;
import org.bartos.spi.BartHomeSession;

public class JpaHomeInvitationProviderFactory implements HomeInvitationProviderFactory {
    public static String FACTORY_ID = "JPA-HOME-INVITATION-FACTORY";

    @Override
    public HomeInvitationProvider create(BartHomeSession session) {
        return new JpaHomeInvitationProvider(session);
    }

    @Override
    public String getID() {
        return FACTORY_ID;
    }

    @Override
    public void init() {

    }

    @Override
    public void postInit() {

    }

    @Override
    public void close() {

    }
}
