package one_arrays_hashing

import com.joaoferreira.one_arrays_hashing.groupAnagrams
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class GroupAnagramsTest {
    @Test
    fun groupAnagramsTest() {
        val words = listOf("eat", "tea", "tan", "ate", "nat", "bat")
        val words2 = listOf("imagine dragons", "listen", "bot", "ragged insomnia", "silent", "toy")
        val words3 = listOf("camera", "macera", "mouse", "carema", "keyboard", "esumo")

        assertContentEquals(listOf(listOf("eat", "tea", "ate"), listOf("tan", "nat")), groupAnagrams(words))
        assertContentEquals(
            listOf(listOf("imagine dragons", "ragged insomnia"), listOf("listen", "silent")),
            groupAnagrams(words2)
        )
        assertContentEquals(listOf(listOf("camera", "macera", "carema"), listOf("mouse", "esumo")), groupAnagrams(words3))
    }
}