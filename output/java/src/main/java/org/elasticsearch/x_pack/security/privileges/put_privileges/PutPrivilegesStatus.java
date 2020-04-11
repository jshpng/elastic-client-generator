
package org.elasticsearch.x_pack.security.privileges.put_privileges;

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


public class PutPrivilegesStatus  implements XContentable<PutPrivilegesStatus> {
  
  static final ParseField CREATED = new ParseField("created");
  private Boolean _created;
  public Boolean getCreated() { return this._created; }
  public PutPrivilegesStatus setCreated(Boolean val) { this._created = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutPrivilegesStatus fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutPrivilegesStatus.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutPrivilegesStatus, Void> PARSER =
    new ConstructingObjectParser<>(PutPrivilegesStatus.class.getName(), false, args -> new PutPrivilegesStatus());

  static {
    PARSER.declareBoolean(PutPrivilegesStatus::setCreated, CREATED);
  }

}