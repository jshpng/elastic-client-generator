
package org.elasticsearch.aggregations.pipeline.percentiles_bucket;

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

public class PercentilesBucketAggregation  implements XContentable<PercentilesBucketAggregation> {
  
  static final ParseField PERCENTS = new ParseField("percents");
  private List<Double> _percents;
  public List<Double> getPercents() { return this._percents; }
  public PercentilesBucketAggregation setPercents(List<Double> val) { this._percents = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PercentilesBucketAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PercentilesBucketAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PercentilesBucketAggregation, Void> PARSER =
    new ConstructingObjectParser<>(PercentilesBucketAggregation.class.getName(), false, args -> new PercentilesBucketAggregation());

  static {
    PARSER.declareDoubleArray(PercentilesBucketAggregation::setPercents, PERCENTS);
  }

}