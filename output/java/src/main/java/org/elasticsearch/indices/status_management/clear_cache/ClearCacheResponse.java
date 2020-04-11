
package org.elasticsearch.indices.status_management.clear_cache;

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


public class ClearCacheResponse  implements XContentable<ClearCacheResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClearCacheResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClearCacheResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClearCacheResponse, Void> PARSER =
    new ConstructingObjectParser<>(ClearCacheResponse.class.getName(), false, args -> new ClearCacheResponse());

  static {
    
  }

}