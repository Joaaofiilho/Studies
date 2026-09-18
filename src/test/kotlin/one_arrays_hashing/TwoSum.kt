package one_arrays_hashing

import com.joaoferreira.one_arrays_hashing.Product
import com.joaoferreira.one_arrays_hashing.buyProducts
import com.joaoferreira.one_arrays_hashing.twoSum
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
    @Test
    fun twoSumTest() {
        val nums = intArrayOf(2, 7, 20, 14, 10)
        assertContentEquals(intArrayOf(0, 1), twoSum(nums, 9))
        assertContentEquals(intArrayOf(1, 4), twoSum(nums, 17))
        assertContentEquals(intArrayOf(2, 3), twoSum(nums, 34))
        assertContentEquals(intArrayOf(0, 4), twoSum(nums, 12))
    }

    @Test
    fun buyProductsTest() {
        val products = listOf(
            Product("TV", 100),
            Product("PC", 210),
            Product("Tablet", 80),
            Product("Phone", 120)
        )

        assertContentEquals(listOf("TV", "PC"), buyProducts(products, 310))
        assertContentEquals(listOf("TV", "Tablet"), buyProducts(products, 180))
        assertContentEquals(listOf("PC", "Tablet"), buyProducts(products, 290))
        assertContentEquals(listOf("Tablet", "Phone"), buyProducts(products, 200))
    }
}