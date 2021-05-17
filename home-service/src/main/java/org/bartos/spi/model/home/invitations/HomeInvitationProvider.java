package org.bartos.spi.model.home.invitations;

import org.bartos.model.HomeInvitationModel;
import org.bartos.model.HomeModel;
import org.bartos.common.Provider;

import java.util.stream.Stream;

public interface HomeInvitationProvider extends Provider {
    HomeInvitationModel createInvitation(HomeModel home, HomeInvitationModel invitation);

    Stream<HomeInvitationModel> getInvitations(HomeModel home);

    HomeInvitationModel getInvitationsByID(HomeModel home, String invitationID);

    boolean removeInvitation(HomeModel home, String invitationID);

    Integer getInvitationsCount(HomeModel home);
}
