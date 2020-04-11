
package org.elasticsearch.x_pack.machine_learning.delete_calendar_event;

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


public class DeleteCalendarEventRequest  implements XContentable<DeleteCalendarEventRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteCalendarEventRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteCalendarEventRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteCalendarEventRequest, Void> PARSER =
    new ConstructingObjectParser<>(DeleteCalendarEventRequest.class.getName(), false, args -> new DeleteCalendarEventRequest());

  static {
    
  }

}