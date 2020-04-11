
package org.elasticsearch.x_pack.security.role.get_role;

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
import org.elasticsearch.x_pack.security.role.get_role.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetRoleResponse extends DictionaryResponseBase<String, XPackRole> implements XContentable<GetRoleResponse> {
  
  static final ParseField ROLES = new ParseField("roles");
  private NamedContainer<String, XPackRole> _roles;
  public NamedContainer<String, XPackRole> getRoles() { return this._roles; }
  public GetRoleResponse setRoles(NamedContainer<String, XPackRole> val) { this._roles = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetRoleResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRoleResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetRoleResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetRoleResponse.class.getName(), false, args -> new GetRoleResponse());

  static {
    PARSER.declareObject(GetRoleResponse::setRoles, (p, t) -> new NamedContainer<>(n -> () -> n,pp -> XPackRole.PARSER.apply(pp, null)), ROLES);
  }

}