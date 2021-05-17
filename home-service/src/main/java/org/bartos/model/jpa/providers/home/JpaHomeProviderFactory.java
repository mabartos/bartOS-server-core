package org.bartos.model.jpa.providers.home;

import org.bartos.spi.BartHomeSession;
import org.bartos.spi.model.home.HomeProvider;
import org.bartos.spi.model.home.HomeProviderFactory;

public class JpaHomeProviderFactory implements HomeProviderFactory {
    public static String FACTORY_ID = "JPA-HOME-FACTORY";
    
    @Override
    public HomeProvider create(BartHomeSession session) {
        return new JpaHomeProvider(session);
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
