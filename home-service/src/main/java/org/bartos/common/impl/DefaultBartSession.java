package org.bartos.common.impl;

import org.bartos.common.BartSession;
import org.bartos.common.BartSessionFactory;
import org.bartos.common.Provider;
import org.bartos.common.ProviderFactory;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class DefaultBartSession implements BartSession {
    private final Map<Integer, Provider> providerMap = new HashMap<>();
    private EntityManager em;
    private BartSessionFactory factory;

    @Override
    @SuppressWarnings("unchecked")
    public <T extends Provider> T getProvider(Class<T> clazz, String id) {
        final int additionalHash = id != null ? id.hashCode() : 0;
        final int hash = clazz.hashCode() + additionalHash;
        T provider = (T) providerMap.get(hash);

        if (provider == null) {
            final ProviderFactory<T, ? super BartSession> providerFactory = factory.getProviderFactory(clazz);
            if (providerFactory != null) {
                provider = providerFactory.create(this);
                providerMap.put(hash, provider);
            }
        }
        return provider;
    }

    @Override
    public <T extends Provider> Set<T> getAllProviders(Class<T> clazz) {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public BartSessionFactory getSessionFactory() {
        return factory;
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }
}
