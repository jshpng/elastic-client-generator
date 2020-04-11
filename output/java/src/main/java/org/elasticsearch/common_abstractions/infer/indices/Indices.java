
package org.elasticsearch.common_abstractions.infer.indices;

import java.io.IOException;
import java.util.Objects;
import org.elasticsearch.XContentable;
import org.elasticsearch.common.xcontent.*;

public final class Indices implements XContentable<Indices> {
  private final String value;

  public Indices(String value) { this.value = value; }

  @Override
  public String toString() { return value.toString(); }

  @Override
  public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      Indices that = (Indices) o;
      return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() { return Objects.hash(value); }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.value(this.value);
    return null;
  }

  public static Indices createFrom(XContentParser parser) throws IOException, XContentParseException { return new Indices(parser.text()); }

  @Override
  public Indices fromXContent(XContentParser parser) throws IOException, XContentParseException { return Indices.createFrom(parser); }

}