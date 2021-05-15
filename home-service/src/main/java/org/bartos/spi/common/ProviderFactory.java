package org.bartos.spi.common;

public interface ProviderFactory<T extends Provider, Session extends BartSession> {

    T create(Session session);

    String getID();

    void init();

    void postInit();

    void close();
}
