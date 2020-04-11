
package org.elasticsearch.x_pack.machine_learning.put_datafeed;

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
import org.elasticsearch.aggregations.*;
import org.elasticsearch.x_pack.machine_learning.datafeed.*;
import org.elasticsearch.common_options.time_unit.*;
import org.elasticsearch.common_abstractions.infer.indices.*;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.internal.*;

public class PutDatafeedRequest  implements XContentable<PutDatafeedRequest> {
  
  static final ParseField AGGREGATIONS = new ParseField("aggregations");
  private NamedContainer<String, AggregationContainer> _aggregations;
  public NamedContainer<String, AggregationContainer> getAggregations() { return this._aggregations; }
  public PutDatafeedRequest setAggregations(NamedContainer<String, AggregationContainer> val) { this._aggregations = val; return this; }


  static final ParseField CHUNKING_CONFIG = new ParseField("chunking_config");
  private ChunkingConfig _chunkingConfig;
  public ChunkingConfig getChunkingConfig() { return this._chunkingConfig; }
  public PutDatafeedRequest setChunkingConfig(ChunkingConfig val) { this._chunkingConfig = val; return this; }


  static final ParseField FREQUENCY = new ParseField("frequency");
  private Time _frequency;
  public Time getFrequency() { return this._frequency; }
  public PutDatafeedRequest setFrequency(Time val) { this._frequency = val; return this; }


  static final ParseField INDICES = new ParseField("indices");
  private Indices _indices;
  public Indices getIndices() { return this._indices; }
  public PutDatafeedRequest setIndices(Indices val) { this._indices = val; return this; }


  static final ParseField JOB_ID = new ParseField("job_id");
  private Id _jobId;
  public Id getJobId() { return this._jobId; }
  public PutDatafeedRequest setJobId(Id val) { this._jobId = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private QueryContainer _query;
  public QueryContainer getQuery() { return this._query; }
  public PutDatafeedRequest setQuery(QueryContainer val) { this._query = val; return this; }


  static final ParseField QUERY_DELAY = new ParseField("query_delay");
  private Time _queryDelay;
  public Time getQueryDelay() { return this._queryDelay; }
  public PutDatafeedRequest setQueryDelay(Time val) { this._queryDelay = val; return this; }


  static final ParseField SCRIPT_FIELDS = new ParseField("script_fields");
  private NamedContainer<String, ScriptField> _scriptFields;
  public NamedContainer<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public PutDatafeedRequest setScriptFields(NamedContainer<String, ScriptField> val) { this._scriptFields = val; return this; }


  static final ParseField SCROLL_SIZE = new ParseField("scroll_size");
  private Integer _scrollSize;
  public Integer getScrollSize() { return this._scrollSize; }
  public PutDatafeedRequest setScrollSize(Integer val) { this._scrollSize = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutDatafeedRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutDatafeedRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutDatafeedRequest, Void> PARSER =
    new ConstructingObjectParser<>(PutDatafeedRequest.class.getName(), false, args -> new PutDatafeedRequest());

  static {
    PARSER.declareObject(PutDatafeedRequest::setAggregations, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> AggregationContainer.PARSER.apply(pp, null)), AGGREGATIONS);
    PARSER.declareObject(PutDatafeedRequest::setChunkingConfig, (p, t) -> ChunkingConfig.PARSER.apply(p, t), CHUNKING_CONFIG);
    PARSER.declareObject(PutDatafeedRequest::setFrequency, (p, t) -> Time.PARSER.apply(p, t), FREQUENCY);
    PARSER.declareObject(PutDatafeedRequest::setIndices, (p, t) -> Indices.createFrom(p), INDICES);
    PARSER.declareObject(PutDatafeedRequest::setJobId, (p, t) -> Id.createFrom(p), JOB_ID);
    PARSER.declareObject(PutDatafeedRequest::setQuery, (p, t) -> QueryContainer.PARSER.apply(p, t), QUERY);
    PARSER.declareObject(PutDatafeedRequest::setQueryDelay, (p, t) -> Time.PARSER.apply(p, t), QUERY_DELAY);
    PARSER.declareObject(PutDatafeedRequest::setScriptFields, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> ScriptField.PARSER.apply(pp, null)), SCRIPT_FIELDS);
    PARSER.declareInt(PutDatafeedRequest::setScrollSize, SCROLL_SIZE);
  }

}