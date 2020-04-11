
package org.elasticsearch.indices.monitoring.indices_stats;

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

public class ShardFileSizeInfo  implements XContentable<ShardFileSizeInfo> {
  
  static final ParseField DESCRIPTION = new ParseField("description");
  private String _description;
  public String getDescription() { return this._description; }
  public ShardFileSizeInfo setDescription(String val) { this._description = val; return this; }


  static final ParseField SIZE_IN_BYTES = new ParseField("size_in_bytes");
  private Long _sizeInBytes;
  public Long getSizeInBytes() { return this._sizeInBytes; }
  public ShardFileSizeInfo setSizeInBytes(Long val) { this._sizeInBytes = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ShardFileSizeInfo fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ShardFileSizeInfo.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ShardFileSizeInfo, Void> PARSER =
    new ConstructingObjectParser<>(ShardFileSizeInfo.class.getName(), false, args -> new ShardFileSizeInfo());

  static {
    PARSER.declareString(ShardFileSizeInfo::setDescription, DESCRIPTION);
    PARSER.declareLong(ShardFileSizeInfo::setSizeInBytes, SIZE_IN_BYTES);
  }

}