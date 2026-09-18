package com.joaoferreira.one_arrays_hashing

fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()

    for (i in nums.indices) {
        if (seen.contains(nums[i])) {
            return true
        }
        seen.add(nums[i])
    }
    return false
}