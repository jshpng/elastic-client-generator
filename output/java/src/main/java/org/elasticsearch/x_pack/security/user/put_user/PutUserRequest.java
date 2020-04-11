
package org.elasticsearch.x_pack.security.user.put_user;

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
import org.elasticsearch.common.*;

public class PutUserRequest  implements XContentable<PutUserRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public PutUserRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  static final ParseField EMAIL = new ParseField("email");
  private String _email;
  public String getEmail() { return this._email; }
  public PutUserRequest setEmail(String val) { this._email = val; return this; }


  static final ParseField FULL_NAME = new ParseField("full_name");
  private String _fullName;
  public String getFullName() { return this._fullName; }
  public PutUserRequest setFullName(String val) { this._fullName = val; return this; }


  static final ParseField METADATA = new ParseField("metadata");
  private NamedContainer<String, Object> _metadata;
  public NamedContainer<String, Object> getMetadata() { return this._metadata; }
  public PutUserRequest setMetadata(NamedContainer<String, Object> val) { this._metadata = val; return this; }


  static final ParseField PASSWORD = new ParseField("password");
  private String _password;
  public String getPassword() { return this._password; }
  public PutUserRequest setPassword(String val) { this._password = val; return this; }


  static final ParseField PASSWORD_HASH = new ParseField("password_hash");
  private String _passwordHash;
  public String getPasswordHash() { return this._passwordHash; }
  public PutUserRequest setPasswordHash(String val) { this._passwordHash = val; return this; }


  static final ParseField ROLES = new ParseField("roles");
  private List<String> _roles;
  public List<String> getRoles() { return this._roles; }
  public PutUserRequest setRoles(List<String> val) { this._roles = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutUserRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutUserRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutUserRequest, Void> PARSER =
    new ConstructingObjectParser<>(PutUserRequest.class.getName(), false, args -> new PutUserRequest());

  static {
    PARSER.declareObject(PutUserRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p), REFRESH);
    PARSER.declareString(PutUserRequest::setEmail, EMAIL);
    PARSER.declareString(PutUserRequest::setFullName, FULL_NAME);
    PARSER.declareObject(PutUserRequest::setMetadata, (p, t) -> new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), METADATA);
    PARSER.declareString(PutUserRequest::setPassword, PASSWORD);
    PARSER.declareString(PutUserRequest::setPasswordHash, PASSWORD_HASH);
    PARSER.declareStringArray(PutUserRequest::setRoles, ROLES);
  }

}