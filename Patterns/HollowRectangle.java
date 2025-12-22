// public class HollowRectangle {
//     public static void main(String[] args) {
//         int rows = 5; // Number of rows
//         int cols = 10; // Number of columns

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 // Print '*' for the first and last row, or the first and last column
//                 if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//     }
// }
// --------------------------------------------------------------------
public class HollowRectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop for rows
        for (int i = 1; i <= totRows; i++) {
            // inner loop for columns
            for (int j = 1; j <= totCols; j++) {
                // boundary condition
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");  // ✅ same line
                } else {
                    System.out.print(" ");  // ✅ same line
                }
            }
            System.out.println();  // ✅ move to next line after each row
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(4, 5);
    }
}
// ------------------------------------------------------------------------------------------------------------
