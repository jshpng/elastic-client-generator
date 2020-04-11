
package org.elasticsearch.indices.analyze;

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


public class CharFilterDetail  implements XContentable<CharFilterDetail> {
  
  static final ParseField FILTERED_TEXT = new ParseField("filtered_text");
  private List<String> _filteredText;
  public List<String> getFilteredText() { return this._filteredText; }
  public CharFilterDetail setFilteredText(List<String> val) { this._filteredText = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public CharFilterDetail setName(String val) { this._name = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CharFilterDetail fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CharFilterDetail.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CharFilterDetail, Void> PARSER =
    new ConstructingObjectParser<>(CharFilterDetail.class.getName(), false, args -> new CharFilterDetail());

  static {
    PARSER.declareStringArray(CharFilterDetail::setFilteredText, FILTERED_TEXT);
    PARSER.declareString(CharFilterDetail::setName, NAME);
  }

}