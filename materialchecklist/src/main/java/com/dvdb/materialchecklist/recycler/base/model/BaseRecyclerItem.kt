/*
 * Designed and developed by Damian van den Berg.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dvdb.materialchecklist.recycler.base.model

import androidx.annotation.CheckResult

internal abstract class BaseRecyclerItem {
    abstract val type: Type
    abstract val id: Long

    enum class Type {
        CHECKLIST,
        CHECKLIST_NEW;

        companion object {
            @CheckResult
            fun fromInt(value: Int): Type? {
                return values().firstOrNull { it.ordinal == value }
            }
        }
    }
}