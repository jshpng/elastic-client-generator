
package org.elasticsearch.indices.index_management.shrink_index;

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


public class ShrinkIndexResponse  implements XContentable<ShrinkIndexResponse> {
  
  static final ParseField SHARDS_ACKNOWLEDGED = new ParseField("shards_acknowledged");
  private Boolean _shardsAcknowledged;
  public Boolean getShardsAcknowledged() { return this._shardsAcknowledged; }
  public ShrinkIndexResponse setShardsAcknowledged(Boolean val) { this._shardsAcknowledged = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ShrinkIndexResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShrinkIndexResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShrinkIndexResponse, Void> PARSER =
    new ConstructingObjectParser<>(ShrinkIndexResponse.class.getName(), false, args -> new ShrinkIndexResponse());

  static {
    PARSER.declareBoolean(ShrinkIndexResponse::setShardsAcknowledged, SHARDS_ACKNOWLEDGED);
  }

}