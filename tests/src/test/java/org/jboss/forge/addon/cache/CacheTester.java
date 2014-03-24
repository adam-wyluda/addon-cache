/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.addon.cache;

import javax.cache.Cache;
import javax.inject.Inject;

/**
 * Allows testing default injected cache.
 * 
 * @author Adam Wyłuda
 */
public class CacheTester
{
   @Inject
   private Cache<String, String> cache;
   
   /**
    * Returns true if cache contains given entry.
    */
   public boolean testEntry(String key, String value)
   {
      if (!cache.containsKey(key))
      {
         return false;
      }
      String cachedValue = cache.get(key);
      if (cachedValue == null || !cachedValue.equals(value))
      {
         return false;
      }
      return true;
   }
}
