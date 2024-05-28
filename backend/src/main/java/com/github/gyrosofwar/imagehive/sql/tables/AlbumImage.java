/*
 * This file is generated by jOOQ.
 */
package com.github.gyrosofwar.imagehive.sql.tables;


import com.github.gyrosofwar.imagehive.sql.Keys;
import com.github.gyrosofwar.imagehive.sql.Public;
import com.github.gyrosofwar.imagehive.sql.tables.records.AlbumImageRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlbumImage extends TableImpl<AlbumImageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.album_image</code>
     */
    public static final AlbumImage ALBUM_IMAGE = new AlbumImage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AlbumImageRecord> getRecordType() {
        return AlbumImageRecord.class;
    }

    /**
     * The column <code>public.album_image.album_id</code>.
     */
    public final TableField<AlbumImageRecord, Long> ALBUM_ID = createField(DSL.name("album_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.album_image.image_id</code>.
     */
    public final TableField<AlbumImageRecord, UUID> IMAGE_ID = createField(DSL.name("image_id"), SQLDataType.UUID.nullable(false), this, "");

    private AlbumImage(Name alias, Table<AlbumImageRecord> aliased) {
        this(alias, aliased, null);
    }

    private AlbumImage(Name alias, Table<AlbumImageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.album_image</code> table reference
     */
    public AlbumImage(String alias) {
        this(DSL.name(alias), ALBUM_IMAGE);
    }

    /**
     * Create an aliased <code>public.album_image</code> table reference
     */
    public AlbumImage(Name alias) {
        this(alias, ALBUM_IMAGE);
    }

    /**
     * Create a <code>public.album_image</code> table reference
     */
    public AlbumImage() {
        this(DSL.name("album_image"), null);
    }

    public <O extends Record> AlbumImage(Table<O> child, ForeignKey<O, AlbumImageRecord> key) {
        super(child, key, ALBUM_IMAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<UniqueKey<AlbumImageRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.ALBUM_IMAGE_ALBUM_ID_IMAGE_ID_KEY);
    }

    @Override
    public List<ForeignKey<AlbumImageRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ALBUM_IMAGE__ALBUM_IMAGE_ALBUM_ID_FKEY, Keys.ALBUM_IMAGE__ALBUM_IMAGE_IMAGE_ID_FKEY);
    }

    private transient Album _album;
    private transient Image _image;

    /**
     * Get the implicit join path to the <code>public.album</code> table.
     */
    public Album album() {
        if (_album == null)
            _album = new Album(this, Keys.ALBUM_IMAGE__ALBUM_IMAGE_ALBUM_ID_FKEY);

        return _album;
    }

    /**
     * Get the implicit join path to the <code>public.image</code> table.
     */
    public Image image() {
        if (_image == null)
            _image = new Image(this, Keys.ALBUM_IMAGE__ALBUM_IMAGE_IMAGE_ID_FKEY);

        return _image;
    }

    @Override
    public AlbumImage as(String alias) {
        return new AlbumImage(DSL.name(alias), this);
    }

    @Override
    public AlbumImage as(Name alias) {
        return new AlbumImage(alias, this);
    }

    @Override
    public AlbumImage as(Table<?> alias) {
        return new AlbumImage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public AlbumImage rename(String name) {
        return new AlbumImage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AlbumImage rename(Name name) {
        return new AlbumImage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public AlbumImage rename(Table<?> name) {
        return new AlbumImage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super Long, ? super UUID, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super Long, ? super UUID, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
