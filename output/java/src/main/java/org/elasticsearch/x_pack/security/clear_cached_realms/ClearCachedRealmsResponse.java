
package org.elasticsearch.x_pack.security.clear_cached_realms;

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
import org.elasticsearch.x_pack.security.*;

public class ClearCachedRealmsResponse  implements XContentable<ClearCachedRealmsResponse> {
  
  static final ParseField CLUSTER_NAME = new ParseField("cluster_name");
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public ClearCachedRealmsResponse setClusterName(String val) { this._clusterName = val; return this; }


  static final ParseField NODES = new ParseField("nodes");
  private NamedContainer<String, SecurityNode> _nodes;
  public NamedContainer<String, SecurityNode> getNodes() { return this._nodes; }
  public ClearCachedRealmsResponse setNodes(NamedContainer<String, SecurityNode> val) { this._nodes = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClearCachedRealmsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClearCachedRealmsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClearCachedRealmsResponse, Void> PARSER =
    new ConstructingObjectParser<>(ClearCachedRealmsResponse.class.getName(), false, args -> new ClearCachedRealmsResponse());

  static {
    PARSER.declareString(ClearCachedRealmsResponse::setClusterName, CLUSTER_NAME);
    PARSER.declareObject(ClearCachedRealmsResponse::setNodes, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> SecurityNode.PARSER.apply(pp, null)), NODES);
  }

}