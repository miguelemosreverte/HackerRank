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


    test("set coordinate(0,0) as safe from Super-Queen") {
        val n = 10
        val matrix = new Matrix((Array.fill[Boolean](n, n)(false)))
        val newCoordinate = Coordinate(0,0, true)
        matrix.set(newCoordinate)
        val expected =
            """
              0 - - - - - - - - -
              - - - - - - - - - -
              - - - - - - - - - -
              - - - - - - - - - -
              - - - - - - - - - -
              - - - - - - - - - -
              - - - - - - - - - -
              - - - - - - - - - -
              """

        def toSingleLine(string: String):String =
            string
              .replaceAll("\n"," ")
              .replaceAll("-"," ")
              .replaceAll(" ","")
        assert(toSingleLine(matrix.toString()) == toSingleLine(expected))
    }
}