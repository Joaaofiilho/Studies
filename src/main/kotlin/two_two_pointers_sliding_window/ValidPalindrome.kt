package com.joaoferreira.two_two_pointers_sliding_window

fun validPalindrome(s: String): Boolean {
    var left = 0
    var right = s.lastIndex

    while (left < right) {
        while (left < right && !s[left].isLetterOrDigit()) {
            left++
        }

        while (left < right && !s[right].isLetterOrDigit()) {
            right--
        }

        if (s[left].lowercase() != s[right].lowercase()) {
            return false
        }

        left++
        right--
    }

    return true
}