
package org.elasticsearch.cluster.nodes_info;

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
import org.elasticsearch.common_options.time_unit.*;

public class NodesInfoRequest  implements XContentable<NodesInfoRequest> {
  
  static final ParseField FLAT_SETTINGS = new ParseField("flat_settings");
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public NodesInfoRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public NodesInfoRequest setTimeout(Time val) { this._timeout = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodesInfoRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodesInfoRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodesInfoRequest, Void> PARSER =
    new ConstructingObjectParser<>(NodesInfoRequest.class.getName(), false, args -> new NodesInfoRequest());

  static {
    PARSER.declareBoolean(NodesInfoRequest::setFlatSettings, FLAT_SETTINGS);
    PARSER.declareObject(NodesInfoRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
  }

}