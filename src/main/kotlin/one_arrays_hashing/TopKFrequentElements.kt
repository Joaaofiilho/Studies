package com.joaoferreira.one_arrays_hashing

/**
 * @param nums The array of numbers.
 * @param k The quantity of the most frequent elements that should be returned. Always positive
 * @return The most frequent elements with size of [k].
 * */
fun topKFrequentElements(nums: IntArray, k: Int): IntArray {
    if (nums.isEmpty() || k == 0) {
        return intArrayOf()
    }

    val frequency = hashMapOf<Int, Int>()

    for (num in nums) {
        frequency[num] = frequency.getOrDefault(num, 0) + 1
    }

    // Bucket sort
    val bucket = Array(nums.size + 1) { mutableListOf<Int>() }

    for ((num, count) in frequency) {
        bucket[count].add(num)
    }

    val result = mutableListOf<Int>()

    for (count in bucket.indices.reversed()) {
        for (num in bucket[count]) {
            result.add(num)

            if (result.size == k) {
                return result.toIntArray()
            }
        }
    }

    return result.toIntArray()

    // Min Heap
//    val minHeap = PriorityQueue<Int> { a, b ->
//        frequency[a]!! - frequency[b]!!
//    }
//
//    for (num in frequency.keys) {
//        minHeap.offer(num)
//
//        if (minHeap.size > k) {
//            minHeap.poll()
//        }
//    }
//
//    return minHeap.reversed().toIntArray()
}