// ## TOPIC: SUBARRAYS
// Subarrays are contiguous parts of an array. For an array of size n, there are
// n * (n + 1) / 2 possible subarrays. Each subarray can be defined by its starting and ending indices.
// The following code prints all possible subarrays of a given array.

import java.util.*;

public class Array1 {
    public static void printSubarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();  // New line after each subarray
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}

// -----------------------------------------------------------------------------------------------------------------------------------------
// ## TOPIC: MAXIMUM SUBARRAY SUM
// The maximum subarray sum problem involves finding the contiguous subarray within a one-dimensional array of
// numbers which has the largest sum. The following code implements a brute-force solution to find the maximum subarray sum.

// import java.util.*;
// // This approach checks all possible subarrays and calculates their sums, keeping track of the maximum sum found.
// // It has a time complexity of O(n^3), which is inefficient for large arrays.

// public class Array1{
//     public static void MaxSubarraySum(int numbers[]){
//         int maxSum=Integer.MIN_VALUE;
//         int CurrSum=0;
//     for(int i=0;i<numbers.length;i++){
//         int start=i;
       
        
//         for(int j=0; j <numbers.length;j++){
//             int end=j;
//             CurrSum=0;  // Reset current sum for each new subarray
//             for(int k=start;k<=end;k++){
//                 CurrSum+=numbers[k];  // Calculate sum of the current subarray
//             }
//             System.out.println(CurrSum);
//             if(CurrSum>maxSum){
//                 maxSum=CurrSum;
//             }
//         }
//     } 
//     System.out.println("Maximum Subarray Sum: " + maxSum);
//     }
//     public static void main(String[] args){
//         int numbers[]={2,4,6,8};
//         MaxSubarraySum(numbers);
//     }
//    }
// -------------------------------------------------------------------------------------------------------------------------------