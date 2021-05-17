package org.bartos.spi.model.home;

import org.bartos.common.Provider;
import org.bartos.model.HomeModel;

import java.util.stream.Stream;

public interface HomeProvider extends Provider {
    HomeModel createHome(String name);

    HomeModel createHome(String homeID, String name);

    HomeModel getHomeByID(String homeID);

    HomeModel getHomeByName(String name);

    Stream<HomeModel> getHomesStream();

    boolean removeHome(String homeID);
}
