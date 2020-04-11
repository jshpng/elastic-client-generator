
package org.elasticsearch.aggregations.pipeline;

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
import org.elasticsearch.aggregations.pipeline.*;

public class PipelineAggregation  implements XContentable<PipelineAggregation> {
  
  static final ParseField BUCKETS_PATH = new ParseField("buckets_path");
  private BucketsPath _bucketsPath;
  public BucketsPath getBucketsPath() { return this._bucketsPath; }
  public PipelineAggregation setBucketsPath(BucketsPath val) { this._bucketsPath = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public PipelineAggregation setFormat(String val) { this._format = val; return this; }


  static final ParseField GAP_POLICY = new ParseField("gap_policy");
  private GapPolicy _gapPolicy;
  public GapPolicy getGapPolicy() { return this._gapPolicy; }
  public PipelineAggregation setGapPolicy(GapPolicy val) { this._gapPolicy = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PipelineAggregation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PipelineAggregation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PipelineAggregation, Void> PARSER =
    new ConstructingObjectParser<>(PipelineAggregation.class.getName(), false, args -> new PipelineAggregation());

  static {
    PARSER.declareObject(PipelineAggregation::setBucketsPath, (p, t) -> BucketsPath.PARSER.apply(p, t), BUCKETS_PATH);
    PARSER.declareString(PipelineAggregation::setFormat, FORMAT);
    PARSER.declareObject(PipelineAggregation::setGapPolicy, (p, t) -> GapPolicy.PARSER.apply(p), GAP_POLICY);
  }

}