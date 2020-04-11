
package org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats;

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
import org.elasticsearch.x_pack.cross_cluster_replication.follow.follow_index_stats.*;

public class FollowIndexStats  implements XContentable<FollowIndexStats> {
  
  static final ParseField INDEX = new ParseField("index");
  private String _index;
  public String getIndex() { return this._index; }
  public FollowIndexStats setIndex(String val) { this._index = val; return this; }


  static final ParseField SHARDS = new ParseField("shards");
  private List<FollowIndexShardStats> _shards;
  public List<FollowIndexShardStats> getShards() { return this._shards; }
  public FollowIndexStats setShards(List<FollowIndexShardStats> val) { this._shards = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FollowIndexStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FollowIndexStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FollowIndexStats, Void> PARSER =
    new ConstructingObjectParser<>(FollowIndexStats.class.getName(), false, args -> new FollowIndexStats());

  static {
    PARSER.declareString(FollowIndexStats::setIndex, INDEX);
    PARSER.declareObjectArray(FollowIndexStats::setShards, (p, t) -> FollowIndexShardStats.PARSER.apply(p, t), SHARDS);
  }

}