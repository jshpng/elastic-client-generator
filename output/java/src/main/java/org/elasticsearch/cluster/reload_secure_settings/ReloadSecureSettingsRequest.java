
package org.elasticsearch.cluster.reload_secure_settings;

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
import org.elasticsearch.common_options.time_unit.*;

public class ReloadSecureSettingsRequest  implements XContentable<ReloadSecureSettingsRequest> {
  
  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ReloadSecureSettingsRequest setTimeout(Time val) { this._timeout = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ReloadSecureSettingsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ReloadSecureSettingsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ReloadSecureSettingsRequest, Void> PARSER =
    new ConstructingObjectParser<>(ReloadSecureSettingsRequest.class.getName(), false, args -> new ReloadSecureSettingsRequest());

  static {
    PARSER.declareObject(ReloadSecureSettingsRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, t), TIMEOUT);
  }

}