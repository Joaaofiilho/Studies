package one_arrays_hashing

import com.joaoferreira.one_arrays_hashing.subarraySumEqualsK
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SubarraySumEqualsKTest {
    @Test
    fun subarraySumEqualsKTest() {
        val nums = intArrayOf(1, -1, 1, 1, 1, 0, -2, 1)
        val nums2 = intArrayOf(1, 1, 1)
        val nums3 = intArrayOf(2, 5, 2)

        assertEquals(12, subarraySumEqualsK(nums, 1))
        assertEquals(8, subarraySumEqualsK(nums, 2))
        assertEquals(4, subarraySumEqualsK(nums, 3))
        assertEquals(3, subarraySumEqualsK(nums2, 1))
        assertEquals(2, subarraySumEqualsK(nums2, 2))
        assertEquals(2, subarraySumEqualsK(nums3, 7))
        assertEquals(1, subarraySumEqualsK(nums3, 9))
        assertEquals(2, subarraySumEqualsK(nums3, 2))
    }
}