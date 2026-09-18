package one_arrays_hashing

import com.joaoferreira.one_arrays_hashing.containsDuplicate
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ContainsDuplicateTest {
    @Test
    fun containsDuplicateTest() {
        val nums = intArrayOf(2, 10, 450, 100, 80, 72, 10, 12)
        val nums2 = IntArray(120)
        for (i in 0 until 120) {
            nums2[i] = i
        }
        assertEquals(true, containsDuplicate(nums))
        assertEquals(false, containsDuplicate(nums2))
    }
}