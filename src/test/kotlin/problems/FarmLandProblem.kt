package problems

import com.joaoferreira.problems.farmLand
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FarmProblemTest {
    @Test
    fun farmLandTest() {
        val farm = Array(6) { IntArray(5) }
        farm[0] = intArrayOf(0, 1, 1, 0, 1)
        farm[1] = intArrayOf(1, 1, 0, 1, 0)
        farm[2] = intArrayOf(0, 1, 1, 1, 0)
        farm[3] = intArrayOf(1, 1, 1, 1, 0)
        farm[4] = intArrayOf(1, 1, 1, 1, 1)
        farm[5] = intArrayOf(0, 0, 0, 0, 0)

        val farm2 = Array(10) { IntArray(5) }

        farm2[0] = intArrayOf(0, 1, 1, 0, 1)
        farm2[1] = intArrayOf(1, 1, 0, 1, 0)
        farm2[2] = intArrayOf(0, 1, 1, 1, 1)
        farm2[3] = intArrayOf(1, 1, 1, 1, 1)
        farm2[4] = intArrayOf(1, 1, 1, 1, 1)
        farm2[5] = intArrayOf(0, 1, 1, 1, 1)
        farm2[6] = intArrayOf(1, 0, 1, 1, 1)
        farm2[7] = intArrayOf(0, 1, 0, 1, 1)
        farm2[8] = intArrayOf(1, 0, 0, 1, 0)
        farm2[9] = intArrayOf(0, 1, 1, 0, 0)

        assertEquals(3, farmLand(farm))
        assertEquals(4, farmLand(farm2))
    }
}