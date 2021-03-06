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

class CatShardsRecord {
  'completion.size': string
  docs: string
  'fielddata.evictions': string
  'fielddata.memory_size': string
  'filter_cache.memory_size': string
  'flush.total': string
  'flush.total_time': string
  'get.current': string
  'get.exists_time': string
  'get.exists_total': string
  'get.missing_time': string
  'get.missing_total': string
  'get.time': string
  'get.total': string
  id: string
  'id_cache.memory_size': string
  index: string
  'indexing.delete_current': string
  'indexing.delete_time': string
  'indexing.delete_total': string
  'indexing.index_current': string
  'indexing.index_time': string
  'indexing.index_total': string
  ip: string
  'merges.current': string
  'merges.current_docs': string
  'merges.current_size': string
  'merges.total_docs': string
  'merges.total_size': string
  'merges.total_time': string
  node: string
  'percolate.current': string
  'percolate.memory_size': string
  'percolate.queries': string
  'percolate.time': string
  'percolate.total': string
  prirep: string
  'refresh.time': string
  'refresh.total': string
  'search.fetch_current': string
  'search.fetch_time': string
  'search.fetch_total': string
  'search.open_contexts': string
  'search.query_current': string
  'search.query_time': string
  'search.query_total': string
  'segments.count': string
  'segments.fixed_bitset_memory': string
  'segments.index_writer_max_memory': string
  'segments.index_writer_memory': string
  'segments.memory': string
  'segments.version_map_memory': string
  shard: string
  state: string
  store: string
  'warmer.current': string
  'warmer.total': string
  'warmer.total_time': string
}
