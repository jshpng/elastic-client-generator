
package org.elasticsearch.cluster.cluster_allocation_explain;

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
import org.elasticsearch.cluster.cluster_allocation_explain.*;
import org.elasticsearch.internal.*;

public class NodeAllocationExplanation  implements XContentable<NodeAllocationExplanation> {
  
  static final ParseField DECIDERS = new ParseField("deciders");
  private List<AllocationDecision> _deciders;
  public List<AllocationDecision> getDeciders() { return this._deciders; }
  public NodeAllocationExplanation setDeciders(List<AllocationDecision> val) { this._deciders = val; return this; }


  static final ParseField NODE_ATTRIBUTES = new ParseField("node_attributes");
  private NamedContainer<String, String> _nodeAttributes;
  public NamedContainer<String, String> getNodeAttributes() { return this._nodeAttributes; }
  public NodeAllocationExplanation setNodeAttributes(NamedContainer<String, String> val) { this._nodeAttributes = val; return this; }


  static final ParseField NODE_DECISION = new ParseField("node_decision");
  private Decision _nodeDecision;
  public Decision getNodeDecision() { return this._nodeDecision; }
  public NodeAllocationExplanation setNodeDecision(Decision val) { this._nodeDecision = val; return this; }


  static final ParseField NODE_ID = new ParseField("node_id");
  private String _nodeId;
  public String getNodeId() { return this._nodeId; }
  public NodeAllocationExplanation setNodeId(String val) { this._nodeId = val; return this; }


  static final ParseField NODE_NAME = new ParseField("node_name");
  private String _nodeName;
  public String getNodeName() { return this._nodeName; }
  public NodeAllocationExplanation setNodeName(String val) { this._nodeName = val; return this; }


  static final ParseField STORE = new ParseField("store");
  private AllocationStore _store;
  public AllocationStore getStore() { return this._store; }
  public NodeAllocationExplanation setStore(AllocationStore val) { this._store = val; return this; }


  static final ParseField TRANSPORT_ADDRESS = new ParseField("transport_address");
  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public NodeAllocationExplanation setTransportAddress(String val) { this._transportAddress = val; return this; }


  static final ParseField WEIGHT_RANKING = new ParseField("weight_ranking");
  private Integer _weightRanking;
  public Integer getWeightRanking() { return this._weightRanking; }
  public NodeAllocationExplanation setWeightRanking(Integer val) { this._weightRanking = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodeAllocationExplanation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodeAllocationExplanation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodeAllocationExplanation, Void> PARSER =
    new ConstructingObjectParser<>(NodeAllocationExplanation.class.getName(), false, args -> new NodeAllocationExplanation());

  static {
    PARSER.declareObjectArray(NodeAllocationExplanation::setDeciders, (p, t) -> AllocationDecision.PARSER.apply(p, t), DECIDERS);
    PARSER.declareObject(NodeAllocationExplanation::setNodeAttributes, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> pp.text()), NODE_ATTRIBUTES);
    PARSER.declareObject(NodeAllocationExplanation::setNodeDecision, (p, t) -> Decision.PARSER.apply(p), NODE_DECISION);
    PARSER.declareString(NodeAllocationExplanation::setNodeId, NODE_ID);
    PARSER.declareString(NodeAllocationExplanation::setNodeName, NODE_NAME);
    PARSER.declareObject(NodeAllocationExplanation::setStore, (p, t) -> AllocationStore.PARSER.apply(p, t), STORE);
    PARSER.declareString(NodeAllocationExplanation::setTransportAddress, TRANSPORT_ADDRESS);
    PARSER.declareInt(NodeAllocationExplanation::setWeightRanking, WEIGHT_RANKING);
  }

}