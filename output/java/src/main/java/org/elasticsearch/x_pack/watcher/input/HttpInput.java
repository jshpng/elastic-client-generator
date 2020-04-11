
package org.elasticsearch.x_pack.watcher.input;

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
import org.elasticsearch.x_pack.watcher.input.*;

public class HttpInput  implements XContentable<HttpInput> {
  
  static final ParseField EXTRACT = new ParseField("extract");
  private List<String> _extract;
  public List<String> getExtract() { return this._extract; }
  public HttpInput setExtract(List<String> val) { this._extract = val; return this; }


  static final ParseField REQUEST = new ParseField("request");
  private HttpInputRequest _request;
  public HttpInputRequest getRequest() { return this._request; }
  public HttpInput setRequest(HttpInputRequest val) { this._request = val; return this; }


  static final ParseField RESPONSE_CONTENT_TYPE = new ParseField("response_content_type");
  private ResponseContentType _responseContentType;
  public ResponseContentType getResponseContentType() { return this._responseContentType; }
  public HttpInput setResponseContentType(ResponseContentType val) { this._responseContentType = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public HttpInput fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HttpInput.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HttpInput, Void> PARSER =
    new ConstructingObjectParser<>(HttpInput.class.getName(), false, args -> new HttpInput());

  static {
    PARSER.declareStringArray(HttpInput::setExtract, EXTRACT);
    PARSER.declareObject(HttpInput::setRequest, (p, t) -> HttpInputRequest.PARSER.apply(p, t), REQUEST);
    PARSER.declareObject(HttpInput::setResponseContentType, (p, t) -> ResponseContentType.PARSER.apply(p), RESPONSE_CONTENT_TYPE);
  }

}