package one_arrays_hashing

import com.joaoferreira.one_arrays_hashing.factorInfluence
import com.joaoferreira.one_arrays_hashing.productOfArrayExceptSelf
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ProductOfArrayExceptSelfTest {
    @Test
    fun productOfArrayExceptSelfTest() {
        val nums = intArrayOf(1, 2, 3, 4)
        val nums2 = intArrayOf(2, 6, 8, 12)
        val nums3 = intArrayOf(0, 0, 2, 3)

        assertContentEquals(intArrayOf(24, 12, 8, 6), productOfArrayExceptSelf(nums))
        assertContentEquals(intArrayOf(576, 192, 144, 96), productOfArrayExceptSelf(nums2))
        assertContentEquals(intArrayOf(0, 0, 0, 0), productOfArrayExceptSelf(nums3))
    }

    @Test
    fun factorInfluenceTest() {
        val factors = intArrayOf(1, 2, 3, 4)
        val factors2 = intArrayOf(2, 6, 8, 12)
        val factors3 = intArrayOf(0, 0, 2, 3)

        assertContentEquals(intArrayOf(24, 12, 8, 6), factorInfluence(factors))
        assertContentEquals(intArrayOf(576, 192, 144, 96), factorInfluence(factors2))
        assertContentEquals(intArrayOf(0, 0, 0, 0), factorInfluence(factors3))
    }
}