package org.mule.extension.nats.internal;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(NATSOperations.class)
@ConnectionProviders(NATSConnectionProvider.class)
public class NATSConfiguration {

  @Parameter
  @OfValues(ProtocolProvider.class)
  private String protocol;
  @Parameter
  private String host;
  @Parameter
  private String basepath;

  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getBasepath() {
    return basepath;
  }

  public void setBasepath(String basepath) {
    this.basepath = basepath;
  }
}
