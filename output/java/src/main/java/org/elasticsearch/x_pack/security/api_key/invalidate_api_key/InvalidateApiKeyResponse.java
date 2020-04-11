
package org.elasticsearch.x_pack.security.api_key.invalidate_api_key;

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
import org.elasticsearch.common.*;

public class InvalidateApiKeyResponse  implements XContentable<InvalidateApiKeyResponse> {
  
  static final ParseField ERROR_COUNT = new ParseField("error_count");
  private Integer _errorCount;
  public Integer getErrorCount() { return this._errorCount; }
  public InvalidateApiKeyResponse setErrorCount(Integer val) { this._errorCount = val; return this; }


  static final ParseField ERROR_DETAILS = new ParseField("error_details");
  private List<ErrorCause> _errorDetails;
  public List<ErrorCause> getErrorDetails() { return this._errorDetails; }
  public InvalidateApiKeyResponse setErrorDetails(List<ErrorCause> val) { this._errorDetails = val; return this; }


  static final ParseField INVALIDATED_API_KEYS = new ParseField("invalidated_api_keys");
  private List<String> _invalidatedApiKeys;
  public List<String> getInvalidatedApiKeys() { return this._invalidatedApiKeys; }
  public InvalidateApiKeyResponse setInvalidatedApiKeys(List<String> val) { this._invalidatedApiKeys = val; return this; }


  static final ParseField PREVIOUSLY_INVALIDATED_API_KEYS = new ParseField("previously_invalidated_api_keys");
  private List<String> _previouslyInvalidatedApiKeys;
  public List<String> getPreviouslyInvalidatedApiKeys() { return this._previouslyInvalidatedApiKeys; }
  public InvalidateApiKeyResponse setPreviouslyInvalidatedApiKeys(List<String> val) { this._previouslyInvalidatedApiKeys = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public InvalidateApiKeyResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return InvalidateApiKeyResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<InvalidateApiKeyResponse, Void> PARSER =
    new ConstructingObjectParser<>(InvalidateApiKeyResponse.class.getName(), false, args -> new InvalidateApiKeyResponse());

  static {
    PARSER.declareInt(InvalidateApiKeyResponse::setErrorCount, ERROR_COUNT);
    PARSER.declareObjectArray(InvalidateApiKeyResponse::setErrorDetails, (p, t) -> ErrorCause.PARSER.apply(p, t), ERROR_DETAILS);
    PARSER.declareStringArray(InvalidateApiKeyResponse::setInvalidatedApiKeys, INVALIDATED_API_KEYS);
    PARSER.declareStringArray(InvalidateApiKeyResponse::setPreviouslyInvalidatedApiKeys, PREVIOUSLY_INVALIDATED_API_KEYS);
  }

}