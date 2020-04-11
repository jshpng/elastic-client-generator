
package org.elasticsearch.x_pack.machine_learning.delete_datafeed;

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


public class DeleteDatafeedResponse  implements XContentable<DeleteDatafeedResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteDatafeedResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteDatafeedResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteDatafeedResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteDatafeedResponse.class.getName(), false, args -> new DeleteDatafeedResponse());

  static {
    
  }

}