package org.bartos.spi.core.model.room;

import org.bartos.model.HomeModel;
import org.bartos.model.RoomModel;
import org.bartos.spi.common.Provider;

import java.util.stream.Stream;

public interface RoomProvider extends Provider {
    RoomModel addRoom(HomeModel home, String name);

    RoomModel addRoom(HomeModel home, String roomID, String name);

    RoomModel getRoomByID(HomeModel home, String roomID);

    Stream<RoomModel> getRoomsStream(HomeModel home);

    boolean removeRoom(HomeModel home, String roomID);

    boolean removeRooms(HomeModel home);

    Integer getCountOfRooms(HomeModel home);
}
