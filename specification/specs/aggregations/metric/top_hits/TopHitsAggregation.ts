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

class TopHitsAggregation {
  docvalue_fields?: Field[]
  explain?: boolean
  from?: integer
  highlight?: Highlight
  script_fields?: Dictionary<string, ScriptField>
  size?: integer
  sort?:
    | string
    | Dictionary<Field, NestedSort>
    | Array<
        SingleKeyDictionary<Sort | SortOrder | Dictionary<Field, NestedSort>>
      >
  _source?: Union<boolean, SourceFilter>
  stored_fields?: Field[]
  track_scores?: boolean
  version?: boolean
  seq_no_primary_term?: boolean
}
