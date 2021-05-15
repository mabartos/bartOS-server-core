package org.bartos.model.jpa.providers.home;

import org.bartos.spi.core.BartHomeSession;
import org.bartos.spi.core.model.home.HomeProvider;
import org.bartos.spi.core.model.home.HomeProviderFactory;

import javax.persistence.EntityManager;

public class JpaHomeProviderFactory implements HomeProviderFactory {
    private EntityManager em;

    public JpaHomeProviderFactory(EntityManager em) {
        this.em = em;
    }

    @Override
    public HomeProvider create(BartHomeSession session) {
        return new JpaHomeProvider(session, em);
    }

    @Override
    public String getID() {
        return null;
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
