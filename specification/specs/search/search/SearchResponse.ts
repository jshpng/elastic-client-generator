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

class SearchResponse<TDocument> extends ResponseBase {
  took: long
  timed_out: boolean
  _shards: ShardStatistics
  hits: HitsMetadata<TDocument>

  aggregations?: Dictionary<AggregateName, Aggregate>
  _clusters?: ClusterStatistics
  documents?: TDocument[]
  fields?: Dictionary<string, LazyDocument>
  max_score?: double
  num_reduce_phases?: long
  profile?: Profile
  pit_id?: string
  _scroll_id?: string
  suggest?: SuggestDictionary<TDocument>
  terminated_early?: boolean
}
