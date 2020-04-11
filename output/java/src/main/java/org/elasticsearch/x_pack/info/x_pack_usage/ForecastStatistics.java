
package org.elasticsearch.x_pack.info.x_pack_usage;

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
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.info.x_pack_usage.*;

public class ForecastStatistics  implements XContentable<ForecastStatistics> {
  
  static final ParseField FORECASTED_JOBS = new ParseField("forecasted_jobs");
  private Long _forecastedJobs;
  public Long getForecastedJobs() { return this._forecastedJobs; }
  public ForecastStatistics setForecastedJobs(Long val) { this._forecastedJobs = val; return this; }


  static final ParseField MEMORY_BYTES = new ParseField("memory_bytes");
  private JobStatistics _memoryBytes;
  public JobStatistics getMemoryBytes() { return this._memoryBytes; }
  public ForecastStatistics setMemoryBytes(JobStatistics val) { this._memoryBytes = val; return this; }


  static final ParseField PROCESSING_TIME_MS = new ParseField("processing_time_ms");
  private JobStatistics _processingTimeMs;
  public JobStatistics getProcessingTimeMs() { return this._processingTimeMs; }
  public ForecastStatistics setProcessingTimeMs(JobStatistics val) { this._processingTimeMs = val; return this; }


  static final ParseField RECORDS = new ParseField("records");
  private JobStatistics _records;
  public JobStatistics getRecords() { return this._records; }
  public ForecastStatistics setRecords(JobStatistics val) { this._records = val; return this; }


  static final ParseField STATUS = new ParseField("status");
  private NamedContainer<String, Long> _status;
  public NamedContainer<String, Long> getStatus() { return this._status; }
  public ForecastStatistics setStatus(NamedContainer<String, Long> val) { this._status = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Long _total;
  public Long getTotal() { return this._total; }
  public ForecastStatistics setTotal(Long val) { this._total = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ForecastStatistics fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ForecastStatistics.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ForecastStatistics, Void> PARSER =
    new ConstructingObjectParser<>(ForecastStatistics.class.getName(), false, args -> new ForecastStatistics());

  static {
    PARSER.declareLong(ForecastStatistics::setForecastedJobs, FORECASTED_JOBS);
    PARSER.declareObject(ForecastStatistics::setMemoryBytes, (p, t) -> JobStatistics.PARSER.apply(p, t), MEMORY_BYTES);
    PARSER.declareObject(ForecastStatistics::setProcessingTimeMs, (p, t) -> JobStatistics.PARSER.apply(p, t), PROCESSING_TIME_MS);
    PARSER.declareObject(ForecastStatistics::setRecords, (p, t) -> JobStatistics.PARSER.apply(p, t), RECORDS);
    PARSER.declareObject(ForecastStatistics::setStatus, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> pp.longValue()), STATUS);
    PARSER.declareLong(ForecastStatistics::setTotal, TOTAL);
  }

}