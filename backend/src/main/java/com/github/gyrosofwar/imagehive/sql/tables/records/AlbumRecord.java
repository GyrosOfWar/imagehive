/*
 * This file is generated by jOOQ.
 */
package com.github.gyrosofwar.imagehive.sql.tables.records;


import com.github.gyrosofwar.imagehive.sql.tables.Album;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlbumRecord extends UpdatableRecordImpl<AlbumRecord> implements Record8<Long, String, String, OffsetDateTime, Long, UUID, String[], Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.album.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.album.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.album.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.album.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.album.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.album.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.album.created_on</code>.
     */
    public void setCreatedOn(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.album.created_on</code>.
     */
    public OffsetDateTime getCreatedOn() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>public.album.owner_id</code>.
     */
    public void setOwnerId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.album.owner_id</code>.
     */
    public Long getOwnerId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.album.thumbnail_id</code>.
     */
    public void setThumbnailId(UUID value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.album.thumbnail_id</code>.
     */
    public UUID getThumbnailId() {
        return (UUID) get(5);
    }

    /**
     * Setter for <code>public.album.tags</code>.
     */
    public void setTags(String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.album.tags</code>.
     */
    public String[] getTags() {
        return (String[]) get(6);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setTsVec(Object value) {
        set(7, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getTsVec() {
        return get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, OffsetDateTime, Long, UUID, String[], Object> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, String, OffsetDateTime, Long, UUID, String[], Object> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Album.ALBUM.ID;
    }

    @Override
    public Field<String> field2() {
        return Album.ALBUM.NAME;
    }

    @Override
    public Field<String> field3() {
        return Album.ALBUM.DESCRIPTION;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return Album.ALBUM.CREATED_ON;
    }

    @Override
    public Field<Long> field5() {
        return Album.ALBUM.OWNER_ID;
    }

    @Override
    public Field<UUID> field6() {
        return Album.ALBUM.THUMBNAIL_ID;
    }

    @Override
    public Field<String[]> field7() {
        return Album.ALBUM.TAGS;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field8() {
        return Album.ALBUM.TS_VEC;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public OffsetDateTime component4() {
        return getCreatedOn();
    }

    @Override
    public Long component5() {
        return getOwnerId();
    }

    @Override
    public UUID component6() {
        return getThumbnailId();
    }

    @Override
    public String[] component7() {
        return getTags();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component8() {
        return getTsVec();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public OffsetDateTime value4() {
        return getCreatedOn();
    }

    @Override
    public Long value5() {
        return getOwnerId();
    }

    @Override
    public UUID value6() {
        return getThumbnailId();
    }

    @Override
    public String[] value7() {
        return getTags();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value8() {
        return getTsVec();
    }

    @Override
    public AlbumRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AlbumRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AlbumRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public AlbumRecord value4(OffsetDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public AlbumRecord value5(Long value) {
        setOwnerId(value);
        return this;
    }

    @Override
    public AlbumRecord value6(UUID value) {
        setThumbnailId(value);
        return this;
    }

    @Override
    public AlbumRecord value7(String[] value) {
        setTags(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public AlbumRecord value8(Object value) {
        setTsVec(value);
        return this;
    }

    @Override
    public AlbumRecord values(Long value1, String value2, String value3, OffsetDateTime value4, Long value5, UUID value6, String[] value7, Object value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AlbumRecord
     */
    public AlbumRecord() {
        super(Album.ALBUM);
    }

    /**
     * Create a detached, initialised AlbumRecord
     */
    public AlbumRecord(Long id, String name, String description, OffsetDateTime createdOn, Long ownerId, UUID thumbnailId, String[] tags, Object tsVec) {
        super(Album.ALBUM);

        setId(id);
        setName(name);
        setDescription(description);
        setCreatedOn(createdOn);
        setOwnerId(ownerId);
        setThumbnailId(thumbnailId);
        setTags(tags);
        setTsVec(tsVec);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AlbumRecord
     */
    public AlbumRecord(com.github.gyrosofwar.imagehive.sql.tables.pojos.Album value) {
        super(Album.ALBUM);

        if (value != null) {
            setId(value.id());
            setName(value.name());
            setDescription(value.description());
            setCreatedOn(value.createdOn());
            setOwnerId(value.ownerId());
            setThumbnailId(value.thumbnailId());
            setTags(value.tags());
            setTsVec(value.tsVec());
            resetChangedOnNotNull();
        }
    }
}
