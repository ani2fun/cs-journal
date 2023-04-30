package io.journal.basic

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class TestAddition {
    @Test
    fun testAddition() {
        assertEquals(2, Addition.add(1, 1))
    }
}