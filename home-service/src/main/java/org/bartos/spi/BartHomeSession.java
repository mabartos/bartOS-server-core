package org.bartos.spi;


import org.bartos.common.BartSession;
import org.bartos.spi.model.home.invitations.HomeInvitationProvider;
import org.bartos.spi.model.home.HomeProvider;
import org.bartos.spi.model.room.RoomProvider;

public interface BartHomeSession extends BartSession {

    HomeProvider homes();

    HomeInvitationProvider invitations();

    RoomProvider rooms();
}
