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

import org.junit.Assert
import org.junit.Test

class BehaviorUncheckedItemTest {

    @Test
    fun fromInt_moveToPreviousPosition_test() {
        val expected = BehaviorUncheckedItem.MOVE_TO_PREVIOUS_POSITION
        val actual = BehaviorUncheckedItem.fromInt(0)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun fromInt_moveToBottomOfUncheckedItems_test() {
        val expected = BehaviorUncheckedItem.MOVE_TO_BOTTOM_OF_UNCHECKED_ITEMS
        val actual = BehaviorUncheckedItem.fromInt(1)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun fromInt_moveToTopOfUncheckedItems_test() {
        val expected = BehaviorUncheckedItem.MOVE_TO_TOP_OF_UNCHECKED_ITEMS
        val actual = BehaviorUncheckedItem.fromInt(2)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun fromInt_invalid_test() {
        val expected = BehaviorUncheckedItem.defaultBehavior
        val actual = BehaviorUncheckedItem.fromInt(3)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun fromString_moveToPreviousPosition_test() {
        val expected = BehaviorUncheckedItem.MOVE_TO_PREVIOUS_POSITION
        val actual = BehaviorUncheckedItem.fromString("MOVE_TO_PREVIOUS_POSITION")

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun fromString_moveToBottomOfUncheckedItems_test() {
        val expected = BehaviorUncheckedItem.MOVE_TO_BOTTOM_OF_UNCHECKED_ITEMS
        val actual = BehaviorUncheckedItem.fromString("MOVE_TO_BOTTOM_OF_UNCHECKED_ITEMS")

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun fromString_moveToTopOfUncheckedItems_test() {
        val expected = BehaviorUncheckedItem.MOVE_TO_TOP_OF_UNCHECKED_ITEMS
        val actual = BehaviorUncheckedItem.fromString("move_to_top_of_unchecked_items")

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun fromString_invalid_test() {
        val expected = BehaviorUncheckedItem.defaultBehavior
        val actual = BehaviorUncheckedItem.fromString("")

        Assert.assertEquals(expected, actual)
    }
}