package org.bartos.common.impl;

import org.bartos.common.BartSession;
import org.bartos.common.BartSessionFactory;
import org.bartos.common.Provider;
import org.bartos.common.ProviderFactory;
import org.bartos.common.Spi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class DefaultBartSessionFactory implements BartSessionFactory {
    private final Map<Integer, Spi> SPIs = new HashMap<>();
    private final Map<String, ProviderFactory> factories = new HashMap<>();

    public BartSessionFactory create() {
        return null;
    }

    public Set<Spi> getAllSPIs() {
        return (Set<Spi>) SPIs.values();
    }

    public Spi getSpi(Class<? extends Provider> providerClass) {
        if (providerClass == null) return null;
        return SPIs.get(providerClass.hashCode());
    }

    //TODO
    public <T extends Provider> ProviderFactory<T, ? super BartSession> getProviderFactory(Class<T> clazz) {
        //T loader = ServiceLoader.load(clazz, clazz.getClassLoader());

        return null;
    }

    public <T extends Provider> ProviderFactory<T, ? super BartSession> getProviderFactory(Class<T> clazz, String id) {
        return null;
    }

    public void close() {

    }
}
