package com.alvinalexander.testproject

import org.scalatest.FunSuite

class Main extends FunSuite {
    test("sample test as explained in the README.md") {
        val sampleInput = 10
        val sampleOutput = 4
        val result = Solution.solveNSuperQueens(sampleInput)
        assert(result == sampleOutput)
    }
}