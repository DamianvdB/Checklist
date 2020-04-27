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

import android.graphics.Typeface
import androidx.annotation.ColorInt
import androidx.annotation.Px
import com.dvdb.materialchecklist.MaterialChecklist

/**
 * Text configuration
 */
fun MaterialChecklist.setTextColor(@ColorInt textColor: Int): MaterialChecklist {
    if (config.textColor != textColor) {
        config.textColor = textColor
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setTextSize(@Px textSize: Float): MaterialChecklist {
    if (config.textSize != textSize) {
        config.textSize = textSize
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setNewItemText(text: String): MaterialChecklist {
    if (config.textNewItem != text) {
        config.textNewItem = text
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setCheckedItemTextAlpha(alpha: Float): MaterialChecklist {
    if (config.textAlphaCheckedItem != alpha) {
        config.textAlphaCheckedItem = alpha
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setNewItemTextAlpha(alpha: Float): MaterialChecklist {
    if (config.textAlphaNewItem != alpha) {
        config.textAlphaNewItem = alpha
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setTextTypeFace(typeface: Typeface): MaterialChecklist {
    if (config.textTypeFace != typeface) {
        config.textTypeFace = typeface
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

/**
 * Icon configuration
 */
fun MaterialChecklist.setIconTintColor(@ColorInt tintColor: Int): MaterialChecklist {
    if (config.iconTintColor != tintColor) {
        config.iconTintColor = tintColor
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setDragIndicatorIconAlpha(alpha: Float): MaterialChecklist {
    if (config.iconAlphaDragIndicator != alpha) {
        config.iconAlphaDragIndicator = alpha
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setDeleteIconAlpha(alpha: Float): MaterialChecklist {
    if (config.iconAlphaDelete != alpha) {
        config.iconAlphaDelete = alpha
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setAddIconAlpha(alpha: Float): MaterialChecklist {
    if (config.iconAlphaAdd != alpha) {
        config.iconAlphaAdd = alpha
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

/**
 * Checkbox configuration
 */
fun MaterialChecklist.setCheckboxTintColor(@ColorInt tintColor: Int): MaterialChecklist {
    if (config.checkboxTintColor != tintColor) {
        config.checkboxTintColor = tintColor
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setCheckedItemCheckboxAlpha(alpha: Float): MaterialChecklist {
    if (config.checkboxAlphaCheckedItem != alpha) {
        config.checkboxAlphaCheckedItem = alpha
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

/**
 * Drag-and-drop configuration
 */

/**
 * Set the checklist item drag-and-drop toggle mode.
 *
 * @param toggleMode The drag-and-drop toggle mode to set for checklist items.
 */
fun MaterialChecklist.setDragAndDropToggleMode(toggleMode: DragAndDropToggleMode): MaterialChecklist {
    if (config.dragAndDropToggleMode != toggleMode) {
        config.dragAndDropToggleMode = toggleMode
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

fun MaterialChecklist.setDragAndDropItemActiveBackgroundColor(@ColorInt backgroundColor: Int): MaterialChecklist {
    if (config.dragAndDropActiveItemBackgroundColor != backgroundColor) {
        config.dragAndDropActiveItemBackgroundColor = backgroundColor
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

/**
 * Behavior configuration
 */

/**
 * Set the checklist item on checked behavior.
 *
 * @param behavior The item behavior to set when an item is checked.
 */
fun MaterialChecklist.setOnItemCheckedBehavior(behavior: BehaviorCheckedItem): MaterialChecklist {
    if (config.behaviorCheckedItem != behavior) {
        config.behaviorCheckedItem = behavior
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

/**
 * Set the checklist item on unchecked behavior.
 *
 * @param behavior The item behavior to set when an item is unchecked.
 */
fun MaterialChecklist.setOnItemUncheckedBehavior(behavior: BehaviorUncheckedItem): MaterialChecklist {
    if (config.behaviorUncheckedItem != behavior) {
        config.behaviorUncheckedItem = behavior
        manager.setConfig(config.toManagerConfig())
    }
    return this
}

/**
 * Item configuration
 */

/**
 * Set the padding to checklist items.
 *
 * @param firstItemTopPadding The padding in pixels to set to the top of the first checklist item.
 * @param leftAndRightPadding The padding in pixels to set to the left and right of each checklist item.
 * @param lastItemBottomPadding The padding in pixels to set to the bottom of the last checklist item.
 */
fun MaterialChecklist.setItemPadding(
    @Px firstItemTopPadding: Float? = null,
    @Px leftAndRightPadding: Float? = null,
    @Px lastItemBottomPadding: Float? = null
): MaterialChecklist {
    if (config.itemFirstTopPadding != firstItemTopPadding || config.itemLeftAndRightPadding != leftAndRightPadding || config.itemLastBottomPadding != lastItemBottomPadding) {
        config.itemFirstTopPadding = firstItemTopPadding
        config.itemLeftAndRightPadding = leftAndRightPadding
        config.itemLastBottomPadding = lastItemBottomPadding
        manager.setConfig(config.toManagerConfig())
    }
    return this
}