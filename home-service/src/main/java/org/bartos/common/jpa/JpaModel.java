package org.bartos.common.jpa;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

public interface JpaModel<T extends PanacheEntityBase> {
    T getEntity();
}
