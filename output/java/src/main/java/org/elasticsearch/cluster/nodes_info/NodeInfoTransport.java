
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


public class NodeInfoTransport  implements XContentable<NodeInfoTransport> {
  
  static final ParseField BOUND_ADDRESS = new ParseField("bound_address");
  private List<String> _boundAddress;
  public List<String> getBoundAddress() { return this._boundAddress; }
  public NodeInfoTransport setBoundAddress(List<String> val) { this._boundAddress = val; return this; }


  static final ParseField PUBLISH_ADDRESS = new ParseField("publish_address");
  private String _publishAddress;
  public String getPublishAddress() { return this._publishAddress; }
  public NodeInfoTransport setPublishAddress(String val) { this._publishAddress = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodeInfoTransport fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodeInfoTransport.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodeInfoTransport, Void> PARSER =
    new ConstructingObjectParser<>(NodeInfoTransport.class.getName(), false, args -> new NodeInfoTransport());

  static {
    PARSER.declareStringArray(NodeInfoTransport::setBoundAddress, BOUND_ADDRESS);
    PARSER.declareString(NodeInfoTransport::setPublishAddress, PUBLISH_ADDRESS);
  }

}