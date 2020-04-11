
package org.elasticsearch.query_dsl.specialized.pinned;

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
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.query_dsl.abstractions.container.*;

public class PinnedQuery  implements XContentable<PinnedQuery> {
  
  static final ParseField IDS = new ParseField("ids");
  private List<Id> _ids;
  public List<Id> getIds() { return this._ids; }
  public PinnedQuery setIds(List<Id> val) { this._ids = val; return this; }


  static final ParseField ORGANIC = new ParseField("organic");
  private QueryContainer _organic;
  public QueryContainer getOrganic() { return this._organic; }
  public PinnedQuery setOrganic(QueryContainer val) { this._organic = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PinnedQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PinnedQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PinnedQuery, Void> PARSER =
    new ConstructingObjectParser<>(PinnedQuery.class.getName(), false, args -> new PinnedQuery());

  static {
    PARSER.declareObjectArray(PinnedQuery::setIds, (p, t) -> Id.createFrom(p), IDS);
    PARSER.declareObject(PinnedQuery::setOrganic, (p, t) -> QueryContainer.PARSER.apply(p, t), ORGANIC);
  }

}