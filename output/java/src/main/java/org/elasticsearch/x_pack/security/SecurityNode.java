
package org.elasticsearch.x_pack.security;

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


public class SecurityNode  implements XContentable<SecurityNode> {
  
  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public SecurityNode setName(String val) { this._name = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SecurityNode fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SecurityNode.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SecurityNode, Void> PARSER =
    new ConstructingObjectParser<>(SecurityNode.class.getName(), false, args -> new SecurityNode());

  static {
    PARSER.declareString(SecurityNode::setName, NAME);
  }

}