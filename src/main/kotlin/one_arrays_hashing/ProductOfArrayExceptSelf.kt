package com.joaoferreira.one_arrays_hashing

/**
 *
 * */
fun productOfArrayExceptSelf(nums: IntArray): IntArray {
   val answer = IntArray(nums.size) { 1 }

    var prefix = 1
    for (i in nums.indices) {
        answer[i] *= prefix
        prefix *= nums[i]
    }

    var suffix = 1
    for (i in nums.lastIndex downTo 0) {
        answer[i] *= suffix
        suffix *= nums[i]
    }

    return answer
    // First solution
//    val answer = IntArray(nums.size)
//
//    for (i in nums.indices) {
//        var acc = 1
//        for (j in 0 until i) {
//            acc *= nums[j]
//        }
//        val prefix = acc
//        acc = 1
//        for (j in nums.size-1 downTo i+1) {
//            acc *= nums[j]
//        }
//        val suffix = acc
//
//        answer[i] = prefix * suffix
//    }
//
//    return answer
}

/**
 * Uma plataforma mede quatro fatores independentes que multiplicam um índice de conversão: [2, 3, 5, 4]. Para analisar
 * a influência de cada fator, o time quer saber qual seria o produto combinado de todos os outros fatores quando cada
 * fator é removido da análise.
 *
 * Sua tarefa: retorne um array com esses quatro valores em O(n), sem usar divisão.
 * */
fun factorInfluence(factors: IntArray): IntArray {
    val answer = IntArray(factors.size) { 1 }

    var acc = 1
    for (i in factors.indices) {
        answer[i] *= acc
        acc *= factors[i]
    }

    acc = 1
    for (i in factors.lastIndex downTo 0) {
        answer[i] *= acc
        acc *= factors[i]
    }

    return answer
}