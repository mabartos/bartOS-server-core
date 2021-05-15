package org.bartos.spi.core.model.home.invitations;

import org.bartos.model.HomeInvitationModel;
import org.bartos.model.HomeModel;
import org.bartos.spi.common.Provider;

import java.util.stream.Stream;

public interface HomeInvitationProvider extends Provider {
    HomeInvitationModel addInvitation(HomeModel home, HomeInvitationModel invitation);

    HomeInvitationModel addInvitation(HomeModel home, String invitationID);

    HomeInvitationModel updateInvitation(HomeModel home, String invitationID, HomeInvitationModel invitation);

    Stream<HomeInvitationModel> getInvitations(HomeModel home);

    HomeInvitationModel getInvitationsByID(HomeModel home, String invitationID);

    boolean removeInvitation(HomeModel home, String invitationID);

    Integer getInvitationsCount(HomeModel home);
}
