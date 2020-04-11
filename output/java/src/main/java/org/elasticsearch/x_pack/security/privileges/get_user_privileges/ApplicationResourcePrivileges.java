
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

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


public class ApplicationResourcePrivileges  implements XContentable<ApplicationResourcePrivileges> {
  
  static final ParseField APPLICATION = new ParseField("application");
  private String _application;
  public String getApplication() { return this._application; }
  public ApplicationResourcePrivileges setApplication(String val) { this._application = val; return this; }


  static final ParseField PRIVILEGES = new ParseField("privileges");
  private List<String> _privileges;
  public List<String> getPrivileges() { return this._privileges; }
  public ApplicationResourcePrivileges setPrivileges(List<String> val) { this._privileges = val; return this; }


  static final ParseField RESOURCES = new ParseField("resources");
  private List<String> _resources;
  public List<String> getResources() { return this._resources; }
  public ApplicationResourcePrivileges setResources(List<String> val) { this._resources = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ApplicationResourcePrivileges fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ApplicationResourcePrivileges.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ApplicationResourcePrivileges, Void> PARSER =
    new ConstructingObjectParser<>(ApplicationResourcePrivileges.class.getName(), false, args -> new ApplicationResourcePrivileges());

  static {
    PARSER.declareString(ApplicationResourcePrivileges::setApplication, APPLICATION);
    PARSER.declareStringArray(ApplicationResourcePrivileges::setPrivileges, PRIVILEGES);
    PARSER.declareStringArray(ApplicationResourcePrivileges::setResources, RESOURCES);
  }

}