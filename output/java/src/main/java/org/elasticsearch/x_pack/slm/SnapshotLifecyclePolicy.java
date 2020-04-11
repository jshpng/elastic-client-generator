
package org.elasticsearch.x_pack.slm;

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
import org.elasticsearch.x_pack.slm.*;
import org.elasticsearch.x_pack.watcher.schedule.*;

public class SnapshotLifecyclePolicy  implements XContentable<SnapshotLifecyclePolicy> {
  
  static final ParseField CONFIG = new ParseField("config");
  private SnapshotLifecycleConfig _config;
  public SnapshotLifecycleConfig getConfig() { return this._config; }
  public SnapshotLifecyclePolicy setConfig(SnapshotLifecycleConfig val) { this._config = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public SnapshotLifecyclePolicy setName(String val) { this._name = val; return this; }


  static final ParseField REPOSITORY = new ParseField("repository");
  private String _repository;
  public String getRepository() { return this._repository; }
  public SnapshotLifecyclePolicy setRepository(String val) { this._repository = val; return this; }


  static final ParseField SCHEDULE = new ParseField("schedule");
  private CronExpression _schedule;
  public CronExpression getSchedule() { return this._schedule; }
  public SnapshotLifecyclePolicy setSchedule(CronExpression val) { this._schedule = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SnapshotLifecyclePolicy fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SnapshotLifecyclePolicy.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SnapshotLifecyclePolicy, Void> PARSER =
    new ConstructingObjectParser<>(SnapshotLifecyclePolicy.class.getName(), false, args -> new SnapshotLifecyclePolicy());

  static {
    PARSER.declareObject(SnapshotLifecyclePolicy::setConfig, (p, t) -> SnapshotLifecycleConfig.PARSER.apply(p, t), CONFIG);
    PARSER.declareString(SnapshotLifecyclePolicy::setName, NAME);
    PARSER.declareString(SnapshotLifecyclePolicy::setRepository, REPOSITORY);
    PARSER.declareObject(SnapshotLifecyclePolicy::setSchedule, (p, t) -> CronExpression.PARSER.apply(p, t), SCHEDULE);
  }

}