
package org.elasticsearch.x_pack.sql.translate_sql;

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
import org.elasticsearch.search.search.*;

public class TranslateSqlResponse  implements XContentable<TranslateSqlResponse> {
  
  static final ParseField RESULT = new ParseField("result");
  private SearchRequest _result;
  public SearchRequest getResult() { return this._result; }
  public TranslateSqlResponse setResult(SearchRequest val) { this._result = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TranslateSqlResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TranslateSqlResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TranslateSqlResponse, Void> PARSER =
    new ConstructingObjectParser<>(TranslateSqlResponse.class.getName(), false, args -> new TranslateSqlResponse());

  static {
    PARSER.declareObject(TranslateSqlResponse::setResult, (p, t) -> SearchRequest.PARSER.apply(p, t), RESULT);
  }

}