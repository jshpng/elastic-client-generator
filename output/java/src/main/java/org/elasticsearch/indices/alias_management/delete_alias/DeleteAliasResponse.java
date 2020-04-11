
package org.elasticsearch.indices.alias_management.delete_alias;

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


public class DeleteAliasResponse  implements XContentable<DeleteAliasResponse> {
  

  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteAliasResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteAliasResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteAliasResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteAliasResponse.class.getName(), false, args -> new DeleteAliasResponse());

  static {
    
  }

}