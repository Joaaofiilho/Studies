package com.joaoferreira.one_arrays_hashing

fun subarraySumEqualsK(nums: IntArray, k: Int): Int {
    val prefixSums = mutableMapOf(0 to 1)

    var counter = 0
    var sum = 0

    for (i in nums.indices) {
        sum += nums[i]
        val remaining = sum - k
        counter += prefixSums.getOrDefault(remaining, 0)
        prefixSums[sum] = prefixSums.getOrDefault(sum, 0) + 1
    }

    return counter
}