
package org.elasticsearch.x_pack.watcher.execution.index;

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
import org.elasticsearch.x_pack.watcher.execution.index.*;

public class IndexActionResult  implements XContentable<IndexActionResult> {
  
  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public IndexActionResult setId(String val) { this._id = val; return this; }


  static final ParseField RESPONSE = new ParseField("response");
  private IndexActionResultIndexResponse _response;
  public IndexActionResultIndexResponse getResponse() { return this._response; }
  public IndexActionResult setResponse(IndexActionResultIndexResponse val) { this._response = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IndexActionResult fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IndexActionResult.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IndexActionResult, Void> PARSER =
    new ConstructingObjectParser<>(IndexActionResult.class.getName(), false, args -> new IndexActionResult());

  static {
    PARSER.declareString(IndexActionResult::setId, ID);
    PARSER.declareObject(IndexActionResult::setResponse, (p, t) -> IndexActionResultIndexResponse.PARSER.apply(p, t), RESPONSE);
  }

}