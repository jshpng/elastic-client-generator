
package org.elasticsearch.indices.index_management.rollover_index;

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
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.indices.index_management.rollover_index.*;
import org.elasticsearch.mapping.*;
import org.elasticsearch.common_options.time_unit.*;

public class RolloverIndexRequest  implements XContentable<RolloverIndexRequest> {
  
  static final ParseField ALIASES = new ParseField("aliases");
  private NamedContainer<IndexName, Alias> _aliases;
  public NamedContainer<IndexName, Alias> getAliases() { return this._aliases; }
  public RolloverIndexRequest setAliases(NamedContainer<IndexName, Alias> val) { this._aliases = val; return this; }


  static final ParseField CONDITIONS = new ParseField("conditions");
  private RolloverConditions _conditions;
  public RolloverConditions getConditions() { return this._conditions; }
  public RolloverIndexRequest setConditions(RolloverConditions val) { this._conditions = val; return this; }


  static final ParseField MAPPINGS = new ParseField("mappings");
  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public RolloverIndexRequest setMappings(TypeMapping val) { this._mappings = val; return this; }


  static final ParseField SETTINGS = new ParseField("settings");
  private NamedContainer<String, Object> _settings;
  public NamedContainer<String, Object> getSettings() { return this._settings; }
  public RolloverIndexRequest setSettings(NamedContainer<String, Object> val) { this._settings = val; return this; }


  static final ParseField DRY_RUN = new ParseField("dry_run");
  private Boolean _dryRun;
  public Boolean getDryRun() { return this._dryRun; }
  public RolloverIndexRequest setDryRun(Boolean val) { this._dryRun = val; return this; }


  static final ParseField INCLUDE_TYPE_NAME = new ParseField("include_type_name");
  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public RolloverIndexRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public RolloverIndexRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public RolloverIndexRequest setTimeout(Time val) { this._timeout = val; return this; }


  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public RolloverIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RolloverIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RolloverIndexRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RolloverIndexRequest, Void> PARSER =
    new ConstructingObjectParser<>(RolloverIndexRequest.class.getName(), false, args -> new RolloverIndexRequest());

  static {
    PARSER.declareObject(RolloverIndexRequest::setAliases, (p, t) -> new NamedContainer<>(n -> () -> new IndexName(n),pp -> Alias.PARSER.apply(pp, null)), ALIASES);
    PARSER.declareObject(RolloverIndexRequest::setConditions, (p, t) -> RolloverConditions.PARSER.apply(p, t), CONDITIONS);
    PARSER.declareObject(RolloverIndexRequest::setMappings, (p, t) -> TypeMapping.PARSER.apply(p, t), MAPPINGS);
    PARSER.declareObject(RolloverIndexRequest::setSettings, (p, t) -> new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), SETTINGS);
    PARSER.declareBoolean(RolloverIndexRequest::setDryRun, DRY_RUN);
    PARSER.declareBoolean(RolloverIndexRequest::setIncludeTypeName, INCLUDE_TYPE_NAME);
    PARSER.declareObject(RolloverIndexRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, t), MASTER_TIMEOUT);
    PARSER.declareObject(RolloverIndexRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
    PARSER.declareString(RolloverIndexRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
  }

}