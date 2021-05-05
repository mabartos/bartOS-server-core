package org.bartos.model.jpa;

import org.bartos.model.HomeModel;
import org.bartos.model.jpa.adapters.home.HomeAdapter;
import org.bartos.model.jpa.entities.home.HomeEntity;
import org.bartos.spi.core.BartHomeSession;
import org.bartos.spi.core.model.home.HomeProvider;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.UUID;
import java.util.stream.Stream;

public class JpaHomeProvider implements HomeProvider {

    private final BartHomeSession session;
    protected EntityManager em;

    public JpaHomeProvider(BartHomeSession session, EntityManager em) {
        this.session = session;
        this.em = em;
    }

    @Override
    public void close() {

    }

    @Override
    public HomeModel createHome(String name) {
        return createHome(name, UUID.randomUUID().toString());
    }

    @Override
    public HomeModel createHome(String homeID, String name) {
        HomeEntity entity = new HomeEntity();
        entity.setID(homeID);
        entity.setName(name);
        em.persist(entity);
        em.flush();
        return new HomeAdapter(session, em, entity);
    }

    @Override
    public HomeModel getHomeByID(String homeID) {
        HomeEntity entity = em.find(HomeEntity.class, homeID);
        if (entity == null) return null;
        return new HomeAdapter(session, em, entity);
    }

    @Override
    public HomeModel getHomeByName(String name) {
        TypedQuery<HomeEntity> query = em.createNamedQuery("getHomeByName", HomeEntity.class);
        query.setParameter("name", name);
        HomeEntity entity = query.getSingleResult();
        if (entity == null) return null;
        return new HomeAdapter(session, em, entity);
    }

    @Override
    public Stream<HomeModel> getHomesStream() {
        return Stream.of();
    }

    @Override
    public boolean removeHome(String homeID) {
        HomeEntity entity = em.find(HomeEntity.class, homeID);
        if (entity == null) return false;
        em.remove(entity);
        em.flush();
        return true;
    }
}
