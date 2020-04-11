
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


public class IpFilterUsage  implements XContentable<IpFilterUsage> {
  
  static final ParseField HTTP = new ParseField("http");
  private Boolean _http;
  public Boolean getHttp() { return this._http; }
  public IpFilterUsage setHttp(Boolean val) { this._http = val; return this; }


  static final ParseField TRANSPORT = new ParseField("transport");
  private Boolean _transport;
  public Boolean getTransport() { return this._transport; }
  public IpFilterUsage setTransport(Boolean val) { this._transport = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IpFilterUsage fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IpFilterUsage.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IpFilterUsage, Void> PARSER =
    new ConstructingObjectParser<>(IpFilterUsage.class.getName(), false, args -> new IpFilterUsage());

  static {
    PARSER.declareBoolean(IpFilterUsage::setHttp, HTTP);
    PARSER.declareBoolean(IpFilterUsage::setTransport, TRANSPORT);
  }

}