
package org.elasticsearch.x_pack.watcher.transform;

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


public class Transform  implements XContentable<Transform> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Transform fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Transform.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Transform, Void> PARSER =
    new ConstructingObjectParser<>(Transform.class.getName(), false, args -> new Transform());

  static {
    
  }

}