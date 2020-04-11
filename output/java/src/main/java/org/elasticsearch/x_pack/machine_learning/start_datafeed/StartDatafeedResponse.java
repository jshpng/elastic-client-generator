
package org.elasticsearch.x_pack.machine_learning.start_datafeed;

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


public class StartDatafeedResponse  implements XContentable<StartDatafeedResponse> {
  
  static final ParseField STARTED = new ParseField("started");
  private Boolean _started;
  public Boolean getStarted() { return this._started; }
  public StartDatafeedResponse setStarted(Boolean val) { this._started = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StartDatafeedResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StartDatafeedResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StartDatafeedResponse, Void> PARSER =
    new ConstructingObjectParser<>(StartDatafeedResponse.class.getName(), false, args -> new StartDatafeedResponse());

  static {
    PARSER.declareBoolean(StartDatafeedResponse::setStarted, STARTED);
  }

}