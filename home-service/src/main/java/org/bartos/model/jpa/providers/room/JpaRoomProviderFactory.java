package org.bartos.model.jpa.providers.room;

import org.bartos.spi.BartHomeSession;
import org.bartos.spi.model.room.RoomProvider;
import org.bartos.spi.model.room.RoomProviderFactory;

public class JpaRoomProviderFactory implements RoomProviderFactory {
    public static String FACTORY_ID = "JPA_ROOM_FACTORY";

    @Override
    public RoomProvider create(BartHomeSession session) {
        return new JpaRoomProvider(session);
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
