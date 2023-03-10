package com.github.gyrosofwar.imagehive.configuration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.gyrosofwar.imagehive.BaseTest;
import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

@MicronautTest
public class ImageHiveConfigurationTest extends BaseTest {

  @Test
  public void testImageHiveConfiguration() {
    Map<String, Object> config = new HashMap<>();
    config.put("imagehive.image-base-path", "images");

    ApplicationContext ctx = ApplicationContext.run(config);
    ImageHiveConfiguration imageHiveConfiguration = ctx.getBean(ImageHiveConfiguration.class);

    assertEquals("images", imageHiveConfiguration.imageBasePath());
  }
}
