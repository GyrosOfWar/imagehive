package com.github.gyrosofwar.imagehive.configuration;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.annotation.Nullable;
import java.net.URI;

@ConfigurationProperties("imagehive")
public record ImageHiveConfiguration(
  String imageBasePath,
  @Nullable ImageHiveConfiguration.AiServiceConfiguration ai,
  @Nullable ImgProxyConfiguration imgProxy,
  ThumbnailerType thumbnailer
) {
  @ConfigurationProperties("ai")
  public record AiServiceConfiguration(boolean enabled, @Nullable URI url) {}

  @ConfigurationProperties("img-proxy")
  public record ImgProxyConfiguration(URI uri, String key, String salt) {}

  public enum ThumbnailerType {
    JAVA,
    IMG_PROXY,
  }
}
