/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.addon.cache;

import java.util.concurrent.TimeUnit;

import javax.enterprise.inject.Produces;

import org.infinispan.configuration.cache.Configuration;
import org.infinispan.configuration.cache.ConfigurationBuilder;

/**
 * Configures default cache.
 * 
 * @author Adam Wyłuda
 */
public class DefaultCacheConfiguration
{
   @Produces
   public Configuration getDefaultCacheConfiguration()
   {
      return new ConfigurationBuilder()
               .eviction().maxEntries(1000)
               .expiration().lifespan(10, TimeUnit.MINUTES)
               .build();
   }
}
