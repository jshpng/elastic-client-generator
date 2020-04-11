
package org.elasticsearch.x_pack.machine_learning.job.detectors;

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
import org.elasticsearch.x_pack.machine_learning.job.detectors.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.machine_learning.put_job.*;

public class Detector  implements XContentable<Detector> {
  
  static final ParseField CUSTOM_RULES = new ParseField("custom_rules");
  private List<DetectionRule> _customRules;
  public List<DetectionRule> getCustomRules() { return this._customRules; }
  public Detector setCustomRules(List<DetectionRule> val) { this._customRules = val; return this; }


  static final ParseField DETECTOR_DESCRIPTION = new ParseField("detector_description");
  private String _detectorDescription;
  public String getDetectorDescription() { return this._detectorDescription; }
  public Detector setDetectorDescription(String val) { this._detectorDescription = val; return this; }


  static final ParseField DETECTOR_INDEX = new ParseField("detector_index");
  private Integer _detectorIndex;
  public Integer getDetectorIndex() { return this._detectorIndex; }
  public Detector setDetectorIndex(Integer val) { this._detectorIndex = val; return this; }


  static final ParseField EXCLUDE_FREQUENT = new ParseField("exclude_frequent");
  private ExcludeFrequent _excludeFrequent;
  public ExcludeFrequent getExcludeFrequent() { return this._excludeFrequent; }
  public Detector setExcludeFrequent(ExcludeFrequent val) { this._excludeFrequent = val; return this; }


  static final ParseField FUNCTION = new ParseField("function");
  private String _function;
  public String getFunction() { return this._function; }
  public Detector setFunction(String val) { this._function = val; return this; }


  static final ParseField USE_NULL = new ParseField("use_null");
  private Boolean _useNull;
  public Boolean getUseNull() { return this._useNull; }
  public Detector setUseNull(Boolean val) { this._useNull = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Detector fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Detector.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Detector, Void> PARSER =
    new ConstructingObjectParser<>(Detector.class.getName(), false, args -> new Detector());

  static {
    PARSER.declareObjectArray(Detector::setCustomRules, (p, t) -> DetectionRule.PARSER.apply(p, t), CUSTOM_RULES);
    PARSER.declareString(Detector::setDetectorDescription, DETECTOR_DESCRIPTION);
    PARSER.declareInt(Detector::setDetectorIndex, DETECTOR_INDEX);
    PARSER.declareObject(Detector::setExcludeFrequent, (p, t) -> ExcludeFrequent.PARSER.apply(p), EXCLUDE_FREQUENT);
    PARSER.declareString(Detector::setFunction, FUNCTION);
    PARSER.declareBoolean(Detector::setUseNull, USE_NULL);
  }

}