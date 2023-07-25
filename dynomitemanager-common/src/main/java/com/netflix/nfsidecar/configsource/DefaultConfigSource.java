package com.netflix.nfsidecar.configsource;

import javax.inject.Inject;


public class DefaultConfigSource extends CompositeConfigSource {

  @Inject
  public DefaultConfigSource(final PropertiesConfigSource simpleDBConfigSource,
                           final PropertiesConfigSource propertiesConfigSource,
                           final SystemPropertiesConfigSource systemPropertiesConfigSource) {
    super(simpleDBConfigSource, propertiesConfigSource, systemPropertiesConfigSource);
  }
}
