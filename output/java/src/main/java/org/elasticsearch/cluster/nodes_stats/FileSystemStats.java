
package org.elasticsearch.cluster.nodes_stats;

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
import org.elasticsearch.cluster.nodes_stats.*;
import org.elasticsearch.internal.*;

public class FileSystemStats  implements XContentable<FileSystemStats> {
  
  static final ParseField DATA = new ParseField("data");
  private List<DataPathStats> _data;
  public List<DataPathStats> getData() { return this._data; }
  public FileSystemStats setData(List<DataPathStats> val) { this._data = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Long _timestamp;
  public Long getTimestamp() { return this._timestamp; }
  public FileSystemStats setTimestamp(Long val) { this._timestamp = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private TotalFileSystemStats _total;
  public TotalFileSystemStats getTotal() { return this._total; }
  public FileSystemStats setTotal(TotalFileSystemStats val) { this._total = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FileSystemStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FileSystemStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FileSystemStats, Void> PARSER =
    new ConstructingObjectParser<>(FileSystemStats.class.getName(), false, args -> new FileSystemStats());

  static {
    PARSER.declareObjectArray(FileSystemStats::setData, (p, t) -> DataPathStats.PARSER.apply(p, t), DATA);
    PARSER.declareLong(FileSystemStats::setTimestamp, TIMESTAMP);
    PARSER.declareObject(FileSystemStats::setTotal, (p, t) -> TotalFileSystemStats.PARSER.apply(p, t), TOTAL);
  }

}