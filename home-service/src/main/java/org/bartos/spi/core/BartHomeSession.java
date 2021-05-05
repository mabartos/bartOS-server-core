package org.bartos.spi.core;


import org.bartos.spi.common.BartSession;
import org.bartos.spi.core.model.HomeProvider;
import org.bartos.spi.core.model.RoomProvider;

public interface BartHomeSession extends BartSession {

    HomeProvider homes();

    RoomProvider rooms();
}
