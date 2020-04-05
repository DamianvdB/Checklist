package com.dvdb.checklist.util

import com.dvdb.checklist.recycler.item.checklist.ChecklistRecyclerItem
import org.junit.Assert
import org.junit.Test

class RecyclerItemMapperTest {

    private val validChecklistItems = listOf(
        ChecklistRecyclerItem("Buy beer", true),
        ChecklistRecyclerItem("Buy steak", true),
        ChecklistRecyclerItem("Buy brandy", true),
        ChecklistRecyclerItem("Buy Coca-Cola", false),
        ChecklistRecyclerItem("Buy Portuguese buns", true)
    )

    private val validChecklistContents = "[x] Buy beer\n[x] Buy steak\n[x] Buy brandy\n[ ] Buy Coca-Cola\n[x] Buy Portuguese buns"

    @Test
    fun toFormattedText() {
        val expectedItems = validChecklistItems
        val inputText = validChecklistContents
        val actualItems = RecyclerItemMapper.toItems(inputText)

        Assert.assertEquals(expectedItems, actualItems)
    }

    @Test
    fun toFormattedText_WithMalformedCheckSymbol() {
        val expectedItems = listOf(
            ChecklistRecyclerItem("    Missing check symbol"),
            ChecklistRecyclerItem("[x]Missing space after symbol"),
            ChecklistRecyclerItem("[   Malformed check symbol 1"),
            ChecklistRecyclerItem(" x  Malformed check symbol 2"),
            ChecklistRecyclerItem(" ]  Malformed check symbol 3"),
            ChecklistRecyclerItem("Malformed check symbol 4")
        )
        val inputContent =
            "    Missing check symbol\n[x]Missing space after symbol\n[   Malformed check symbol 1\n x  Malformed check symbol 2\n ]  Malformed check symbol 3\nMalformed check symbol 4"
        val actualItems = RecyclerItemMapper.toItems(inputContent)

        Assert.assertEquals(expectedItems, actualItems)
    }

    @Test
    fun toItems() {
        val expectedContents = validChecklistContents
        val inputItems = validChecklistItems
        val actualContents = RecyclerItemMapper.toFormattedText(inputItems)

        Assert.assertEquals(expectedContents, actualContents)
    }
}