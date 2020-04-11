
package org.elasticsearch.analysis.tokenizers;

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


public class LetterTokenizer  implements XContentable<LetterTokenizer> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LetterTokenizer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LetterTokenizer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LetterTokenizer, Void> PARSER =
    new ConstructingObjectParser<>(LetterTokenizer.class.getName(), false, args -> new LetterTokenizer());

  static {
    
  }

}