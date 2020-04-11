
package org.elasticsearch.x_pack.machine_learning.delete_forecast;

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


public class DeleteForecastResponse  implements XContentable<DeleteForecastResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteForecastResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteForecastResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteForecastResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteForecastResponse.class.getName(), false, args -> new DeleteForecastResponse());

  static {
    
  }

}