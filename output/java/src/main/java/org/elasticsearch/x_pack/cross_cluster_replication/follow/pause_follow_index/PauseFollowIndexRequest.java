
package org.elasticsearch.x_pack.cross_cluster_replication.follow.pause_follow_index;

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


public class PauseFollowIndexRequest  implements XContentable<PauseFollowIndexRequest> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PauseFollowIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PauseFollowIndexRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PauseFollowIndexRequest, Void> PARSER =
    new ConstructingObjectParser<>(PauseFollowIndexRequest.class.getName(), false, args -> new PauseFollowIndexRequest());

  static {
    
  }

}