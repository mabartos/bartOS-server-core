package org.bartos.spi.common;

import java.util.Set;

public interface BartSession {

    <T extends Provider> T getProvider(Class<T> clazz);

    <T extends Provider> T getProvider(Class<T> clazz, String id);

    <T extends Provider> Set<T> getAllProviders(Class<T> clazz);

    void close();

    BartSessionFactory getSessionFactory();
}
