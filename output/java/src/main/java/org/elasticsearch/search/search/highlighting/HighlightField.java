
package org.elasticsearch.search.search.highlighting;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.highlighting.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class HighlightField  implements XContentable<HighlightField> {
  
  static final ParseField BOUNDARY_CHARS = new ParseField("boundary_chars");
  private String _boundaryChars;
  public String getBoundaryChars() { return this._boundaryChars; }
  public HighlightField setBoundaryChars(String val) { this._boundaryChars = val; return this; }


  static final ParseField BOUNDARY_MAX_SCAN = new ParseField("boundary_max_scan");
  private Integer _boundaryMaxScan;
  public Integer getBoundaryMaxScan() { return this._boundaryMaxScan; }
  public HighlightField setBoundaryMaxScan(Integer val) { this._boundaryMaxScan = val; return this; }


  static final ParseField BOUNDARY_SCANNER = new ParseField("boundary_scanner");
  private BoundaryScanner _boundaryScanner;
  public BoundaryScanner getBoundaryScanner() { return this._boundaryScanner; }
  public HighlightField setBoundaryScanner(BoundaryScanner val) { this._boundaryScanner = val; return this; }


  static final ParseField BOUNDARY_SCANNER_LOCALE = new ParseField("boundary_scanner_locale");
  private String _boundaryScannerLocale;
  public String getBoundaryScannerLocale() { return this._boundaryScannerLocale; }
  public HighlightField setBoundaryScannerLocale(String val) { this._boundaryScannerLocale = val; return this; }


  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public HighlightField setField(Field val) { this._field = val; return this; }


  static final ParseField FORCE_SOURCE = new ParseField("force_source");
  private Boolean _forceSource;
  public Boolean getForceSource() { return this._forceSource; }
  public HighlightField setForceSource(Boolean val) { this._forceSource = val; return this; }


  static final ParseField FRAGMENTER = new ParseField("fragmenter");
  private HighlighterFragmenter _fragmenter;
  public HighlighterFragmenter getFragmenter() { return this._fragmenter; }
  public HighlightField setFragmenter(HighlighterFragmenter val) { this._fragmenter = val; return this; }


  static final ParseField FRAGMENT_OFFSET = new ParseField("fragment_offset");
  private Integer _fragmentOffset;
  public Integer getFragmentOffset() { return this._fragmentOffset; }
  public HighlightField setFragmentOffset(Integer val) { this._fragmentOffset = val; return this; }


  static final ParseField FRAGMENT_SIZE = new ParseField("fragment_size");
  private Integer _fragmentSize;
  public Integer getFragmentSize() { return this._fragmentSize; }
  public HighlightField setFragmentSize(Integer val) { this._fragmentSize = val; return this; }


  static final ParseField HIGHLIGHT_QUERY = new ParseField("highlight_query");
  private QueryContainer _highlightQuery;
  public QueryContainer getHighlightQuery() { return this._highlightQuery; }
  public HighlightField setHighlightQuery(QueryContainer val) { this._highlightQuery = val; return this; }


  static final ParseField MATCHED_FIELDS = new ParseField("matched_fields");
  private List<Field> _matchedFields;
  public List<Field> getMatchedFields() { return this._matchedFields; }
  public HighlightField setMatchedFields(List<Field> val) { this._matchedFields = val; return this; }


  static final ParseField MAX_FRAGMENT_LENGTH = new ParseField("max_fragment_length");
  private Integer _maxFragmentLength;
  public Integer getMaxFragmentLength() { return this._maxFragmentLength; }
  public HighlightField setMaxFragmentLength(Integer val) { this._maxFragmentLength = val; return this; }


  static final ParseField NO_MATCH_SIZE = new ParseField("no_match_size");
  private Integer _noMatchSize;
  public Integer getNoMatchSize() { return this._noMatchSize; }
  public HighlightField setNoMatchSize(Integer val) { this._noMatchSize = val; return this; }


  static final ParseField NUMBER_OF_FRAGMENTS = new ParseField("number_of_fragments");
  private Integer _numberOfFragments;
  public Integer getNumberOfFragments() { return this._numberOfFragments; }
  public HighlightField setNumberOfFragments(Integer val) { this._numberOfFragments = val; return this; }


  static final ParseField ORDER = new ParseField("order");
  private HighlighterOrder _order;
  public HighlighterOrder getOrder() { return this._order; }
  public HighlightField setOrder(HighlighterOrder val) { this._order = val; return this; }


  static final ParseField PHRASE_LIMIT = new ParseField("phrase_limit");
  private Integer _phraseLimit;
  public Integer getPhraseLimit() { return this._phraseLimit; }
  public HighlightField setPhraseLimit(Integer val) { this._phraseLimit = val; return this; }


  static final ParseField POST_TAGS = new ParseField("post_tags");
  private List<String> _postTags;
  public List<String> getPostTags() { return this._postTags; }
  public HighlightField setPostTags(List<String> val) { this._postTags = val; return this; }


  static final ParseField PRE_TAGS = new ParseField("pre_tags");
  private List<String> _preTags;
  public List<String> getPreTags() { return this._preTags; }
  public HighlightField setPreTags(List<String> val) { this._preTags = val; return this; }


  static final ParseField REQUIRE_FIELD_MATCH = new ParseField("require_field_match");
  private Boolean _requireFieldMatch;
  public Boolean getRequireFieldMatch() { return this._requireFieldMatch; }
  public HighlightField setRequireFieldMatch(Boolean val) { this._requireFieldMatch = val; return this; }


  static final ParseField TAGS_SCHEMA = new ParseField("tags_schema");
  private HighlighterTagsSchema _tagsSchema;
  public HighlighterTagsSchema getTagsSchema() { return this._tagsSchema; }
  public HighlightField setTagsSchema(HighlighterTagsSchema val) { this._tagsSchema = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private Either<HighlighterType, String> _type;
  public Either<HighlighterType, String> getType() { return this._type; }
  public HighlightField setType(Either<HighlighterType, String> val) { this._type = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public HighlightField fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HighlightField.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HighlightField, Void> PARSER =
    new ConstructingObjectParser<>(HighlightField.class.getName(), false, args -> new HighlightField());

  static {
    PARSER.declareString(HighlightField::setBoundaryChars, BOUNDARY_CHARS);
    PARSER.declareInt(HighlightField::setBoundaryMaxScan, BOUNDARY_MAX_SCAN);
    PARSER.declareObject(HighlightField::setBoundaryScanner, (p, t) -> BoundaryScanner.PARSER.apply(p), BOUNDARY_SCANNER);
    PARSER.declareString(HighlightField::setBoundaryScannerLocale, BOUNDARY_SCANNER_LOCALE);
    PARSER.declareObject(HighlightField::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareBoolean(HighlightField::setForceSource, FORCE_SOURCE);
    PARSER.declareObject(HighlightField::setFragmenter, (p, t) -> HighlighterFragmenter.PARSER.apply(p), FRAGMENTER);
    PARSER.declareInt(HighlightField::setFragmentOffset, FRAGMENT_OFFSET);
    PARSER.declareInt(HighlightField::setFragmentSize, FRAGMENT_SIZE);
    PARSER.declareObject(HighlightField::setHighlightQuery, (p, t) -> QueryContainer.PARSER.apply(p, t), HIGHLIGHT_QUERY);
    PARSER.declareObjectArray(HighlightField::setMatchedFields, (p, t) -> Field.createFrom(p), MATCHED_FIELDS);
    PARSER.declareInt(HighlightField::setMaxFragmentLength, MAX_FRAGMENT_LENGTH);
    PARSER.declareInt(HighlightField::setNoMatchSize, NO_MATCH_SIZE);
    PARSER.declareInt(HighlightField::setNumberOfFragments, NUMBER_OF_FRAGMENTS);
    PARSER.declareObject(HighlightField::setOrder, (p, t) -> HighlighterOrder.PARSER.apply(p), ORDER);
    PARSER.declareInt(HighlightField::setPhraseLimit, PHRASE_LIMIT);
    PARSER.declareStringArray(HighlightField::setPostTags, POST_TAGS);
    PARSER.declareStringArray(HighlightField::setPreTags, PRE_TAGS);
    PARSER.declareBoolean(HighlightField::setRequireFieldMatch, REQUIRE_FIELD_MATCH);
    PARSER.declareObject(HighlightField::setTagsSchema, (p, t) -> HighlighterTagsSchema.PARSER.apply(p), TAGS_SCHEMA);
    PARSER.declareObject(HighlightField::setType, (p, t) ->  new Either<HighlighterType, String>() /* TODO UnionOf */, TYPE);
  }

}