/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

class ModelSizeStats {
  bucket_allocation_failures_count: long
  job_id: string
  /** @prop_serializer DateTimeOffsetEpochMillisecondsFormatter */
  log_time: Date
  memory_status: MemoryStatus
  model_bytes: long
  result_type: string
  /** @prop_serializer NullableDateTimeOffsetEpochMillisecondsFormatter */
  timestamp: Date
  total_by_field_count: long
  total_over_field_count: long
  total_partition_field_count: long
}
