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

package com.dvdb.materialchecklist.config

enum class BehaviorUncheckedItem {
    MOVE_TO_PREVIOUS_POSITION,
    MOVE_TO_BOTTOM_OF_UNCHECKED_ITEMS,
    MOVE_TO_TOP_OF_UNCHECKED_ITEMS;

    companion object {
        fun fromString(value: String): BehaviorUncheckedItem {
            return values().firstOrNull { it.name.equals(value, true) } ?: MOVE_TO_PREVIOUS_POSITION
        }
    }
}