
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

public class PipelineSimulation  implements XContentable<PipelineSimulation> {
  
  static final ParseField DOC = new ParseField("doc");
  private DocumentSimulation _doc;
  public DocumentSimulation getDoc() { return this._doc; }
  public PipelineSimulation setDoc(DocumentSimulation val) { this._doc = val; return this; }


  static final ParseField PROCESSOR_RESULTS = new ParseField("processor_results");
  private List<PipelineSimulation> _processorResults;
  public List<PipelineSimulation> getProcessorResults() { return this._processorResults; }
  public PipelineSimulation setProcessorResults(List<PipelineSimulation> val) { this._processorResults = val; return this; }


  static final ParseField TAG = new ParseField("tag");
  private String _tag;
  public String getTag() { return this._tag; }
  public PipelineSimulation setTag(String val) { this._tag = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PipelineSimulation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PipelineSimulation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PipelineSimulation, Void> PARSER =
    new ConstructingObjectParser<>(PipelineSimulation.class.getName(), false, args -> new PipelineSimulation());

  static {
    PARSER.declareObject(PipelineSimulation::setDoc, (p, t) -> DocumentSimulation.PARSER.apply(p, t), DOC);
    PARSER.declareObjectArray(PipelineSimulation::setProcessorResults, (p, t) -> PipelineSimulation.PARSER.apply(p, t), PROCESSOR_RESULTS);
    PARSER.declareString(PipelineSimulation::setTag, TAG);
  }

}