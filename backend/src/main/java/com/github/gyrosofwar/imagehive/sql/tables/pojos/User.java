/*
 * This file is generated by jOOQ.
 */
package com.github.gyrosofwar.imagehive.sql.tables.pojos;

import java.io.Serializable;
import java.time.OffsetDateTime;
import org.jooq.JSONB;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public record User(
  Long id,
  String username,
  String email,
  String passwordHash,
  Boolean admin,
  String totpSecret,
  JSONB userSettings,
  OffsetDateTime createdOn,
  OffsetDateTime lastLogin
)
  implements Serializable {
  private static final long serialVersionUID = 1L;
}
