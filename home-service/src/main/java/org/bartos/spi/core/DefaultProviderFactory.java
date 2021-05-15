package org.bartos.spi.core;

import org.bartos.spi.common.Provider;
import org.bartos.spi.common.ProviderFactory;

public interface DefaultProviderFactory<T extends Provider> extends ProviderFactory<T, BartHomeSession> {
}
