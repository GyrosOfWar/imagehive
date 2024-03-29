package com.github.gyrosofwar.imagehive.service.geo;

import jakarta.inject.Singleton;
import mil.nga.sf.geojson.FeatureCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class GeoCodingService {

  private static final Logger log = LoggerFactory.getLogger(GeoCodingService.class);
  private final PhotonApiClient apiClient;

  public GeoCodingService(PhotonApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public FeatureCollection getGeoInformation(Double longitude, Double latitude) {
    try {
      if (latitude != null && longitude != null) {
        return apiClient.reverseGeoCode(latitude, longitude);
      } else {
        return null;
      }
    } catch (Exception e) {
      log.info("failed to fetch geo information for image:", e);
      return null;
    }
  }
}
