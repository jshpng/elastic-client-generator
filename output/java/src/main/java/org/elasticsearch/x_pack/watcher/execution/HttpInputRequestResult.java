
package org.elasticsearch.x_pack.watcher.execution;

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


public class HttpInputRequestResult  implements XContentable<HttpInputRequestResult> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public HttpInputRequestResult fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HttpInputRequestResult.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HttpInputRequestResult, Void> PARSER =
    new ConstructingObjectParser<>(HttpInputRequestResult.class.getName(), false, args -> new HttpInputRequestResult());

  static {
    
  }

}