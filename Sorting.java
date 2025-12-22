// ## TOPIC : BUBBLE SORTING :
// Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The pass through the
// list is repeated until the list is sorted. The algorithm gets its name from the way larger elements "bubble" to the top of the list.
// Time Complexity: O(n^2) in worst case, O(n) in best case (when the array is already sorted).


// import java.util.*;
// public class Sorting {
//     public static void BubbleSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     //SWAP:
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
        
//     }
//     public static void PrintArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main (String args []){
//         int arr[]={5,4,3,2,1};
//         BubbleSort(arr);
//         PrintArr(arr);
//     }
// }

// -------------------------------------------------------------------------------------------------------------------
// ## INSERTION SORT :
// Insertion Sort is a simple sorting algorithm that builds a sorted array one element at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
// Time Complexity: O(n^2) in worst case, O(n) in best case    


// import java.util.Arrays;
// import java.util.Collections;
// public class Sorting {
//     public static void InsertionSort(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int current = arr[i];
//             int j = i - 1;
//             // Shift elements of arr[0..i-1], that are greater than current, to one position ahead
//             // FInd out Correct Position To Insert :
//             while (j >= 0 && arr[j] > current) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             // Insertion :
//             arr[j + 1] = current; // Place the current element in its correct position
//         }
//     }
// public static void countingSort(int arr[]){
//     int largest=Integer.MIN_VALUE;
//     for(int i=0;i<arr.length;i++){
//         largest=Math.max(largest,arr[i]);
//     }
//     int count[]=new int [largest+1];
//     for(int i=0;i<arr.length;i++){
//         count[arr[i]]++;
//     } 
//     // SORTING :
//     int j=0;
//     for(int i=0;i<arr.length;i++){
//         while(count[i]>0){
//             arr[j]=i;
//             j++;
//             count[i]--;
//         }

//     }
// }
// //     public static int compare(int a,int b)
// // {
// //     // a<b:-ve 
// //     // a==b,0
// //     // a>b:+ve
// //     return a-b;
// // }


//     public static void PrintArr(int  arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {5, 4, 3, 2, 1};
//         //Integer arr[]={5,4,3,2,1}; used for reverse sorting ;
//        // InsertionSort(arr);
//        countingSort(arr);
//       //  Arrays.sort(arr);
//        // Arrays.sort(arr,0,3,Collections.reverseOrder());
//          PrintArr(arr);
//     }
// }
// ------------------------------------------------------------------------------------------------------------------------------  
## Merge Sort :
// Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves, recursively sorts each half, and then merges the sorted halves back together.
// Time Complexity: O(n log n) in all cases (worst, average, and best).
// import java.util.Arrays;
// public class Sorting {
//     public static void merge(int arr[], int si, int mid, int ei) {
//         int temp[] = new int[ei - si + 1];
//         int i = si; // Starting index of the left subarray
//         int j = mid + 1; // Starting index of the right subarray 
//         int k = 0; // Index for the temporary array



//         // Merging the two subarrays
//         while (i <= mid && j <= ei) {

// ------------------------------------------------------------------------------------------------------------------------------------------------------
// ### Counting Sort:
// Counting Sort is an integer sorting algorithm that counts the occurrences of each unique element in the input array and uses this information to place each element in its correct position in the output array.
// It is particularly efficient for sorting integers within a known range.
// Time Complexity: O(n + k), where n is the number of elements in the input array and k is the range of the input values.
// Counting Sort is not a comparison-based sort and is not suitable for sorting floating-point numbers or strings.


// import java.util.Arrays;
// public class Sorting {
//     public static void countingSort(int arr[]) {
//     int largest = Integer.MIN_VALUE;
//     for (int i = 0; i < arr.length; i++) {
//         largest = Math.max(largest, arr[i]);
//     }

//     int count[] = new int[largest + 1];

//     // Count the occurrences
//     for (int i = 0; i < arr.length; i++) {
//         count[arr[i]]++;
//     }

//     // Sort the original array using count[]
//     int j = 0;
//     for (int i = 0; i < count.length; i++) {  // ✅ Fix: loop through count.length instead of arr.length
//         while (count[i] > 0) {
//             arr[j] = i;
//             j++;
//             count[i]--;
//         }
//     }
// }

//     public static void PrintArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         // int arr[] = {5, 4, 3, 2, 1};
//         int arr[]={1,4,1,3,2,4,3,7};
//         countingSort(arr);
//         PrintArr(arr);
//     }
// }
// --------------------------------------------------------------------
// ## SELECTION SORT :
// Selection Sort is a simple sorting algorithm that divides the input list into two parts: a sorted part and an unsorted part. It repeatedly selects the smallest (or largest) element from the unsorted part and moves it to the end of the sorted part.
// Time Complexity: O(n^2) in worst case, O(n^2) in best case (always)

import java.util.*;
public class Sorting{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPOS=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPOS]>arr[j]){
                    minPOS=j;  // Update the position of the minimum element
                }
            }
//swap : current pos ke sath :
int temp=arr[minPOS];
arr[minPOS]=arr[i];
arr[i]=temp;
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        selectionSort(arr);
        PrintArr(arr);
    }
}
// ------------------------------------------------------------------------------------------------------------------------------------------------------