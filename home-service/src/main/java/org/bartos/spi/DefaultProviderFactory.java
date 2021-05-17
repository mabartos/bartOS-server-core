package org.bartos.spi;

import org.bartos.common.Provider;
import org.bartos.common.ProviderFactory;

public interface DefaultProviderFactory<T extends Provider> extends ProviderFactory<T, BartHomeSession> {
}
