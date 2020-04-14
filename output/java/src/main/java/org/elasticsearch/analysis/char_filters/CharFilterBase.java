
package org.elasticsearch.analysis.char_filters;

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


public class CharFilterBase  implements XContentable<CharFilterBase> {
  
  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public CharFilterBase setType(String val) { this._type = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private String _version;
  public String getVersion() { return this._version; }
  public CharFilterBase setVersion(String val) { this._version = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(TYPE.getPreferredName(), _type);
    builder.field(VERSION.getPreferredName(), _version);
    builder.endObject();
    return builder;
  }

  @Override
  public CharFilterBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CharFilterBase.PARSER.apply(parser, null);
  }

  public static final ObjectParser<CharFilterBase, Void> PARSER =
    new ObjectParser<>(CharFilterBase.class.getName(), false, CharFilterBase::new);

  static {
    PARSER.declareString(CharFilterBase::setType, TYPE);
    PARSER.declareString(CharFilterBase::setVersion, VERSION);
  }

}
