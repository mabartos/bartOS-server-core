package org.bartos.spi.common;

public interface ProviderFactory<T extends Provider> {

    <Sess extends BartSession> T create(Sess session);

    String getID();

    void init();

    void postInit();

    void close();
}
