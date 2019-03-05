People on Mars have slightly different pieces on their Chessboard. One of them is a Super-Queen. A Super-Queen is a combination of a Queen and a Knight.

So, any of the following squares are in the "zone of power" of a Super-Queen.
1. A square in the same row or column as the Super-Queen
2. A square lying on a line drawn diagonally through the square on which the Super-Queen is.
3. A square lying in an 'L-Shape' with the Queen: This includes any square which is (2 rows, 1 column) away from the Queen or (1 row, 2 columns) away from the Queen.

So, if the Super-Queen is placed at the position 'q' marked on this chessboard below, the squares marked with hyphens '-' are squares threatened by possible 'attack' from the Super-Queen, and the squares marked by '0' are squares which are safe from the Super-Queen.
```
- O O - O O -
O - - - - - O
O - - - - - O
- - - q - - -
O - - - - - O
O - - - - - O
- O O - O O -
```
# Task
Your tasks is to compute the number of ways to place N Super-Queens on an N x N Chessboard such that none of the Super-Queens are in conflict with each other. Ignore the fact that some of these arrangements are reflections and rotations of each other: all of them count as unique positionings.

Input Format

One Integer N (which is the number of rows in the chessboard).

Constraint

Output Format

One Integer W, which is the number of ways to place N Super-Queens in the prescribed manner.

Sample Input

##### 10
Sample Output

##### 4

-------------------------------------

Explanations

These are the various combinations of positions of 10 Super-Queens on a 10x10 Chessboard such that none of them will be in conflict. Assume that the rows as well as the columns are numbered 1 to 10.

Combination 1

`
(10,8), (9,5), (8,2), (7,10), (6,7), (5,4), (4,1), (3,9), (2,6), (1,3)
`

Explanation of Combination 1: 
```
A Super-Queen can be placed on (Row 10, Column 8), 
the second can be placed at (Row 9, Column 5), 
the third can be placed at (Row 8, Column2)... 
and so on... 
without any of the Super-Queens 
being in conflict with each other.
```

Combination 2

`(10,7), (9,3), (8,10), (7,6), (6,2), (5,9), (4,5), (3,1), (2,8), (1,4)`

Combination 3

`(10,4), (9,8), (8,1), (7,5), (6,9), (5,2), (4,6), (3,10), (2,3), (1,7)`

Combination 4

`(10,3), (9,6), (8,9), (7,1), (6,4), (5,7), (4,10), (3,2), (2,5), (1,8)`