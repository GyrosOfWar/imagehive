package com.github.gyrosofwar.imagehive.configuration;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import org.apache.tika.Tika;
import org.apache.tika.config.TikaConfig;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Factory
public class ImageHiveFactory {

  @Bean
  public PasswordEncoder passwordEncoder() {
    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  }

  @Bean
  public TikaConfig tikaConfig() {
    return TikaConfig.getDefaultConfig();
  }
}