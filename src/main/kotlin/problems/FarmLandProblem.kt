package com.joaoferreira.problems

/**
 * A farmer wants to farm their land with the maximum area where good land is present. The "land" is represented as a
 * matrix with 1s and 0s, where 1s mean good land and 0s mean bad land. The farmer only want to farm in a square of
 * good land with the maximum area. Please help the farmer to find the maximum area of the land they can farm in good
 * land.
 * */
fun farmLand(area: Array<IntArray>): Int {
    if (area.isEmpty() || area[0].isEmpty()) {
        return 0
    }

    val n = area.size
    val m = area[0].size

    val prefixSizes = Array(n) { IntArray(m) }
    var maxValue = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (area[i][j] == 0) {
                continue
            }

            val left = if (j > 0) {
                prefixSizes[i][j-1]
            } else {
                0
            }
            val top = if (i > 0) {
                prefixSizes[i-1][j]
            } else {
                0
            }
            val diag = if (i > 0 && j > 0) {
                prefixSizes[i-1][j-1]
            } else {
                0
            }
            val z = minOf(left, top, diag) + 1

            prefixSizes[i][j] = z
            if (z > maxValue) {
                maxValue = z
            }
        }
    }

    return maxValue
}