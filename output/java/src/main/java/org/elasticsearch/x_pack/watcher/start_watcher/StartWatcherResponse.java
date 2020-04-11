
package org.elasticsearch.x_pack.watcher.start_watcher;

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


public class StartWatcherResponse  implements XContentable<StartWatcherResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StartWatcherResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StartWatcherResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StartWatcherResponse, Void> PARSER =
    new ConstructingObjectParser<>(StartWatcherResponse.class.getName(), false, args -> new StartWatcherResponse());

  static {
    
  }

}