// ## 2D Arrays :  Creation, Input, and Output
// 2D arrays are arrays of arrays, allowing us to create a matrix-like structure.
// They are useful for representing data in rows and columns, such as matrices or grids.
// In Java, a 2D array is declared as `int[][] matrix` or int matrix[][]`, and can be initialized with specific dimensions.


// import java.util.Scanner;
// public class TWODarrays {
//     public static void main(String args[]){
//          Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int n=sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int m=sc.nextInt();
//         int matrix[][]=new int [n][m];

//         // Input:2

//         // Scanner sc =new Scanner(System.in);
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         //output :
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// -----------------------------------------------------------------------------------------------------------------
// ## SPIRAL MATRIX:
// The spiral matrix problem involves printing the elements of a 2D array in a spiral order.
// The following code implements a solution to print the elements of a 2D array in spiral
// order, starting from the top-left corner and moving inwards in a clockwise direction.

// import java.util.Scanner;
// import java.util.Arrays;

//     public class TWODarrays{
//         public static void printSpiralMatrix(int matrix[][]){
//             int startRow=0;
//             int startCol=0;
//             int endRow=matrix.length-1;
//             int endCol=matrix[0].length-1;
//             while(startRow<=endRow && startCol<=endCol){
//                 // TOP: 
//                 for(int j=startCol;j<=endCol;j++){
//                     System.out.println(matrix[startRow][j]+" ");
//                 }
//                 // Right :
//                 for(int i=startRow+1;i<=endRow;i++){
//                     System.out.println(matrix[i][endCol]+" ");
//                 }
//                 // Bottom:
//                 for(int j=endCol-1;j>=startCol;j--){
//                     if(startRow==endRow) 
//                     break; // To avoid printing the same row again
//                     System.out.println(matrix[endRow][j]+" ");
//                 }
//                 // Left:
//                 for(int i=endRow-1;i>=startRow;i--){
//                     if(startCol==endCol)
//                      break; // To avoid printing the same column again
//                     System.out.println(matrix[i][startCol]+" ");
//                 }
//                 startRow++;
//                 startCol++;
//                 endRow--;
//                 endCol--;
//             }

//         }
//         public static void main(String[] args) {
//             int matrix[][] = {
//                 {1, 2, 3, 4},
//                 {5, 6, 7, 8},
//                 {9, 10, 11, 12},
//                 {13, 14, 15, 16}
//             };
//             printSpiralMatrix(matrix);
//         }
//     }

 // ------------------------------------------------------------------------------------------------------------------------------------------------------
    // ## DIAGONAL SUM OF A 2D ARRAY :

    // import java.util.Scanner;
    // public class TWODarrays{
    //     public static int diagonalSum(int matrix[][]){
    //         int sum=0;
    //         for(int i=0;i<matrix.length;i++){
    //             for(int j=0;j<matrix[0].length;j++){
    //                 if(i==j){
    //                     sum+=matrix[i][j];
    //                 }
    //                 else if(i+j==matrix.length-1){
    //                     sum+=matrix[i][j];
    //                 }
    //             }
    //         }
    //         return sum;
    //     }
    //     public static void main(String args[]){
    //         int matrix[][] = {
    //             {1, 2, 3, 4},
    //             {5, 6, 7, 8},
    //             {9, 10, 11, 12},
    //             {13, 14, 15, 16}
    //         };
    //         System.out.println("Diagonal Sum: " + diagonalSum(matrix));
    //     }
    // }
 // ---------------------------------------------------------------------------------------------------------------------