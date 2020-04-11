
package org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status;

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
import org.elasticsearch.modules.snapshot_and_restore.snapshot.snapshot_status.*;

public class SnapshotStatusResponse  implements XContentable<SnapshotStatusResponse> {
  
  static final ParseField SNAPSHOTS = new ParseField("snapshots");
  private List<SnapshotStatus> _snapshots;
  public List<SnapshotStatus> getSnapshots() { return this._snapshots; }
  public SnapshotStatusResponse setSnapshots(List<SnapshotStatus> val) { this._snapshots = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SnapshotStatusResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SnapshotStatusResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SnapshotStatusResponse, Void> PARSER =
    new ConstructingObjectParser<>(SnapshotStatusResponse.class.getName(), false, args -> new SnapshotStatusResponse());

  static {
    PARSER.declareObjectArray(SnapshotStatusResponse::setSnapshots, (p, t) -> SnapshotStatus.PARSER.apply(p, t), SNAPSHOTS);
  }

}