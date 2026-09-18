package one_arrays_hashing

import com.joaoferreira.one_arrays_hashing.longestConsecutiveSequence
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestConsecutiveSequenceTest {
    @Test
    fun longestConsecutiveSequenceTest() {
        val nums = intArrayOf(100, 4, 200, 1, 3, 2)
        val nums2 = intArrayOf()
        val nums3 = intArrayOf(-2, -1, 10, 1, 0, 20)
        val nums4 = intArrayOf(1, 2, 2, 3)
        val nums5 = intArrayOf(10, 11, 1, 2, 3, 50)

        assertEquals(4, longestConsecutiveSequence(nums))
        assertEquals(0, longestConsecutiveSequence(nums2))
        assertEquals(4, longestConsecutiveSequence(nums3))
        assertEquals(3, longestConsecutiveSequence(nums4))
        assertEquals(3, longestConsecutiveSequence(nums5))
    }
}