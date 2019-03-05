package com.miguelemosreverte.HackerRank.SuperQueen


object Solution {

    class Matrix(var matrix: Array[Array[Boolean]]){
        def get(coordinate: Coordinate) : Boolean =
            matrix(coordinate.x)(coordinate.y)
        def set(coordinate: Coordinate): Unit =
            matrix(coordinate.x)(coordinate.y) = coordinate.value
        def setSafeCoordinates(matrix: Matrix, coordinates: Array[Coordinate]): Unit = {
            for(coordinate <- coordinates){
                matrix.set(coordinate)
            }
        }

        def this(pattern: String =
           """
             |- O O - O O -
             |O - - - - - O
             |O - - - - - O
             |- - - q - - -
             |O - - - - - O
             |O - - - - - O
             |- O O - O O -
           """.stripMargin) {
            this(
                pattern
                  .split("\\r?\\n")
                  .map(row =>
                      row
                        .split(" ")
                        .map(char => char == "O")))
        }
        override def toString(): String =
            matrix.map(row => row.map(bool => if (bool) "0"  else "-" ).mkString(" ")).mkString("\n")


        def toStringSingleLine(string: String):String =
            string
              .replaceAll("\n"," ")
              .replaceAll("-"," ")
              .replaceAll(" ","")

        def canEqual(a: Any) = a.isInstanceOf[Matrix]
        override def equals(that: Any): Boolean =
            toStringSingleLine(that.toString()) == toStringSingleLine(toString())
    }

    case class Coordinate(x:Int, y: Int, value: Boolean = false)


    def solveNSuperQueens(n: Int): Int = {

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
        // Fill Up this function body to display the number of arrangements
        // Of N Super-Quees on a chessboard
        4
    }


    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        println(solveNSuperQueens(readInt))
    }
}