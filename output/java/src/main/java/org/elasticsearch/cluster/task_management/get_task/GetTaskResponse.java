
package org.elasticsearch.cluster.task_management.get_task;

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
import org.elasticsearch.cluster.task_management.get_task.*;

public class GetTaskResponse  implements XContentable<GetTaskResponse> {
  
  static final ParseField COMPLETED = new ParseField("completed");
  private Boolean _completed;
  public Boolean getCompleted() { return this._completed; }
  public GetTaskResponse setCompleted(Boolean val) { this._completed = val; return this; }


  static final ParseField TASK = new ParseField("task");
  private TaskInfo _task;
  public TaskInfo getTask() { return this._task; }
  public GetTaskResponse setTask(TaskInfo val) { this._task = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetTaskResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetTaskResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetTaskResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetTaskResponse.class.getName(), false, args -> new GetTaskResponse());

  static {
    PARSER.declareBoolean(GetTaskResponse::setCompleted, COMPLETED);
    PARSER.declareObject(GetTaskResponse::setTask, (p, t) -> TaskInfo.PARSER.apply(p, t), TASK);
  }

}