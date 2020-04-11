
package org.elasticsearch.x_pack.cross_cluster_replication.auto_follow.create_auto_follow_pattern;

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


public class CreateAutoFollowPatternResponse  implements XContentable<CreateAutoFollowPatternResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CreateAutoFollowPatternResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CreateAutoFollowPatternResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CreateAutoFollowPatternResponse, Void> PARSER =
    new ConstructingObjectParser<>(CreateAutoFollowPatternResponse.class.getName(), false, args -> new CreateAutoFollowPatternResponse());

  static {
    
  }

}