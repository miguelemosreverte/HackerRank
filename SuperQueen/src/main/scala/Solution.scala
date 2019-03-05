package com.miguelemosreverte.HackerRank.SuperQueen


object Solution {

    class Matrix(matrix: Array[Array[Boolean]]){
        def get(coordinate: Coordinate) : Boolean =
            matrix(coordinate.x)(coordinate.y)
        def set(coordinate: Coordinate): Unit =
            matrix(coordinate.x)(coordinate.y) = coordinate.value
        def setSafeCoordinates(matrix: Matrix, coordinates: Coordinate): Unit = {
            for(coordinate <- coordinates){
                matrix.set(coordinate)
            }
        }
        override def toString(): String =
            matrix.map(row => row.map(bool => if (bool) "0"  else "-" ).mkString(" ")).mkString("\n")
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