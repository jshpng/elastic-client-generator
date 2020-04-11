
package org.elasticsearch.search.count;

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
import org.elasticsearch.common_options.hit.*;

public class CountResponse  implements XContentable<CountResponse> {
  
  static final ParseField COUNT = new ParseField("count");
  private Long _count;
  public Long getCount() { return this._count; }
  public CountResponse setCount(Long val) { this._count = val; return this; }


  static final ParseField SHARDS = new ParseField("_shards");
  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public CountResponse setShards(ShardStatistics val) { this._shards = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CountResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CountResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CountResponse, Void> PARSER =
    new ConstructingObjectParser<>(CountResponse.class.getName(), false, args -> new CountResponse());

  static {
    PARSER.declareLong(CountResponse::setCount, COUNT);
    PARSER.declareObject(CountResponse::setShards, (p, t) -> ShardStatistics.PARSER.apply(p, t), SHARDS);
  }

}