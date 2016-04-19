/*
 *  Copyright 2016 by Simba Project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.spark.sql.index

/**
 * Created by Dong Xie on 9/22/15.
 * Base trait for index and index type
 */
trait Index

object IndexType {
  def apply(ty: String): IndexType = ty.toLowerCase match {
    case "rtree" => RTreeType
    case "treemap" => TreeMapType
    case "hashmap" => HashMapType
    case _ => null
  }
}

sealed abstract class IndexType

case object RTreeType extends IndexType

case object TreeMapType extends IndexType

case object HashMapType extends IndexType
