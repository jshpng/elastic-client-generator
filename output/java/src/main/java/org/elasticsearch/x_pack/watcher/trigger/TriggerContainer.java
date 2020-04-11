
package org.elasticsearch.x_pack.watcher.trigger;

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
import org.elasticsearch.x_pack.watcher.schedule.*;

public class TriggerContainer  implements XContentable<TriggerContainer> {
  
  static final ParseField SCHEDULE = new ParseField("schedule");
  private ScheduleContainer _schedule;
  public ScheduleContainer getSchedule() { return this._schedule; }
  public TriggerContainer setSchedule(ScheduleContainer val) { this._schedule = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TriggerContainer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TriggerContainer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TriggerContainer, Void> PARSER =
    new ConstructingObjectParser<>(TriggerContainer.class.getName(), false, args -> new TriggerContainer());

  static {
    PARSER.declareObject(TriggerContainer::setSchedule, (p, t) -> ScheduleContainer.PARSER.apply(p, t), SCHEDULE);
  }

}