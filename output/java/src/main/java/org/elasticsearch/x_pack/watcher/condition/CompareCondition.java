
package org.elasticsearch.x_pack.watcher.condition;

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


public class CompareCondition  implements XContentable<CompareCondition> {
  
  static final ParseField COMPARISON = new ParseField("comparison");
  private String _comparison;
  public String getComparison() { return this._comparison; }
  public CompareCondition setComparison(String val) { this._comparison = val; return this; }


  static final ParseField PATH = new ParseField("path");
  private String _path;
  public String getPath() { return this._path; }
  public CompareCondition setPath(String val) { this._path = val; return this; }


  static final ParseField VALUE = new ParseField("value");
  private Object _value;
  public Object getValue() { return this._value; }
  public CompareCondition setValue(Object val) { this._value = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CompareCondition fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CompareCondition.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CompareCondition, Void> PARSER =
    new ConstructingObjectParser<>(CompareCondition.class.getName(), false, args -> new CompareCondition());

  static {
    PARSER.declareString(CompareCondition::setComparison, COMPARISON);
    PARSER.declareString(CompareCondition::setPath, PATH);
    PARSER.declareObject(CompareCondition::setValue, (p, t) -> p.objectText(), VALUE);
  }

}