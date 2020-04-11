
package org.elasticsearch.x_pack.cross_cluster_replication.follow.unfollow_index;

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


public class UnfollowIndexResponse  implements XContentable<UnfollowIndexResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UnfollowIndexResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UnfollowIndexResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UnfollowIndexResponse, Void> PARSER =
    new ConstructingObjectParser<>(UnfollowIndexResponse.class.getName(), false, args -> new UnfollowIndexResponse());

  static {
    
  }

}