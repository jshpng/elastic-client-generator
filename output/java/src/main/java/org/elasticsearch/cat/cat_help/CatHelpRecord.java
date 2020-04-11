
package org.elasticsearch.cat.cat_help;

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


public class CatHelpRecord  implements XContentable<CatHelpRecord> {
  
  static final ParseField ENDPOINT = new ParseField("endpoint");
  private String _endpoint;
  public String getEndpoint() { return this._endpoint; }
  public CatHelpRecord setEndpoint(String val) { this._endpoint = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatHelpRecord fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatHelpRecord.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatHelpRecord, Void> PARSER =
    new ConstructingObjectParser<>(CatHelpRecord.class.getName(), false, args -> new CatHelpRecord());

  static {
    PARSER.declareString(CatHelpRecord::setEndpoint, ENDPOINT);
  }

}