
package org.elasticsearch.indices.status_management.synced_flush;

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

public class SyncedFlushRequest  implements XContentable<SyncedFlushRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public SyncedFlushRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public SyncedFlushRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public SyncedFlushRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SyncedFlushRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SyncedFlushRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SyncedFlushRequest, Void> PARSER =
    new ConstructingObjectParser<>(SyncedFlushRequest.class.getName(), false, args -> new SyncedFlushRequest());

  static {
    PARSER.declareBoolean(SyncedFlushRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(SyncedFlushRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS);
    PARSER.declareBoolean(SyncedFlushRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
  }

}