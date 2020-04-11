
package org.elasticsearch.search.search_template.render_search_template;

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
import org.elasticsearch.common_abstractions.lazy_document.*;

public class RenderSearchTemplateResponse  implements XContentable<RenderSearchTemplateResponse> {
  
  static final ParseField TEMPLATE_OUTPUT = new ParseField("template_output");
  private LazyDocument _templateOutput;
  public LazyDocument getTemplateOutput() { return this._templateOutput; }
  public RenderSearchTemplateResponse setTemplateOutput(LazyDocument val) { this._templateOutput = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RenderSearchTemplateResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RenderSearchTemplateResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RenderSearchTemplateResponse, Void> PARSER =
    new ConstructingObjectParser<>(RenderSearchTemplateResponse.class.getName(), false, args -> new RenderSearchTemplateResponse());

  static {
    PARSER.declareObject(RenderSearchTemplateResponse::setTemplateOutput, (p, t) -> LazyDocument.PARSER.apply(p, t), TEMPLATE_OUTPUT);
  }

}