
package org.elasticsearch.indices.index_settings.get_index_settings;

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

public class GetIndexSettingsRequest  implements XContentable<GetIndexSettingsRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public GetIndexSettingsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public GetIndexSettingsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField FLAT_SETTINGS = new ParseField("flat_settings");
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public GetIndexSettingsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public GetIndexSettingsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField INCLUDE_DEFAULTS = new ParseField("include_defaults");
  private Boolean _includeDefaults;
  public Boolean getIncludeDefaults() { return this._includeDefaults; }
  public GetIndexSettingsRequest setIncludeDefaults(Boolean val) { this._includeDefaults = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public GetIndexSettingsRequest setLocal(Boolean val) { this._local = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public GetIndexSettingsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetIndexSettingsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetIndexSettingsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetIndexSettingsRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetIndexSettingsRequest.class.getName(), false, args -> new GetIndexSettingsRequest());

  static {
    PARSER.declareBoolean(GetIndexSettingsRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(GetIndexSettingsRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p), EXPAND_WILDCARDS);
    PARSER.declareBoolean(GetIndexSettingsRequest::setFlatSettings, FLAT_SETTINGS);
    PARSER.declareBoolean(GetIndexSettingsRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(GetIndexSettingsRequest::setIncludeDefaults, INCLUDE_DEFAULTS);
    PARSER.declareBoolean(GetIndexSettingsRequest::setLocal, LOCAL);
    PARSER.declareObject(GetIndexSettingsRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, t), MASTER_TIMEOUT);
  }

}