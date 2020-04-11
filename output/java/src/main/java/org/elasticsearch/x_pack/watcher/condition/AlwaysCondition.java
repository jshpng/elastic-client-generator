
package org.elasticsearch.x_pack.watcher.condition;

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


public class AlwaysCondition  implements XContentable<AlwaysCondition> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public AlwaysCondition fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return AlwaysCondition.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<AlwaysCondition, Void> PARSER =
    new ConstructingObjectParser<>(AlwaysCondition.class.getName(), false, args -> new AlwaysCondition());

  static {
    
  }

}