
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
import org.elasticsearch.internal.*;

public class ExtendedMemoryStats  implements XContentable<ExtendedMemoryStats> {
  
  static final ParseField FREE_PERCENT = new ParseField("free_percent");
  private Integer _freePercent;
  public Integer getFreePercent() { return this._freePercent; }
  public ExtendedMemoryStats setFreePercent(Integer val) { this._freePercent = val; return this; }


  static final ParseField USED_PERCENT = new ParseField("used_percent");
  private Integer _usedPercent;
  public Integer getUsedPercent() { return this._usedPercent; }
  public ExtendedMemoryStats setUsedPercent(Integer val) { this._usedPercent = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExtendedMemoryStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExtendedMemoryStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExtendedMemoryStats, Void> PARSER =
    new ConstructingObjectParser<>(ExtendedMemoryStats.class.getName(), false, args -> new ExtendedMemoryStats());

  static {
    PARSER.declareInt(ExtendedMemoryStats::setFreePercent, FREE_PERCENT);
    PARSER.declareInt(ExtendedMemoryStats::setUsedPercent, USED_PERCENT);
  }

}