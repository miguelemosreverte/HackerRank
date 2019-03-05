package com.miguelemosreverte.HackerRank.SuperQueen

import com.miguelemosreverte.HackerRank.SuperQueen.Solution.{Coordinate, Matrix}
import org.scalatest.FunSuite

class Test extends FunSuite {
    test("sample test as explained in the README.md") {
        val sampleInput = 10
        val sampleOutput = 4
        val result = Solution.solveNSuperQueens(sampleInput)
        assert(result == sampleOutput)
    }


    test("initializ matrix with pattern") {
        val n = 10
        val matrix = new Matrix(
            """
              |- O O - O O -
              |O - - - - - O
              |O - - - - - O
              |- - - q - - -
              |O - - - - - O
              |O - - - - - O
              |- O O - O O -
            """.stripMargin)
        println(matrix)
        assert(true)
    }

    test("set coordinate(0,0) as safe from Super-Queen") {
        val n = 10
        val newCoordinate = Coordinate(0,0, true)
        val matrix =
            new Matrix((Array.fill[Boolean](n, n)(false)))

        matrix.set(newCoordinate)

        val expected =
            new Matrix("""
              |O - - - - - - - - -
              |- - - - - - - - - -
              |- - - - - - - - - -
              |- - - - - - - - - -
              |- - - - - - - - - -
              |- - - - - - - - - -
              |- - - - - - - - - -
              |- - - - - - - - - -
              |- - - - - - - - - -
              """.stripMargin)

        assert(matrix == expected)
    }


}