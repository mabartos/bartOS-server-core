/*
 * Copyright (c) 2020.
 * Martin Bartos
 * SmartHome BartOS
 * All rights reserved.
 */

package org.mabartos.api.common;

public interface IdentifiableName<ID> extends Identifiable<ID> {

    String getName();
}
