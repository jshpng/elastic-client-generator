
package org.elasticsearch.query_dsl.geo.distance;

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
import org.elasticsearch.query_dsl.geo.*;

public class GeoDistanceQuery  implements XContentable<GeoDistanceQuery> {
  
  static final ParseField DISTANCE = new ParseField("distance");
  private Distance _distance;
  public Distance getDistance() { return this._distance; }
  public GeoDistanceQuery setDistance(Distance val) { this._distance = val; return this; }


  static final ParseField DISTANCE_TYPE = new ParseField("distance_type");
  private GeoDistanceType _distanceType;
  public GeoDistanceType getDistanceType() { return this._distanceType; }
  public GeoDistanceQuery setDistanceType(GeoDistanceType val) { this._distanceType = val; return this; }


  static final ParseField LOCATION = new ParseField("location");
  private GeoLocation _location;
  public GeoLocation getLocation() { return this._location; }
  public GeoDistanceQuery setLocation(GeoLocation val) { this._location = val; return this; }


  static final ParseField VALIDATION_METHOD = new ParseField("validation_method");
  private GeoValidationMethod _validationMethod;
  public GeoValidationMethod getValidationMethod() { return this._validationMethod; }
  public GeoDistanceQuery setValidationMethod(GeoValidationMethod val) { this._validationMethod = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GeoDistanceQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GeoDistanceQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GeoDistanceQuery, Void> PARSER =
    new ConstructingObjectParser<>(GeoDistanceQuery.class.getName(), false, args -> new GeoDistanceQuery());

  static {
    PARSER.declareObject(GeoDistanceQuery::setDistance, (p, t) -> Distance.PARSER.apply(p, t), DISTANCE);
    PARSER.declareObject(GeoDistanceQuery::setDistanceType, (p, t) -> GeoDistanceType.PARSER.apply(p), DISTANCE_TYPE);
    PARSER.declareObject(GeoDistanceQuery::setLocation, (p, t) -> GeoLocation.PARSER.apply(p, t), LOCATION);
    PARSER.declareObject(GeoDistanceQuery::setValidationMethod, (p, t) -> GeoValidationMethod.PARSER.apply(p), VALIDATION_METHOD);
  }

}