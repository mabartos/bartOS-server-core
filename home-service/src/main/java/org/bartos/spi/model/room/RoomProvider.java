package org.bartos.spi.model.room;

import org.bartos.common.Provider;
import org.bartos.model.HomeModel;
import org.bartos.model.RoomModel;

import java.util.stream.Stream;

public interface RoomProvider extends Provider {

    default RoomModel addRoom(HomeModel home, String name) {
        return addRoom(home, null, name);
    }

    RoomModel addRoom(HomeModel home, String roomID, String name);

    RoomModel getRoomByID(HomeModel home, String roomID);

    Stream<RoomModel> getRoomsStream(HomeModel home);

    boolean removeRoom(HomeModel home, String roomID);

    boolean removeRooms(HomeModel home);

    Integer getCountOfRooms(HomeModel home);
}
