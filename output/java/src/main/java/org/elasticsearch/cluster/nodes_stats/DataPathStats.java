
package org.elasticsearch.cluster.nodes_stats;

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

public class DataPathStats  implements XContentable<DataPathStats> {
  
  static final ParseField AVAILABLE = new ParseField("available");
  private String _available;
  public String getAvailable() { return this._available; }
  public DataPathStats setAvailable(String val) { this._available = val; return this; }


  static final ParseField AVAILABLE_IN_BYTES = new ParseField("available_in_bytes");
  private Long _availableInBytes;
  public Long getAvailableInBytes() { return this._availableInBytes; }
  public DataPathStats setAvailableInBytes(Long val) { this._availableInBytes = val; return this; }


  static final ParseField DISK_QUEUE = new ParseField("disk_queue");
  private String _diskQueue;
  public String getDiskQueue() { return this._diskQueue; }
  public DataPathStats setDiskQueue(String val) { this._diskQueue = val; return this; }


  static final ParseField DISK_READS = new ParseField("disk_reads");
  private Long _diskReads;
  public Long getDiskReads() { return this._diskReads; }
  public DataPathStats setDiskReads(Long val) { this._diskReads = val; return this; }


  static final ParseField DISK_READ_SIZE = new ParseField("disk_read_size");
  private String _diskReadSize;
  public String getDiskReadSize() { return this._diskReadSize; }
  public DataPathStats setDiskReadSize(String val) { this._diskReadSize = val; return this; }


  static final ParseField DISK_READ_SIZE_IN_BYTES = new ParseField("disk_read_size_in_bytes");
  private Long _diskReadSizeInBytes;
  public Long getDiskReadSizeInBytes() { return this._diskReadSizeInBytes; }
  public DataPathStats setDiskReadSizeInBytes(Long val) { this._diskReadSizeInBytes = val; return this; }


  static final ParseField DISK_WRITES = new ParseField("disk_writes");
  private Long _diskWrites;
  public Long getDiskWrites() { return this._diskWrites; }
  public DataPathStats setDiskWrites(Long val) { this._diskWrites = val; return this; }


  static final ParseField DISK_WRITE_SIZE = new ParseField("disk_write_size");
  private String _diskWriteSize;
  public String getDiskWriteSize() { return this._diskWriteSize; }
  public DataPathStats setDiskWriteSize(String val) { this._diskWriteSize = val; return this; }


  static final ParseField DISK_WRITE_SIZE_IN_BYTES = new ParseField("disk_write_size_in_bytes");
  private Long _diskWriteSizeInBytes;
  public Long getDiskWriteSizeInBytes() { return this._diskWriteSizeInBytes; }
  public DataPathStats setDiskWriteSizeInBytes(Long val) { this._diskWriteSizeInBytes = val; return this; }


  static final ParseField FREE = new ParseField("free");
  private String _free;
  public String getFree() { return this._free; }
  public DataPathStats setFree(String val) { this._free = val; return this; }


  static final ParseField FREE_IN_BYTES = new ParseField("free_in_bytes");
  private Long _freeInBytes;
  public Long getFreeInBytes() { return this._freeInBytes; }
  public DataPathStats setFreeInBytes(Long val) { this._freeInBytes = val; return this; }


  static final ParseField MOUNT = new ParseField("mount");
  private String _mount;
  public String getMount() { return this._mount; }
  public DataPathStats setMount(String val) { this._mount = val; return this; }


  static final ParseField PATH = new ParseField("path");
  private String _path;
  public String getPath() { return this._path; }
  public DataPathStats setPath(String val) { this._path = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private String _total;
  public String getTotal() { return this._total; }
  public DataPathStats setTotal(String val) { this._total = val; return this; }


  static final ParseField TOTAL_IN_BYTES = new ParseField("total_in_bytes");
  private Long _totalInBytes;
  public Long getTotalInBytes() { return this._totalInBytes; }
  public DataPathStats setTotalInBytes(Long val) { this._totalInBytes = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public DataPathStats setType(String val) { this._type = val; return this; }


  
  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DataPathStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DataPathStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DataPathStats, Void> PARSER =
    new ConstructingObjectParser<>(DataPathStats.class.getName(), false, args -> new DataPathStats());

  static {
    PARSER.declareString(DataPathStats::setAvailable, AVAILABLE);
    PARSER.declareLong(DataPathStats::setAvailableInBytes, AVAILABLE_IN_BYTES);
    PARSER.declareString(DataPathStats::setDiskQueue, DISK_QUEUE);
    PARSER.declareLong(DataPathStats::setDiskReads, DISK_READS);
    PARSER.declareString(DataPathStats::setDiskReadSize, DISK_READ_SIZE);
    PARSER.declareLong(DataPathStats::setDiskReadSizeInBytes, DISK_READ_SIZE_IN_BYTES);
    PARSER.declareLong(DataPathStats::setDiskWrites, DISK_WRITES);
    PARSER.declareString(DataPathStats::setDiskWriteSize, DISK_WRITE_SIZE);
    PARSER.declareLong(DataPathStats::setDiskWriteSizeInBytes, DISK_WRITE_SIZE_IN_BYTES);
    PARSER.declareString(DataPathStats::setFree, FREE);
    PARSER.declareLong(DataPathStats::setFreeInBytes, FREE_IN_BYTES);
    PARSER.declareString(DataPathStats::setMount, MOUNT);
    PARSER.declareString(DataPathStats::setPath, PATH);
    PARSER.declareString(DataPathStats::setTotal, TOTAL);
    PARSER.declareLong(DataPathStats::setTotalInBytes, TOTAL_IN_BYTES);
    PARSER.declareString(DataPathStats::setType, TYPE);
  }

}