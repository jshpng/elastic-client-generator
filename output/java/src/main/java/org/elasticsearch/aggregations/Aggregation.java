
package org.elasticsearch.aggregations;

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


public class Aggregation  implements XContentable<Aggregation> {
  
  static final ParseField META = new ParseField("meta");
  private NamedContainer<String, Object> _meta;
  public NamedContainer<String, Object> getMeta() { return this._meta; }
  public Aggregation setMeta(NamedContainer<String, Object> val) { this._meta = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public Aggregation setName(String val) { this._name = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Aggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Aggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Aggregation, Void> PARSER =
    new ConstructingObjectParser<>(Aggregation.class.getName(), false, args -> new Aggregation());

  static {
    PARSER.declareObject(Aggregation::setMeta, (p, t) -> new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), META);
    PARSER.declareString(Aggregation::setName, NAME);
  }

}