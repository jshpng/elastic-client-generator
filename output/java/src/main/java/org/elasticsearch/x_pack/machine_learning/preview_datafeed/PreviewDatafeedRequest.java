
package org.elasticsearch.x_pack.machine_learning.preview_datafeed;

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


public class PreviewDatafeedRequest  implements XContentable<PreviewDatafeedRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PreviewDatafeedRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PreviewDatafeedRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PreviewDatafeedRequest, Void> PARSER =
    new ConstructingObjectParser<>(PreviewDatafeedRequest.class.getName(), false, args -> new PreviewDatafeedRequest());

  static {
    
  }

}