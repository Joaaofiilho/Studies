package com.joaoferreira.one_arrays_hashing

fun validAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    val chars = mutableMapOf<Char, Int>()

    for (char in str1) {
        chars[char] = chars.getOrDefault(char, 0) + 1
    }

    for (char in str2) {
        val count = chars[char] ?: return false

        if (count == 0) {
            return false
        }

        chars[char] = count - 1
    }

    return true
}