
package org.elasticsearch.common_abstractions.response;

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


public class DynamicResponseBase  implements XContentable<DynamicResponseBase> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DynamicResponseBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DynamicResponseBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DynamicResponseBase, Void> PARSER =
    new ConstructingObjectParser<>(DynamicResponseBase.class.getName(), false, args -> new DynamicResponseBase());

  static {
    
  }

}