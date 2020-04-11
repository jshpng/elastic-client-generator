
package org.elasticsearch.analysis.analyzers;

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
import org.elasticsearch.analysis.*;

public class StandardAnalyzer  implements XContentable<StandardAnalyzer> {
  
  static final ParseField MAX_TOKEN_LENGTH = new ParseField("max_token_length");
  private Integer _maxTokenLength;
  public Integer getMaxTokenLength() { return this._maxTokenLength; }
  public StandardAnalyzer setMaxTokenLength(Integer val) { this._maxTokenLength = val; return this; }


  static final ParseField STOPWORDS = new ParseField("stopwords");
  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public StandardAnalyzer setStopwords(StopWords val) { this._stopwords = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public StandardAnalyzer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return StandardAnalyzer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<StandardAnalyzer, Void> PARSER =
    new ConstructingObjectParser<>(StandardAnalyzer.class.getName(), false, args -> new StandardAnalyzer());

  static {
    PARSER.declareInt(StandardAnalyzer::setMaxTokenLength, MAX_TOKEN_LENGTH);
    PARSER.declareObject(StandardAnalyzer::setStopwords, (p, t) -> new StopWords().fromXContent(p), STOPWORDS);
  }

}