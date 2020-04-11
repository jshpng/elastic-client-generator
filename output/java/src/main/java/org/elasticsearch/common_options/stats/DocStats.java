
package org.elasticsearch.common_options.stats;

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

public class DocStats  implements XContentable<DocStats> {
  
  static final ParseField COUNT = new ParseField("count");
  private Long _count;
  public Long getCount() { return this._count; }
  public DocStats setCount(Long val) { this._count = val; return this; }


  static final ParseField DELETED = new ParseField("deleted");
  private Long _deleted;
  public Long getDeleted() { return this._deleted; }
  public DocStats setDeleted(Long val) { this._deleted = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DocStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DocStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DocStats, Void> PARSER =
    new ConstructingObjectParser<>(DocStats.class.getName(), false, args -> new DocStats());

  static {
    PARSER.declareLong(DocStats::setCount, COUNT);
    PARSER.declareLong(DocStats::setDeleted, DELETED);
  }

}