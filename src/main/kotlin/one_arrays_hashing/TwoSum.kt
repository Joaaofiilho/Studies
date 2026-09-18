package com.joaoferreira.one_arrays_hashing

fun twoSum(nums: IntArray, target: Int): IntArray {
    val visited = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        visited[complement]?.let {
            return intArrayOf(it, i)
        } ?: run {
            visited[nums[i]] = i
        }
    }
    return intArrayOf()
}

/**
 * Find the products I can buy given a list of prices and a target
 * */
class Product(val name: String, val price: Int)
fun buyProducts(products: List<Product>, target: Int): List<String> {
    val visited = mutableMapOf<Int, Int>()

    for (i in products.indices) {
        val current = products[i]
        val complement = target - current.price
        visited[complement]?.let {
            return listOf(products[it].name, current.name)
        }
        visited[current.price] = i
    }

    return emptyList()
}