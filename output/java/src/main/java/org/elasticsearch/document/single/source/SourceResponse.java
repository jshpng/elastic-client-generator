
package org.elasticsearch.document.single.source;

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


public class SourceResponse<TDocument>  implements XContentable<SourceResponse<TDocument>> {
  
  static final ParseField BODY = new ParseField("body");
  private TDocument _body;
  public TDocument getBody() { return this._body; }
  public SourceResponse<TDocument> setBody(TDocument val) { this._body = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SourceResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SourceResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SourceResponse, Void> PARSER =
    new ConstructingObjectParser<>(SourceResponse.class.getName(), false, args -> new SourceResponse());

  static {
    PARSER.declareObject(SourceResponse::setBody, (p, t) -> null /* TODO TDocument */, BODY);
  }

}