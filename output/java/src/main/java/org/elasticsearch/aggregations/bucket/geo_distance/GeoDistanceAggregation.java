
package org.elasticsearch.aggregations.bucket.geo_distance;

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
import org.elasticsearch.common_options.geo.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.query_dsl.geo.*;
import org.elasticsearch.common_options.range.*;

public class GeoDistanceAggregation  implements XContentable<GeoDistanceAggregation> {
  
  static final ParseField DISTANCE_TYPE = new ParseField("distance_type");
  private GeoDistanceType _distanceType;
  public GeoDistanceType getDistanceType() { return this._distanceType; }
  public GeoDistanceAggregation setDistanceType(GeoDistanceType val) { this._distanceType = val; return this; }


  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public GeoDistanceAggregation setField(Field val) { this._field = val; return this; }


  static final ParseField ORIGIN = new ParseField("origin");
  private GeoLocation _origin;
  public GeoLocation getOrigin() { return this._origin; }
  public GeoDistanceAggregation setOrigin(GeoLocation val) { this._origin = val; return this; }


  static final ParseField RANGES = new ParseField("ranges");
  private List<AggregationRange> _ranges;
  public List<AggregationRange> getRanges() { return this._ranges; }
  public GeoDistanceAggregation setRanges(List<AggregationRange> val) { this._ranges = val; return this; }


  static final ParseField UNIT = new ParseField("unit");
  private DistanceUnit _unit;
  public DistanceUnit getUnit() { return this._unit; }
  public GeoDistanceAggregation setUnit(DistanceUnit val) { this._unit = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GeoDistanceAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoDistanceAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoDistanceAggregation, Void> PARSER =
    new ConstructingObjectParser<>(GeoDistanceAggregation.class.getName(), false, args -> new GeoDistanceAggregation());

  static {
    PARSER.declareObject(GeoDistanceAggregation::setDistanceType, (p, t) -> GeoDistanceType.PARSER.apply(p), DISTANCE_TYPE);
    PARSER.declareObject(GeoDistanceAggregation::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareObject(GeoDistanceAggregation::setOrigin, (p, t) -> GeoLocation.PARSER.apply(p, t), ORIGIN);
    PARSER.declareObjectArray(GeoDistanceAggregation::setRanges, (p, t) -> AggregationRange.PARSER.apply(p, t), RANGES);
    PARSER.declareObject(GeoDistanceAggregation::setUnit, (p, t) -> DistanceUnit.PARSER.apply(p), UNIT);
  }

}