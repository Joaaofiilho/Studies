package com.joaoferreira.one_arrays_hashing

/**
 * You must know that you don't need to check a number if it isn't the start of a sequence.
 * You can look up for numbers in O(1) by using maps, and a Set removes the duplicates.
 * */
fun longestConsecutiveSequence(nums: IntArray): Int {
    val numsInHashSet = nums.toHashSet()

    var longestSequence = 0
    for (num in numsInHashSet) {
        if (!numsInHashSet.contains(num-1)) {
            var currentNum = num
            var sequence = 1

            while (numsInHashSet.contains(currentNum+1)) {
                sequence++
                currentNum++
            }

            if (sequence > longestSequence) {
                longestSequence = sequence
            }
        }
    }

    return longestSequence
}