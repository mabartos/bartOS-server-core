package org.bartos.common;

import javax.persistence.EntityManager;
import java.util.Set;

public interface BartSession {

    default <T extends Provider> T getProvider(Class<T> clazz) {
        return getProvider(clazz, null);
    }

    <T extends Provider> T getProvider(Class<T> clazz, String id);

    <T extends Provider> Set<T> getAllProviders(Class<T> clazz);

    void close();

    BartSessionFactory getSessionFactory();

    EntityManager getEntityManager();
}
