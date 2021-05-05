package org.bartos.spi.common;

public interface ProviderFactory<T extends Provider> {

    <S extends BartSession> T create(S session);

    String getID();

    void init();

    void postInit();

    void close();
}
