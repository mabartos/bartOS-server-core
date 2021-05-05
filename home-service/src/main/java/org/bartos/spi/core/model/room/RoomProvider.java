package org.bartos.spi.core.model.room;

import org.bartos.model.RoomModel;
import org.bartos.spi.common.Provider;

import java.util.stream.Stream;

public interface RoomProvider extends Provider {
    RoomModel createRoom(String name);

    RoomModel createRoom(String roomID, String name);

    RoomModel getRoomByID(String roomID);

    Stream<RoomModel> getRoomsStream();

    boolean removeRoom(String roomID);
}
