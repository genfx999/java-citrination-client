package io.citrine.jcc.search.pif.query.core;

import io.citrine.jcc.search.core.query.Logic;
import io.citrine.jcc.util.ListUtil;
import io.citrine.jpif.util.PifSerializationUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Query to execute against a file reference field.
 * 
 * @author Kyle Michel
 */
public class FileReferenceQuery extends BaseObjectQuery implements Serializable {

    @Override
    public FileReferenceQuery setLogic(final Logic logic) {
        super.setLogic(logic);
        return this;
    }

    @Override
    public FileReferenceQuery setWeight(final Double weight) {
        super.setWeight(weight);
        return this;
    }

    @Override
    public FileReferenceQuery setSimple(final String simple) {
        super.setSimple(simple);
        return this;
    }

    @Override
    public FileReferenceQuery setSimpleWeight(final Map<String, Double> simpleWeight) {
        super.setSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public FileReferenceQuery addSimpleWeight(final Map<String, Double> simpleWeight) {
        super.addSimpleWeight(simpleWeight);
        return this;
    }

    @Override
    public FileReferenceQuery addSimpleWeight(final String field, final Double weight) {
        super.addSimpleWeight(field, weight);
        return this;
    }

    @Override
    public FileReferenceQuery setExtractAs(final String extractAs) {
        super.setExtractAs(extractAs);
        return this;
    }

    @Override
    public FileReferenceQuery setExtractAll(final Boolean extractAll) {
        super.setExtractAll(extractAll);
        return this;
    }

    @Override
    public FileReferenceQuery setExtractWhenMissing(final Object extractWhenMissing) {
        super.setExtractWhenMissing(extractWhenMissing);
        return this;
    }

    @Override
    public FileReferenceQuery setTags(final List<FieldQuery> tags) {
        super.setTags(tags);
        return this;
    }

    @Override
    public FileReferenceQuery addTags(final List<FieldQuery> tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public FileReferenceQuery addTags(final FieldQuery tags) {
        super.addTags(tags);
        return this;
    }

    @Override
    public FileReferenceQuery setLength(final List<FieldQuery> length) {
        super.setLength(length);
        return this;
    }

    @Override
    public FileReferenceQuery addLength(final List<FieldQuery> length) {
        super.addLength(length);
        return this;
    }

    @Override
    public FileReferenceQuery addLength(final FieldQuery length) {
        super.addLength(length);
        return this;
    }

    @Override
    public FileReferenceQuery setOffset(final List<FieldQuery> offset) {
        super.setOffset(offset);
        return this;
    }

    @Override
    public FileReferenceQuery addOffset(final List<FieldQuery> offset) {
        super.addOffset(offset);
        return this;
    }

    @Override
    public FileReferenceQuery addOffset(final FieldQuery offset) {
        super.addOffset(offset);
        return this;
    }

    /**
     * Set the relativePath operations. This adds to any operations that are already saved.
     *
     * @param relativePath List of {@link FieldQuery} objects.
     * @return This object.
     */
    public FileReferenceQuery setRelativePath(final List<FieldQuery> relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * Add to the list of relativePath operations.
     *
     * @param relativePath {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addRelativePath(final List<FieldQuery> relativePath) {
        this.relativePath = ListUtil.add(relativePath, this.relativePath);
        return this;
    }

    /**
     * Add to the list of relativePath operations.
     *
     * @param relativePath {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addRelativePath(final FieldQuery relativePath) {
        this.relativePath = ListUtil.add(relativePath, this.relativePath);
        return this;
    }

    /**
     * Get the length of the relativePath queries.
     *
     * @return Number of relativePath queries.
     */
    public int relativePathLength() {
        return ListUtil.length(this.relativePath);
    }

    /**
     * Get an iterable over relativePath operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> relativePath() {
        return ListUtil.iterable(this.relativePath);
    }

    /**
     * Get the relativePath query at the input index.
     *
     * @param index Index of the relativePath query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getRelativePath(final int index) {
        return ListUtil.get(this.relativePath, index);
    }

    /**
     * Get the relativePath field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getRelativePath() {
        return this.relativePath;
    }

    /**
     * Set the url operations. This adds to any operations that are already saved.
     *
     * @param url List of {@link FieldQuery} objects.
     * @return This object.
     */
    public FileReferenceQuery setUrl(final List<FieldQuery> url) {
        this.url = url;
        return this;
    }

    /**
     * Add to the list of url operations.
     *
     * @param url {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addUrl(final List<FieldQuery> url) {
        this.url = ListUtil.add(url, this.url);
        return this;
    }

    /**
     * Add to the list of url operations.
     *
     * @param url {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addUrl(final FieldQuery url) {
        this.url = ListUtil.add(url, this.url);
        return this;
    }

    /**
     * Get the length of the url queries.
     *
     * @return Number of url queries.
     */
    public int urlLength() {
        return ListUtil.length(this.url);
    }

    /**
     * Get an iterable over url operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> url() {
        return ListUtil.iterable(this.url);
    }

    /**
     * Get the url query at the input index.
     *
     * @param index Index of the url query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getUrl(final int index) {
        return ListUtil.get(this.url, index);
    }

    /**
     * Get the url field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getUrl() {
        return this.url;
    }

    /**
     * Set the mimeType operations. This adds to any operations that are already saved.
     *
     * @param mimeType List of {@link FieldQuery} objects.
     * @return This object.
     */
    public FileReferenceQuery setMimeType(final List<FieldQuery> mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * Add to the list of mimeType operations.
     *
     * @param mimeType {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addMimeType(final List<FieldQuery> mimeType) {
        this.mimeType = ListUtil.add(mimeType, this.mimeType);
        return this;
    }

    /**
     * Add to the list of mimeType operations.
     *
     * @param mimeType {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addMimeType(final FieldQuery mimeType) {
        this.mimeType = ListUtil.add(mimeType, this.mimeType);
        return this;
    }

    /**
     * Get the length of the mimeType queries.
     *
     * @return Number of mimeType queries.
     */
    public int mimeTypeLength() {
        return ListUtil.length(this.mimeType);
    }

    /**
     * Get an iterable over mimeType operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> mimeType() {
        return ListUtil.iterable(this.mimeType);
    }

    /**
     * Get the mimeType query at the input index.
     *
     * @param index Index of the mimeType query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getMimeType(final int index) {
        return ListUtil.get(this.mimeType, index);
    }

    /**
     * Get the mimeType field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getMimeType() {
        return this.mimeType;
    }

    /**
     * Set the sha256 operations. This adds to any operations that are already saved.
     *
     * @param sha256 List of {@link FieldQuery} objects.
     * @return This object.
     */
    public FileReferenceQuery setSha256(final List<FieldQuery> sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * Add to the list of sha256 operations.
     *
     * @param sha256 {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addSha256(final List<FieldQuery> sha256) {
        this.sha256 = ListUtil.add(sha256, this.sha256);
        return this;
    }

    /**
     * Add to the list of sha256 operations.
     *
     * @param sha256 {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addSha256(final FieldQuery sha256) {
        this.sha256 = ListUtil.add(sha256, this.sha256);
        return this;
    }

    /**
     * Get the length of the sha256 queries.
     *
     * @return Number of sha256 queries.
     */
    public int sha256Length() {
        return ListUtil.length(this.sha256);
    }

    /**
     * Get an iterable over sha256 operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> sha256() {
        return ListUtil.iterable(this.sha256);
    }

    /**
     * Get the sha256 query at the input index.
     *
     * @param index Index of the sha256 query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getSha256(final int index) {
        return ListUtil.get(this.sha256, index);
    }

    /**
     * Get the sha256 field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getSha256() {
        return this.sha256;
    }

    /**
     * Set the md5 operations. This adds to any operations that are already saved.
     *
     * @param md5 List of {@link FieldQuery} objects.
     * @return This object.
     */
    public FileReferenceQuery setMd5(final List<FieldQuery> md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * Add to the list of md5 operations.
     *
     * @param md5 {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addMd5(final List<FieldQuery> md5) {
        this.md5 = ListUtil.add(md5, this.md5);
        return this;
    }

    /**
     * Add to the list of md5 operations.
     *
     * @param md5 {@link FieldQuery} to add.
     * @return This object.
     */
    public FileReferenceQuery addMd5(final FieldQuery md5) {
        this.md5 = ListUtil.add(md5, this.md5);
        return this;
    }

    /**
     * Get the length of the md5 queries.
     *
     * @return Number of md5 queries.
     */
    public int md5Length() {
        return ListUtil.length(this.md5);
    }

    /**
     * Get an iterable over md5 operations.
     *
     * @return Iterable of {@link FieldQuery} objects.
     */
    public Iterable<FieldQuery> md5() {
        return ListUtil.iterable(this.md5);
    }

    /**
     * Get the md5 query at the input index.
     *
     * @param index Index of the md5 query to get.
     * @return {@link FieldQuery} at the input index.
     */
    public FieldQuery getMd5(final int index) {
        return ListUtil.get(this.md5, index);
    }

    /**
     * Get the md5 field queries.
     *
     * @return List of {@link FieldQuery} objects.
     */
    public List<FieldQuery> getMd5() {
        return this.md5;
    }

    /**
     * Set the list of nested queries. This replaces any filters that are already present.
     *
     * @param query List of {@link FileReferenceQuery} objects.
     * @return This object.
     */
    public FileReferenceQuery setQuery(final List<FileReferenceQuery> query) {
        this.query = query;
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query List of {@link FileReferenceQuery} objects.
     * @return This object.
     */
    public FileReferenceQuery addQuery(final List<FileReferenceQuery> query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Add to the list of nested queries.
     *
     * @param query {@link FileReferenceQuery} object to add.
     * @return This object.
     */
    public FileReferenceQuery addQuery(final FileReferenceQuery query) {
        this.query = ListUtil.add(query, this.query);
        return this;
    }

    /**
     * Get the number of nested queries.
     *
     * @return Number of nested queries.
     */
    public int queryLength() {
        return ListUtil.length(this.query);
    }

    /**
     * Get an iterable over the nested queries.
     *
     * @return {@link Iterable} of {@link FileReferenceQuery} objects.
     */
    public Iterable<FileReferenceQuery> query() {
        return ListUtil.iterable(this.query);
    }

    /**
     * Get the nested {@link FileReferenceQuery} object at the input index.
     *
     * @param index Index of the nested query to get.
     * @return {@link FileReferenceQuery} at the input index.
     */
    public FileReferenceQuery getQuery(final int index) {
        return ListUtil.get(this.query, index);
    }

    /**
     * Get the list of PIF system queries.
     *
     * @return List of {@link FileReferenceQuery} objects.
     */
    public List<FileReferenceQuery> getQuery() {
        return this.query;
    }

    @Override
    public boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if ((rhs == null) || !(rhs instanceof FileReferenceQuery)) {
            return false;
        }
        final FileReferenceQuery rhsQuery = (FileReferenceQuery) rhs;
        return super.equals(rhsQuery)
                && Optional.ofNullable(this.relativePath).equals(Optional.ofNullable(rhsQuery.relativePath))
                && Optional.ofNullable(this.mimeType).equals(Optional.ofNullable(rhsQuery.mimeType))
                && Optional.ofNullable(this.sha256).equals(Optional.ofNullable(rhsQuery.sha256))
                && Optional.ofNullable(this.md5).equals(Optional.ofNullable(rhsQuery.md5))
                && Optional.ofNullable(this.query).equals(Optional.ofNullable(rhsQuery.query));
    }

    /**
     * Write this object to the output output stream.
     *
     * @param out {@link ObjectOutputStream} to write to.
     * @throws IOException if this object cannot be written.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        PifSerializationUtil.write(out, this);
    }

    /**
     * Read into this object from the input stream.
     *
     * @param in {@link ObjectInputStream} to read from.
     * @throws IOException if thrown while reading the stream.
     * @throws ClassNotFoundException if thrown while reading the stream.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        PifSerializationUtil.read(in, this);
    }

    /**
     * Read an object with no data.
     *
     * @throws ObjectStreamException if thrown while reading the stream.
     */
    private void readObjectNoData() throws ObjectStreamException {}

    private static final long serialVersionUID = 1207655058249346149L;

    /** Operations against the relative path. */
    private List<FieldQuery> relativePath;

    /** Operations against the url. */
    private List<FieldQuery> url;

    /** Operation against the mimetype. */
    private List<FieldQuery> mimeType;

    /** Operation against the sha256 hash. */
    private List<FieldQuery> sha256;
    
    /** Operations against the md5 sum. */
    private List<FieldQuery> md5;
    
    /** Nested list of queries. */
    private List<FileReferenceQuery> query;
}
