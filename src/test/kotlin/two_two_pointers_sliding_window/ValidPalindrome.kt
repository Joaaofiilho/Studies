package two_two_pointers_sliding_window

import com.joaoferreira.two_two_pointers_sliding_window.validPalindrome
import org.junit.jupiter.api.Test

class ValidPalindromeTest {
    @Test
    fun validPalindromeTest() {
        val str = "A man, a plan, a canal: Panama"
        val str2 = "Race car"
        val str3 = "No"

        assert(validPalindrome(str))
        assert(validPalindrome(str2))
        assert(!validPalindrome(str3))
    }
}