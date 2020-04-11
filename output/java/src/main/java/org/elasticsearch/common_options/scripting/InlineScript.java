
package org.elasticsearch.common_options.scripting;

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


public class InlineScript  implements XContentable<InlineScript> {
  
  static final ParseField SOURCE = new ParseField("source");
  private String _source;
  public String getSource() { return this._source; }
  public InlineScript setSource(String val) { this._source = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public InlineScript fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return InlineScript.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<InlineScript, Void> PARSER =
    new ConstructingObjectParser<>(InlineScript.class.getName(), false, args -> new InlineScript());

  static {
    PARSER.declareString(InlineScript::setSource, SOURCE);
  }

}