
package org.elasticsearch.aggregations.pipeline.sum_bucket;

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


public class SumBucketAggregation  implements XContentable<SumBucketAggregation> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SumBucketAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SumBucketAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SumBucketAggregation, Void> PARSER =
    new ConstructingObjectParser<>(SumBucketAggregation.class.getName(), false, args -> new SumBucketAggregation());

  static {
    
  }

}