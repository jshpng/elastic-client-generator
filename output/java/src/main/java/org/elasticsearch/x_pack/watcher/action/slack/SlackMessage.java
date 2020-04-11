
package org.elasticsearch.x_pack.watcher.action.slack;

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
import org.elasticsearch.x_pack.watcher.action.slack.*;

public class SlackMessage  implements XContentable<SlackMessage> {
  
  static final ParseField ATTACHMENTS = new ParseField("attachments");
  private List<SlackAttachment> _attachments;
  public List<SlackAttachment> getAttachments() { return this._attachments; }
  public SlackMessage setAttachments(List<SlackAttachment> val) { this._attachments = val; return this; }


  static final ParseField DYNAMIC_ATTACHMENTS = new ParseField("dynamic_attachments");
  private SlackDynamicAttachment _dynamicAttachments;
  public SlackDynamicAttachment getDynamicAttachments() { return this._dynamicAttachments; }
  public SlackMessage setDynamicAttachments(SlackDynamicAttachment val) { this._dynamicAttachments = val; return this; }


  static final ParseField FROM = new ParseField("from");
  private String _from;
  public String getFrom() { return this._from; }
  public SlackMessage setFrom(String val) { this._from = val; return this; }


  static final ParseField ICON = new ParseField("icon");
  private String _icon;
  public String getIcon() { return this._icon; }
  public SlackMessage setIcon(String val) { this._icon = val; return this; }


  static final ParseField TEXT = new ParseField("text");
  private String _text;
  public String getText() { return this._text; }
  public SlackMessage setText(String val) { this._text = val; return this; }


  static final ParseField TO = new ParseField("to");
  private List<String> _to;
  public List<String> getTo() { return this._to; }
  public SlackMessage setTo(List<String> val) { this._to = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SlackMessage fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SlackMessage.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SlackMessage, Void> PARSER =
    new ConstructingObjectParser<>(SlackMessage.class.getName(), false, args -> new SlackMessage());

  static {
    PARSER.declareObjectArray(SlackMessage::setAttachments, (p, t) -> SlackAttachment.PARSER.apply(p, t), ATTACHMENTS);
    PARSER.declareObject(SlackMessage::setDynamicAttachments, (p, t) -> SlackDynamicAttachment.PARSER.apply(p, t), DYNAMIC_ATTACHMENTS);
    PARSER.declareString(SlackMessage::setFrom, FROM);
    PARSER.declareString(SlackMessage::setIcon, ICON);
    PARSER.declareString(SlackMessage::setText, TEXT);
    PARSER.declareStringArray(SlackMessage::setTo, TO);
  }

}