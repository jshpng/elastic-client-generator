
package org.elasticsearch.cat.cat_fielddata;

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
import org.elasticsearch.common_options.time_unit.*;

public class CatFielddataRequest  implements XContentable<CatFielddataRequest> {
  
  static final ParseField BYTES = new ParseField("bytes");
  private Bytes _bytes;
  public Bytes getBytes() { return this._bytes; }
  public CatFielddataRequest setBytes(Bytes val) { this._bytes = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatFielddataRequest setFormat(String val) { this._format = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatFielddataRequest setHeaders(List<String> val) { this._headers = val; return this; }


  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatFielddataRequest setHelp(Boolean val) { this._help = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatFielddataRequest setLocal(Boolean val) { this._local = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatFielddataRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatFielddataRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatFielddataRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatFielddataRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatFielddataRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatFielddataRequest, Void> PARSER =
    new ConstructingObjectParser<>(CatFielddataRequest.class.getName(), false, args -> new CatFielddataRequest());

  static {
    PARSER.declareObject(CatFielddataRequest::setBytes, (p, t) -> Bytes.PARSER.apply(p), BYTES);
    PARSER.declareString(CatFielddataRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatFielddataRequest::setHeaders, HEADERS);
    PARSER.declareBoolean(CatFielddataRequest::setHelp, HELP);
    PARSER.declareBoolean(CatFielddataRequest::setLocal, LOCAL);
    PARSER.declareObject(CatFielddataRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, t), MASTER_TIMEOUT);
    PARSER.declareStringArray(CatFielddataRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatFielddataRequest::setVerbose, VERBOSE);
  }

}