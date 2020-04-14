
package org.elasticsearch.search.search.hits;

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

public class HitMetadata<TDocument>  implements XContentable<HitMetadata<TDocument>> {
  
  static final ParseField ID = new ParseField("_id");
  private String _id;
  public String getId() { return this._id; }
  public HitMetadata<TDocument> setId(String val) { this._id = val; return this; }


  static final ParseField INDEX = new ParseField("_index");
  private String _index;
  public String getIndex() { return this._index; }
  public HitMetadata<TDocument> setIndex(String val) { this._index = val; return this; }


  static final ParseField PRIMARY_TERM = new ParseField("_primary_term");
  private Long _primaryTerm;
  public Long getPrimaryTerm() { return this._primaryTerm; }
  public HitMetadata<TDocument> setPrimaryTerm(Long val) { this._primaryTerm = val; return this; }


  static final ParseField ROUTING = new ParseField("_routing");
  private String _routing;
  public String getRouting() { return this._routing; }
  public HitMetadata<TDocument> setRouting(String val) { this._routing = val; return this; }


  static final ParseField SEQ_NO = new ParseField("_seq_no");
  private Long _seqNo;
  public Long getSeqNo() { return this._seqNo; }
  public HitMetadata<TDocument> setSeqNo(Long val) { this._seqNo = val; return this; }


  static final ParseField SOURCE = new ParseField("_source");
  private TDocument _source;
  public TDocument getSource() { return this._source; }
  public HitMetadata<TDocument> setSource(TDocument val) { this._source = val; return this; }


  static final ParseField TYPE = new ParseField("_type");
  private String _type;
  public String getType() { return this._type; }
  public HitMetadata<TDocument> setType(String val) { this._type = val; return this; }


  static final ParseField VERSION = new ParseField("_version");
  private Long _version;
  public Long getVersion() { return this._version; }
  public HitMetadata<TDocument> setVersion(Long val) { this._version = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.startObject();
    builder.field(ID.getPreferredName(), _id);
    builder.field(INDEX.getPreferredName(), _index);
    builder.field(PRIMARY_TERM.getPreferredName(), _primaryTerm);
    builder.field(ROUTING.getPreferredName(), _routing);
    builder.field(SEQ_NO.getPreferredName(), _seqNo);
    builder.field(SOURCE.getPreferredName(), _source);
    builder.field(TYPE.getPreferredName(), _type);
    builder.field(VERSION.getPreferredName(), _version);
    builder.endObject();
    return builder;
  }

  @Override
  public HitMetadata fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HitMetadata.PARSER.apply(parser, null);
  }

  public static final ObjectParser<HitMetadata, Void> PARSER =
    new ObjectParser<>(HitMetadata.class.getName(), false, HitMetadata::new);

  static {
    PARSER.declareString(HitMetadata::setId, ID);
    PARSER.declareString(HitMetadata::setIndex, INDEX);
    PARSER.declareLong(HitMetadata::setPrimaryTerm, PRIMARY_TERM);
    PARSER.declareString(HitMetadata::setRouting, ROUTING);
    PARSER.declareLong(HitMetadata::setSeqNo, SEQ_NO);
    PARSER.declareObject(HitMetadata::setSource, (p, t) -> null /* TODO TDocument */, SOURCE);
    PARSER.declareString(HitMetadata::setType, TYPE);
    PARSER.declareLong(HitMetadata::setVersion, VERSION);
  }

}
