// ---------------------------------------------------
// TAKING INPUT FROM USER AND STORING IN AN ARRAY
// import java.util.*;

// public class Array{
//     public static void main(String[] args) {
//         int marks[]=new int[100];
//         Scanner sc= new Scanner(System.in);

//         System.out.println(" length of an array:"+marks.length);

//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();
//         marks[3]=sc.nextInt();

//         System.out.println("physics marks is "+marks[0]);
//         System.out.println("chemistry marks is "+marks[1]);
//         System.out.println("maths marks is "+marks[2]);
//         System.out.println("english marks is "+marks[3]);
//        sc.close();
//        marks[2]=100;
//        System.out.println("Updated maths marks is "+marks[2]);

//        int perc=(marks[0]+marks[1]+marks[2]+marks[3])/4;
//          System.out.println("Percentage is "+perc+"%"); 
// }
//     }
// ------------------------------------------------------------------------
// TOPIC: INPUT ,OUTPUT AND UPDATING :

// import java.util.*;

// public class Array {
//     public static void update(int marks[]) {
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String[] args) {
//         int marks[] = { 97, 98, 99 };
//         update(marks);

//         // print our marks:
//         for (int i = 0; i < marks.length; i++) {
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }
// ----------------------------------------------------
// TOPIC: LARGEST OF AN ARRAY 
// import java.util.*;

// public class Array {
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;// -infinity
// int smallest= Integer.MAX_VALUE;// infinity 
//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if(smallest>numbers[i]){
//                 smallest = numbers[i];
//             }
//         }
//                 System.out.println("Smallest number is: " + smallest);

//         return largest;

//     }
//     public static void main(String[] args) {
//         int numbers[] = { 1, 2, 3, 4, 5 };
//         int largest = getLargest(numbers);
//         System.out.println("Largest number is: " + largest);

//     }
// }
//-------------------------------------------------------------------------
// # Binary Search :
// import java.util.*;

// public class Array {
//     public static int binarySearch(int numbers[], int key) {
//         int start = 0;
//         int end = numbers.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2;
//             // comparison :
//             if (numbers[mid] == key) {
//                 return mid;
//             }
//             if (numbers[mid] < key) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }

//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int key = 5;
//         System.out.println("index for key is:"+binarySearch(numbers,key));
//     }
// }

// -------------------------------------------------------------------------
// # Topic: REverse an Array : 
// import java.util.*;

// public class Array {
//     public static void reverse(int numbers[]){
//         int first=0,  last=numbers.length-1;
//         while(first<last){
//             // swap:
//             int temp=numbers[last];
//             numbers[last]=numbers[first];
//             numbers[first]=temp;
//             first++;
//             last--;
//         }

//     }

//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10};   
//         reverse(numbers);
//     for(int i=0;i<numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         }
//         System.out.println();
//     }
// }
// -----------------------------------------------------------------
// #PAIRING OF AN ARRAY :
// import java.util.*;

// public class Array {
//     public static void printPairs(int numbers[]) {
//        int tp=0;
//         for (int i = 0; i < numbers.length; i++) {
//             int curr = numbers[i];// 2,4,6,8,10
//             for (int j = i + 1; j < numbers.length; j++) {
//                 System.out.print("(" + curr + "," + numbers[j] + ") ");
//             tp++;
//         }
//             System.out.println();
//         }
//         System.out.println("total pairs="+tp);
//     }

//     public static void main(String[] args) {
//         int numbers[] = { 2, 4, 6, 8, 10 };
//         printPairs(numbers);
//     }
// }
// ------------------------------------------------------------------
// # TOPIC: SUBARRAYS OF AN ARRAY :
//  SUBARRAY SUM :
// TOTAL SUBARRAY SUM :
// import java.util.*;

// public class Array {

//     public static void printSubarrays(int numbers[]) {
//         int ts=0;
//         int totalSum = 0;
//         for (int start = 0; start < numbers.length; start++) {
//             for (int end = start; end < numbers.length; end++) {
//                 int subarraySum=0;
//                 // Print subarray from index start to end
//                 for (int k = start; k <= end; k++) {
//                     System.out.print(numbers[k] + " ");
//                     subarraySum += numbers[k];
//                 }
//                 ts++;
//                 totalSum+=subarraySum;
//                 System.out.println("Subarray sum:"+subarraySum); 
//             }
//             System.out.println();
//         }

//         System.out.println("Total subarrays: " + ts);
//         System.out.println("Total sum of all subarrays: " + totalSum);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printSubarrays(numbers);
//     }
// }
// -------------------------------------------------------
import java.util.*;

public class Array {
    public static void subarraysSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for (int j = i; j < numbers.length; j++) {
                 currSum=0;
                int end=j;

                for (int k = start; k <= end; k++) {
                    // subarray sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum)
                    maxSum = currSum;
                }
            }
        
        System.out.println("Maximum subarray sum: " + maxSum);
        }

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3 };
        subarraysSum(numbers);

    }
}
