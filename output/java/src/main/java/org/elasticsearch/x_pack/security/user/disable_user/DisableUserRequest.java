
package org.elasticsearch.x_pack.security.user.disable_user;

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
import org.elasticsearch.common.*;

public class DisableUserRequest  implements XContentable<DisableUserRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public DisableUserRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DisableUserRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DisableUserRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DisableUserRequest, Void> PARSER =
    new ConstructingObjectParser<>(DisableUserRequest.class.getName(), false, args -> new DisableUserRequest());

  static {
    PARSER.declareObject(DisableUserRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p), REFRESH);
  }

}