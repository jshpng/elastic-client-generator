
package org.elasticsearch.indices.monitoring.indices_segments;

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
import org.elasticsearch.common.*;

public class SegmentsRequest  implements XContentable<SegmentsRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public SegmentsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public SegmentsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SegmentsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public SegmentsRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SegmentsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SegmentsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SegmentsRequest, Void> PARSER =
    new ConstructingObjectParser<>(SegmentsRequest.class.getName(), false, args -> new SegmentsRequest());

  static {
    PARSER.declareBoolean(SegmentsRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(SegmentsRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS);
    PARSER.declareBoolean(SegmentsRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(SegmentsRequest::setVerbose, VERBOSE);
  }

}