package com.joaoferreira.one_arrays_hashing

/**
 * The general idea is to create a common key among all elements, in this case is their name sorted.
 * */
fun groupAnagrams(words: List<String>): List<List<String>> {
    // Thinking deeper
    return words.groupBy { it.toCharArray().sorted().joinToString() }
        .filterValues { it.size > 1 }
        .values.toList()

    // First solution
//    val groups = mutableMapOf<String, MutableList<String>>()

//    for (word in words) {
//        val key = word.toCharArray().sorted().joinToString()
//        groups[key] = groups.getOrDefault(key, mutableListOf()).apply { add(word) }
//    }
//
//    return groups.filterValues { it.size > 1 }.map { it.value }
}