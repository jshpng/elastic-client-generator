
package org.elasticsearch.aggregations.metric.stats;

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


public class StatsAggregation  implements XContentable<StatsAggregation> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StatsAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StatsAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StatsAggregation, Void> PARSER =
    new ConstructingObjectParser<>(StatsAggregation.class.getName(), false, args -> new StatsAggregation());

  static {
    
  }

}