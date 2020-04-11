
package org.elasticsearch.cluster.nodes_info;

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
import org.elasticsearch.cluster.nodes_info.*;
import org.elasticsearch.internal.*;

public class NodeInfoNetwork  implements XContentable<NodeInfoNetwork> {
  
  static final ParseField PRIMARY_INTERFACE = new ParseField("primary_interface");
  private NodeInfoNetworkInterface _primaryInterface;
  public NodeInfoNetworkInterface getPrimaryInterface() { return this._primaryInterface; }
  public NodeInfoNetwork setPrimaryInterface(NodeInfoNetworkInterface val) { this._primaryInterface = val; return this; }


  static final ParseField REFRESH_INTERVAL = new ParseField("refresh_interval");
  private Integer _refreshInterval;
  public Integer getRefreshInterval() { return this._refreshInterval; }
  public NodeInfoNetwork setRefreshInterval(Integer val) { this._refreshInterval = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodeInfoNetwork fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodeInfoNetwork.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodeInfoNetwork, Void> PARSER =
    new ConstructingObjectParser<>(NodeInfoNetwork.class.getName(), false, args -> new NodeInfoNetwork());

  static {
    PARSER.declareObject(NodeInfoNetwork::setPrimaryInterface, (p, t) -> NodeInfoNetworkInterface.PARSER.apply(p, t), PRIMARY_INTERFACE);
    PARSER.declareInt(NodeInfoNetwork::setRefreshInterval, REFRESH_INTERVAL);
  }

}