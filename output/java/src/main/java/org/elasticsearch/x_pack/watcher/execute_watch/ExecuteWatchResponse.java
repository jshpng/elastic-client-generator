
package org.elasticsearch.x_pack.watcher.execute_watch;

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
import org.elasticsearch.x_pack.watcher.execute_watch.*;

public class ExecuteWatchResponse  implements XContentable<ExecuteWatchResponse> {
  
  static final ParseField ID = new ParseField("_id");
  private String _id;
  public String getId() { return this._id; }
  public ExecuteWatchResponse setId(String val) { this._id = val; return this; }


  static final ParseField WATCH_RECORD = new ParseField("watch_record");
  private WatchRecord _watchRecord;
  public WatchRecord getWatchRecord() { return this._watchRecord; }
  public ExecuteWatchResponse setWatchRecord(WatchRecord val) { this._watchRecord = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExecuteWatchResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExecuteWatchResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExecuteWatchResponse, Void> PARSER =
    new ConstructingObjectParser<>(ExecuteWatchResponse.class.getName(), false, args -> new ExecuteWatchResponse());

  static {
    PARSER.declareString(ExecuteWatchResponse::setId, ID);
    PARSER.declareObject(ExecuteWatchResponse::setWatchRecord, (p, t) -> WatchRecord.PARSER.apply(p, t), WATCH_RECORD);
  }

}