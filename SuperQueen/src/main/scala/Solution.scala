package com.miguelemosreverte.HackerRank.SuperQueen


object Solution {

    case class Matrix(matrix: Array[Array[Boolean]]) {
        def get(coordinate: Coordinate): Boolean =
            matrix(coordinate.x)(coordinate.y)

        def set(coordinate: Coordinate): Unit =
            matrix(coordinate.x)(coordinate.y) = coordinate.value

        def setSafeCoordinates(matrix: Matrix, coordinates: Array[Coordinate]): Unit = {
            for (coordinate <- coordinates) {
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
            matrix.map(row => row.map(bool => if (bool) "0" else "-").mkString(" ")).mkString("\n")


        def toStringSingleLine(string: String): String =
            string
              .replaceAll("\n", " ")
              .replaceAll("-", " ")
              .replaceAll(" ", "")

        def canEqual(a: Any) = a.isInstanceOf[Matrix]

        override def equals(that: Any): Boolean =
            toStringSingleLine(that.toString()) == toStringSingleLine(toString())

    }

    object Matrix {
        def pasteMatrixAtCoordinate(coordinate: Coordinate,
                                    old_matrix: Matrix,
                                    pasted_matrix: Matrix,
                                    predicate: (Coordinate, Coordinate) => Boolean =
                                        (old:Coordinate, newer:Coordinate) => old.value || newer.value
                                   ): Matrix = {
            val matrix = old_matrix.matrix
            def inside(x:Int, y:Int):Boolean ={
                try{
                    val value = pasted_matrix.matrix(x)(y)
                    true
                }
                catch {
                    case e: ArrayIndexOutOfBoundsException => false
                }
            }
            def paste(x_ : Int, y_ : Int): Boolean = {
                // too JAVA-like maybe?
                val x = x_ + coordinate.x
                val y = y_ + coordinate.y
                try {
                    predicate(Coordinate(x, y, matrix(x)(y)), Coordinate(x, y, pasted_matrix.matrix(x)(y)))
                }
                catch {
                    case e: ArrayIndexOutOfBoundsException => matrix(x_)(y_)
                }
            }
            val result = matrix.indices.map( x =>
                matrix(x).indices.map(y =>
                   paste(x,y)
            ).toArray).toArray
            Matrix(result)
        }
    }

    case class Coordinate(x:Int, y: Int, value: Boolean = false)


    def solveNSuperQueens(n: Int): Int = {

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