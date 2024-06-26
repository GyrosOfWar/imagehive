/*
 * This file is generated by jOOQ.
 */
package com.github.gyrosofwar.imagehive.sql.tables.pojos;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public record Album(
  Long id,
  String name,
  String description,
  OffsetDateTime createdOn,
  Long ownerId,
  UUID thumbnailId,
  String[] tags
)
  implements Serializable {
  private static final long serialVersionUID = 1L;
}
