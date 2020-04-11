
package org.elasticsearch.indices.monitoring.indices_shard_stores;

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
import org.elasticsearch.indices.monitoring.indices_shard_stores.*;
import org.elasticsearch.internal.*;

public class ShardStore  implements XContentable<ShardStore> {
  
  static final ParseField ALLOCATION = new ParseField("allocation");
  private ShardStoreAllocation _allocation;
  public ShardStoreAllocation getAllocation() { return this._allocation; }
  public ShardStore setAllocation(ShardStoreAllocation val) { this._allocation = val; return this; }


  static final ParseField ALLOCATION_ID = new ParseField("allocation_id");
  private String _allocationId;
  public String getAllocationId() { return this._allocationId; }
  public ShardStore setAllocationId(String val) { this._allocationId = val; return this; }


  static final ParseField ATTRIBUTES = new ParseField("attributes");
  private NamedContainer<String, Object> _attributes;
  public NamedContainer<String, Object> getAttributes() { return this._attributes; }
  public ShardStore setAttributes(NamedContainer<String, Object> val) { this._attributes = val; return this; }


  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public ShardStore setId(String val) { this._id = val; return this; }


  static final ParseField LEGACY_VERSION = new ParseField("legacy_version");
  private Long _legacyVersion;
  public Long getLegacyVersion() { return this._legacyVersion; }
  public ShardStore setLegacyVersion(Long val) { this._legacyVersion = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public ShardStore setName(String val) { this._name = val; return this; }


  static final ParseField STORE_EXCEPTION = new ParseField("store_exception");
  private ShardStoreException _storeException;
  public ShardStoreException getStoreException() { return this._storeException; }
  public ShardStore setStoreException(ShardStoreException val) { this._storeException = val; return this; }


  static final ParseField TRANSPORT_ADDRESS = new ParseField("transport_address");
  private String _transportAddress;
  public String getTransportAddress() { return this._transportAddress; }
  public ShardStore setTransportAddress(String val) { this._transportAddress = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ShardStore fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardStore.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardStore, Void> PARSER =
    new ConstructingObjectParser<>(ShardStore.class.getName(), false, args -> new ShardStore());

  static {
    PARSER.declareObject(ShardStore::setAllocation, (p, t) -> ShardStoreAllocation.PARSER.apply(p), ALLOCATION);
    PARSER.declareString(ShardStore::setAllocationId, ALLOCATION_ID);
    PARSER.declareObject(ShardStore::setAttributes, (p, t) -> new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), ATTRIBUTES);
    PARSER.declareString(ShardStore::setId, ID);
    PARSER.declareLong(ShardStore::setLegacyVersion, LEGACY_VERSION);
    PARSER.declareString(ShardStore::setName, NAME);
    PARSER.declareObject(ShardStore::setStoreException, (p, t) -> ShardStoreException.PARSER.apply(p, t), STORE_EXCEPTION);
    PARSER.declareString(ShardStore::setTransportAddress, TRANSPORT_ADDRESS);
  }

}