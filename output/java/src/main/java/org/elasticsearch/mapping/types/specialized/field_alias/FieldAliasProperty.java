
package org.elasticsearch.mapping.types.specialized.field_alias;

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
import org.elasticsearch.common_abstractions.infer.field.*;

public class FieldAliasProperty  implements XContentable<FieldAliasProperty> {
  
  static final ParseField PATH = new ParseField("path");
  private Field _path;
  public Field getPath() { return this._path; }
  public FieldAliasProperty setPath(Field val) { this._path = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FieldAliasProperty fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FieldAliasProperty.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FieldAliasProperty, Void> PARSER =
    new ConstructingObjectParser<>(FieldAliasProperty.class.getName(), false, args -> new FieldAliasProperty());

  static {
    PARSER.declareObject(FieldAliasProperty::setPath, (p, t) -> Field.createFrom(p), PATH);
  }

}