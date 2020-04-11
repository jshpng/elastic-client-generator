
package org.elasticsearch.x_pack.machine_learning.validate_detector;

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


public class ValidateDetectorResponse  implements XContentable<ValidateDetectorResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ValidateDetectorResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ValidateDetectorResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ValidateDetectorResponse, Void> PARSER =
    new ConstructingObjectParser<>(ValidateDetectorResponse.class.getName(), false, args -> new ValidateDetectorResponse());

  static {
    
  }

}