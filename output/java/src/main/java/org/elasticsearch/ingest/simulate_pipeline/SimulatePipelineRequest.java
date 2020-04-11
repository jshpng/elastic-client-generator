
package org.elasticsearch.ingest.simulate_pipeline;

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
import org.elasticsearch.ingest.simulate_pipeline.*;
import org.elasticsearch.ingest.*;

public class SimulatePipelineRequest  implements XContentable<SimulatePipelineRequest> {
  
  static final ParseField DOCS = new ParseField("docs");
  private List<SimulatePipelineDocument> _docs;
  public List<SimulatePipelineDocument> getDocs() { return this._docs; }
  public SimulatePipelineRequest setDocs(List<SimulatePipelineDocument> val) { this._docs = val; return this; }


  static final ParseField PIPELINE = new ParseField("pipeline");
  private Pipeline _pipeline;
  public Pipeline getPipeline() { return this._pipeline; }
  public SimulatePipelineRequest setPipeline(Pipeline val) { this._pipeline = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public SimulatePipelineRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SimulatePipelineRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SimulatePipelineRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SimulatePipelineRequest, Void> PARSER =
    new ConstructingObjectParser<>(SimulatePipelineRequest.class.getName(), false, args -> new SimulatePipelineRequest());

  static {
    PARSER.declareObjectArray(SimulatePipelineRequest::setDocs, (p, t) -> SimulatePipelineDocument.PARSER.apply(p, t), DOCS);
    PARSER.declareObject(SimulatePipelineRequest::setPipeline, (p, t) -> Pipeline.PARSER.apply(p, t), PIPELINE);
    PARSER.declareBoolean(SimulatePipelineRequest::setVerbose, VERBOSE);
  }

}