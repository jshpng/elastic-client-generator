
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info;

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
import org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_info.*;

public class FollowInfoResponse  implements XContentable<FollowInfoResponse> {
  
  static final ParseField FOLLOWER_INDICES = new ParseField("follower_indices");
  private List<FollowerInfo> _followerIndices;
  public List<FollowerInfo> getFollowerIndices() { return this._followerIndices; }
  public FollowInfoResponse setFollowerIndices(List<FollowerInfo> val) { this._followerIndices = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FollowInfoResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FollowInfoResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FollowInfoResponse, Void> PARSER =
    new ConstructingObjectParser<>(FollowInfoResponse.class.getName(), false, args -> new FollowInfoResponse());

  static {
    PARSER.declareObjectArray(FollowInfoResponse::setFollowerIndices, (p, t) -> FollowerInfo.PARSER.apply(p, t), FOLLOWER_INDICES);
  }

}