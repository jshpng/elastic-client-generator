
package org.elasticsearch.cluster.cluster_stats;

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

public class ClusterFileSystem  implements XContentable<ClusterFileSystem> {
  
  static final ParseField AVAILABLE_IN_BYTES = new ParseField("available_in_bytes");
  private Long _availableInBytes;
  public Long getAvailableInBytes() { return this._availableInBytes; }
  public ClusterFileSystem setAvailableInBytes(Long val) { this._availableInBytes = val; return this; }


  static final ParseField FREE_IN_BYTES = new ParseField("free_in_bytes");
  private Long _freeInBytes;
  public Long getFreeInBytes() { return this._freeInBytes; }
  public ClusterFileSystem setFreeInBytes(Long val) { this._freeInBytes = val; return this; }


  static final ParseField TOTAL_IN_BYTES = new ParseField("total_in_bytes");
  private Long _totalInBytes;
  public Long getTotalInBytes() { return this._totalInBytes; }
  public ClusterFileSystem setTotalInBytes(Long val) { this._totalInBytes = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterFileSystem fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterFileSystem.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterFileSystem, Void> PARSER =
    new ConstructingObjectParser<>(ClusterFileSystem.class.getName(), false, args -> new ClusterFileSystem());

  static {
    PARSER.declareLong(ClusterFileSystem::setAvailableInBytes, AVAILABLE_IN_BYTES);
    PARSER.declareLong(ClusterFileSystem::setFreeInBytes, FREE_IN_BYTES);
    PARSER.declareLong(ClusterFileSystem::setTotalInBytes, TOTAL_IN_BYTES);
  }

}