
package org.elasticsearch.indices.monitoring.indices_stats;

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
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common.*;

public class IndicesStatsRequest  implements XContentable<IndicesStatsRequest> {
  
  static final ParseField COMPLETION_FIELDS = new ParseField("completion_fields");
  private List<Field> _completionFields;
  public List<Field> getCompletionFields() { return this._completionFields; }
  public IndicesStatsRequest setCompletionFields(List<Field> val) { this._completionFields = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public IndicesStatsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField FIELDDATA_FIELDS = new ParseField("fielddata_fields");
  private List<Field> _fielddataFields;
  public List<Field> getFielddataFields() { return this._fielddataFields; }
  public IndicesStatsRequest setFielddataFields(List<Field> val) { this._fielddataFields = val; return this; }


  static final ParseField FIELDS = new ParseField("fields");
  private List<Field> _fields;
  public List<Field> getFields() { return this._fields; }
  public IndicesStatsRequest setFields(List<Field> val) { this._fields = val; return this; }


  static final ParseField FORBID_CLOSED_INDICES = new ParseField("forbid_closed_indices");
  private Boolean _forbidClosedIndices;
  public Boolean getForbidClosedIndices() { return this._forbidClosedIndices; }
  public IndicesStatsRequest setForbidClosedIndices(Boolean val) { this._forbidClosedIndices = val; return this; }


  static final ParseField GROUPS = new ParseField("groups");
  private List<String> _groups;
  public List<String> getGroups() { return this._groups; }
  public IndicesStatsRequest setGroups(List<String> val) { this._groups = val; return this; }


  static final ParseField INCLUDE_SEGMENT_FILE_SIZES = new ParseField("include_segment_file_sizes");
  private Boolean _includeSegmentFileSizes;
  public Boolean getIncludeSegmentFileSizes() { return this._includeSegmentFileSizes; }
  public IndicesStatsRequest setIncludeSegmentFileSizes(Boolean val) { this._includeSegmentFileSizes = val; return this; }


  static final ParseField INCLUDE_UNLOADED_SEGMENTS = new ParseField("include_unloaded_segments");
  private Boolean _includeUnloadedSegments;
  public Boolean getIncludeUnloadedSegments() { return this._includeUnloadedSegments; }
  public IndicesStatsRequest setIncludeUnloadedSegments(Boolean val) { this._includeUnloadedSegments = val; return this; }


  static final ParseField LEVEL = new ParseField("level");
  private Level _level;
  public Level getLevel() { return this._level; }
  public IndicesStatsRequest setLevel(Level val) { this._level = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IndicesStatsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IndicesStatsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IndicesStatsRequest, Void> PARSER =
    new ConstructingObjectParser<>(IndicesStatsRequest.class.getName(), false, args -> new IndicesStatsRequest());

  static {
    PARSER.declareObjectArray(IndicesStatsRequest::setCompletionFields, (p, t) -> Field.createFrom(p), COMPLETION_FIELDS);
    PARSER.declareObject(IndicesStatsRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS);
    PARSER.declareObjectArray(IndicesStatsRequest::setFielddataFields, (p, t) -> Field.createFrom(p), FIELDDATA_FIELDS);
    PARSER.declareObjectArray(IndicesStatsRequest::setFields, (p, t) -> Field.createFrom(p), FIELDS);
    PARSER.declareBoolean(IndicesStatsRequest::setForbidClosedIndices, FORBID_CLOSED_INDICES);
    PARSER.declareStringArray(IndicesStatsRequest::setGroups, GROUPS);
    PARSER.declareBoolean(IndicesStatsRequest::setIncludeSegmentFileSizes, INCLUDE_SEGMENT_FILE_SIZES);
    PARSER.declareBoolean(IndicesStatsRequest::setIncludeUnloadedSegments, INCLUDE_UNLOADED_SEGMENTS);
    PARSER.declareObject(IndicesStatsRequest::setLevel, (p, t) -> Level.PARSER.apply(p), LEVEL);
  }

}