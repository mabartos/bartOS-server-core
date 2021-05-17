package org.bartos.common;

public interface Spi {
    String getName();

    Class<? extends Provider> getProviderClass();

    Class<? extends ProviderFactory> getProviderFactoryClass();
}
