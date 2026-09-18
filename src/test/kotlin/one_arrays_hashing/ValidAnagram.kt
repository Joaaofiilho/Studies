package one_arrays_hashing

import com.joaoferreira.one_arrays_hashing.validAnagram
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ValidAnagramTest {
    @Test
    fun validAnagramTest() {
        val anagram = "imagine dragons" to "ragged insomnia"
        val anagram2 = "potato" to "botato"

        assertEquals(true, validAnagram(anagram.first, anagram.second))
        assertEquals(false, validAnagram(anagram2.first, anagram2.second))
    }
}