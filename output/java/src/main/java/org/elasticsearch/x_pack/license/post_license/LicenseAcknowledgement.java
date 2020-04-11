
package org.elasticsearch.x_pack.license.post_license;

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


public class LicenseAcknowledgement  implements XContentable<LicenseAcknowledgement> {
  
  static final ParseField LICENSE = new ParseField("license");
  private List<String> _license;
  public List<String> getLicense() { return this._license; }
  public LicenseAcknowledgement setLicense(List<String> val) { this._license = val; return this; }


  static final ParseField MESSAGE = new ParseField("message");
  private String _message;
  public String getMessage() { return this._message; }
  public LicenseAcknowledgement setMessage(String val) { this._message = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LicenseAcknowledgement fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LicenseAcknowledgement.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LicenseAcknowledgement, Void> PARSER =
    new ConstructingObjectParser<>(LicenseAcknowledgement.class.getName(), false, args -> new LicenseAcknowledgement());

  static {
    PARSER.declareStringArray(LicenseAcknowledgement::setLicense, LICENSE);
    PARSER.declareString(LicenseAcknowledgement::setMessage, MESSAGE);
  }

}