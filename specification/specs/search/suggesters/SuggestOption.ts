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

class SuggestOption<TDocument> {
  collate_match: boolean
  contexts: Dictionary<string, Context[]>
  fields: Dictionary<string, LazyDocument>
  freq: long
  highlighted: string
  _id: string
  _index: IndexName
  /** This is a comment that will be exposed
   * @alternate_name SuggestScore
   * @prop_x he
   * **/
  _score: double
  /** @alternate_name DocumentScore **/
  score: double
  /** @prop_serializer SourceFormatter`1 */
  _source: TDocument
  text: string
}
