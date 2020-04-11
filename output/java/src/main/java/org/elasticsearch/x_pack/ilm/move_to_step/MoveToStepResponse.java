
package org.elasticsearch.x_pack.ilm.move_to_step;

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


public class MoveToStepResponse  implements XContentable<MoveToStepResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MoveToStepResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MoveToStepResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MoveToStepResponse, Void> PARSER =
    new ConstructingObjectParser<>(MoveToStepResponse.class.getName(), false, args -> new MoveToStepResponse());

  static {
    
  }

}