package one_arrays_hashing

import com.joaoferreira.one_arrays_hashing.topKFrequentElements
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class TopKFrequentElementsTest {
    @Test
    fun topKFrequentElementsTest() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val nums2 = intArrayOf(1, 3, 5, 5, 2, 3, 5, 2, 6, 10, 2)
        val nums3 = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)
        val nums4 = intArrayOf()

        assertContentEquals(intArrayOf(1, 2), topKFrequentElements(nums, 2))
        assertContentEquals(intArrayOf(2, 5), topKFrequentElements(nums2, 2))
        assertContentEquals(intArrayOf(2, 5, 3), topKFrequentElements(nums2, 3))
        assertContentEquals(intArrayOf(1), topKFrequentElements(nums3, 2))
        assertContentEquals(intArrayOf(), topKFrequentElements(nums4, 2))
    }
}