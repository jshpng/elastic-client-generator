
package org.elasticsearch.common_abstractions.lazy_document;

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


public class LazyDocument  implements XContentable<LazyDocument> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LazyDocument fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LazyDocument.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LazyDocument, Void> PARSER =
    new ConstructingObjectParser<>(LazyDocument.class.getName(), false, args -> new LazyDocument());

  static {
    
  }

}