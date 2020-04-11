
package org.elasticsearch.query_dsl.geo;

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
import org.elasticsearch.internal.*;

public class GeoCoordinate  implements XContentable<GeoCoordinate> {
  
  static final ParseField Z = new ParseField("z");
  private Double _z;
  public Double getZ() { return this._z; }
  public GeoCoordinate setZ(Double val) { this._z = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GeoCoordinate fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoCoordinate.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoCoordinate, Void> PARSER =
    new ConstructingObjectParser<>(GeoCoordinate.class.getName(), false, args -> new GeoCoordinate());

  static {
    PARSER.declareDouble(GeoCoordinate::setZ, Z);
  }

}