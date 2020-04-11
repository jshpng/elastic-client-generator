
package org.elasticsearch.query_dsl.full_text.intervals;

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
import org.elasticsearch.common_abstractions.infer.field.*;

public class IntervalsWildcard  implements XContentable<IntervalsWildcard> {
  
  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public IntervalsWildcard setAnalyzer(String val) { this._analyzer = val; return this; }


  static final ParseField PATTERN = new ParseField("pattern");
  private String _pattern;
  public String getPattern() { return this._pattern; }
  public IntervalsWildcard setPattern(String val) { this._pattern = val; return this; }


  static final ParseField USE_FIELD = new ParseField("use_field");
  private Field _useField;
  public Field getUseField() { return this._useField; }
  public IntervalsWildcard setUseField(Field val) { this._useField = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IntervalsWildcard fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IntervalsWildcard.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IntervalsWildcard, Void> PARSER =
    new ConstructingObjectParser<>(IntervalsWildcard.class.getName(), false, args -> new IntervalsWildcard());

  static {
    PARSER.declareString(IntervalsWildcard::setAnalyzer, ANALYZER);
    PARSER.declareString(IntervalsWildcard::setPattern, PATTERN);
    PARSER.declareObject(IntervalsWildcard::setUseField, (p, t) -> Field.createFrom(p), USE_FIELD);
  }

}