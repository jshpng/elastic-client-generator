
package org.elasticsearch.indices.index_management.open_close_index.open_index;

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


public class OpenIndexResponse  implements XContentable<OpenIndexResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public OpenIndexResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return OpenIndexResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<OpenIndexResponse, Void> PARSER =
    new ConstructingObjectParser<>(OpenIndexResponse.class.getName(), false, args -> new OpenIndexResponse());

  static {
    
  }

}