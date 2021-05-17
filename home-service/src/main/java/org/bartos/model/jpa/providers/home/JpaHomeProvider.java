package org.bartos.model.jpa.providers.home;

import org.bartos.model.HomeModel;
import org.bartos.model.jpa.adapters.home.JpaHomeAdapter;
import org.bartos.model.jpa.entities.home.HomeEntity;
import org.bartos.spi.BartHomeSession;
import org.bartos.spi.model.home.HomeProvider;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.UUID;
import java.util.stream.Stream;

public class JpaHomeProvider implements HomeProvider {

    private final BartHomeSession session;
    protected EntityManager em;

    public JpaHomeProvider(BartHomeSession session) {
        this.session = session;
        this.em = session.getEntityManager();
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
        return new JpaHomeAdapter(session, entity);
    }

    @Override
    public HomeModel getHomeByID(String homeID) {
        HomeEntity entity = em.find(HomeEntity.class, homeID);
        if (entity == null) return null;
        return new JpaHomeAdapter(session, entity);
    }

    @Override
    public HomeModel getHomeByName(String name) {
        TypedQuery<HomeEntity> query = em.createNamedQuery("getHomeByName", HomeEntity.class);
        query.setParameter("name", name);
        HomeEntity entity = query.getSingleResult();
        if (entity == null) return null;
        return new JpaHomeAdapter(session, entity);
    }

    @Override
    public Stream<HomeModel> getHomesStream() {
        TypedQuery<HomeEntity> query = em.createNamedQuery("getAllHomeIDs", HomeEntity.class);
        Stream<HomeEntity> entities = query.getResultStream();
        return entities.map(f -> session.homes().getHomeByID(f.getID()));
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
