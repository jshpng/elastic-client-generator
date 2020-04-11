
package org.elasticsearch.x_pack.watcher.watcher_stats;

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

public class WatchRecordQueuedStats  implements XContentable<WatchRecordQueuedStats> {
  
  static final ParseField EXECUTION_TIME = new ParseField("execution_time");
  private Date _executionTime;
  public Date getExecutionTime() { return this._executionTime; }
  public WatchRecordQueuedStats setExecutionTime(Date val) { this._executionTime = val; return this; }


  static final ParseField TRIGGERED_TIME = new ParseField("triggered_time");
  private Date _triggeredTime;
  public Date getTriggeredTime() { return this._triggeredTime; }
  public WatchRecordQueuedStats setTriggeredTime(Date val) { this._triggeredTime = val; return this; }


  static final ParseField WATCH_ID = new ParseField("watch_id");
  private String _watchId;
  public String getWatchId() { return this._watchId; }
  public WatchRecordQueuedStats setWatchId(String val) { this._watchId = val; return this; }


  static final ParseField WATCH_RECORD_ID = new ParseField("watch_record_id");
  private String _watchRecordId;
  public String getWatchRecordId() { return this._watchRecordId; }
  public WatchRecordQueuedStats setWatchRecordId(String val) { this._watchRecordId = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public WatchRecordQueuedStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return WatchRecordQueuedStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<WatchRecordQueuedStats, Void> PARSER =
    new ConstructingObjectParser<>(WatchRecordQueuedStats.class.getName(), false, args -> new WatchRecordQueuedStats());

  static {
    PARSER.declareObject(WatchRecordQueuedStats::setExecutionTime, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), EXECUTION_TIME);
    PARSER.declareObject(WatchRecordQueuedStats::setTriggeredTime, (p, t) -> Date.from(Instant.from(DateTimeFormatter.ISO_DATE.parse(p.text()))), TRIGGERED_TIME);
    PARSER.declareString(WatchRecordQueuedStats::setWatchId, WATCH_ID);
    PARSER.declareString(WatchRecordQueuedStats::setWatchRecordId, WATCH_RECORD_ID);
  }

}