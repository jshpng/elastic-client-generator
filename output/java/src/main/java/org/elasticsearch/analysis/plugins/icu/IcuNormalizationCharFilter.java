
package org.elasticsearch.analysis.plugins.icu;

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
import org.elasticsearch.analysis.plugins.icu.normalization.*;

public class IcuNormalizationCharFilter  implements XContentable<IcuNormalizationCharFilter> {
  
  static final ParseField MODE = new ParseField("mode");
  private IcuNormalizationMode _mode;
  public IcuNormalizationMode getMode() { return this._mode; }
  public IcuNormalizationCharFilter setMode(IcuNormalizationMode val) { this._mode = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private IcuNormalizationType _name;
  public IcuNormalizationType getName() { return this._name; }
  public IcuNormalizationCharFilter setName(IcuNormalizationType val) { this._name = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IcuNormalizationCharFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IcuNormalizationCharFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IcuNormalizationCharFilter, Void> PARSER =
    new ConstructingObjectParser<>(IcuNormalizationCharFilter.class.getName(), false, args -> new IcuNormalizationCharFilter());

  static {
    PARSER.declareObject(IcuNormalizationCharFilter::setMode, (p, t) -> IcuNormalizationMode.PARSER.apply(p), MODE);
    PARSER.declareObject(IcuNormalizationCharFilter::setName, (p, t) -> IcuNormalizationType.PARSER.apply(p), NAME);
  }

}