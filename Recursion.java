// ## Recursion: 
// Recursion is a programming technique where a function calls itself to solve a problem. It is often used to break down complex problems into simpler subproblems.
// A recursive function typically has two main components: the base case and the recursive case. The base case is a condition that stops the recursion, while the recursive case is where the function calls itself with modified arguments.
// Recursion can be used to solve problems like calculating factorials, Fibonacci numbers, and traversing data structures like trees and graphs.
// Time Complexity: The time complexity of a recursive function depends on the problem being solved. For example, the time complexity of calculating factorial using recursion is O(n), where n is the input number.

// ------------------------------------------------------------------------------------
// ## print factorial of a number using recursion
// Factorial of a number n (denoted as n!) is the product of all positive

// public class Recursion {
//     public static int fact(int n){
//          if(n==0){
//     return 1;
//     }
//         int fnm1=fact(n-1);
//         int fn=n*fact(n-1);
//         return fn;
//     }

//     public static void main(String[] args) {
//         int n=5;
//         System.out.println("Factorial of '" + n + "' is:" + fact(n));
//     }  
//     }
    // ------------------------------------------------------- 
    // ## Print sum of N natural Numbers :
    // The sum of the first N natural numbers can be calculated using the formula: sum = N * (N + 1) / 2.

//     public class Recursion{
//         public static int CalSum(int n){
//             if(n==0){
//                 return 0;
//             }
//             int snm1=CalSum(n-1);
//             int sn=n+snm1; // int sn=n+Calsum(n-1);
//             return sn;
//         }
//         public static void main(String[] args) {
//             int n=2;
//             System.out.println("Sum of first " + n + " natural numbers is: " + CalSum(n));
//         }
//     }
// // -------------------------------------------------------
// ## Print  Nth Fibonacci Series using Recursion:: 
// The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. The series can be defined recursively as follows:
// F(0) = 0
// F(1) = 1
// F(n) = F(n-1) + F(n-2)

//  public class Recursion {
//    public static int fib(int n) { 
//       if (n == 0) {
//         return 0;
//     }
//     if (n == 1) {
//         return 1;
//     }
//     int fbn1=fib(n-1);
//     int fibn2=fib(n-2);
   
//     int fn = fbn1 + fibn2; // int fn=fib(n-1)+fib(n-2);
//     return fn;
//    }
//    public static void main(String[] args) {
//         int n = 6; 
//         System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
//     }
// }

// -------------------------------------------------------
// ## Print First n Fibonacci Numbers (Recursive)
// The Fibonacci series can also be printed iteratively or recursively. Here, we will use recursion to print the first n Fibonacci numbers.

// public class FibonacciRecursive {
// // Recursive method :
//     public static int fib(int n) {
//         if (n == 0) return 0;      // base case 1
//         if (n == 1) return 1;      // base case 2
//         return fib(n - 1) + fib(n - 2);  // recursive call
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("Fibonacci series up to " + n + " terms:");
//         for (int i = 0; i < n; i++) {
//         System.out.print(fib(i) + " ");
//         }
//     }
// }

// ---------------------------------------------------------------
// ## Check if an array is sorted or not :
// An array is considered sorted if the elements are in non-decreasing order. We can check if an array is sorted using recursion by comparing adjacent elements.

// public class Recursion{
// public static boolean isSorted(int[] arr, int index) { 
//     if (index == arr.length - 1) {
//         return true;
//     }
//     if (arr[index] <= arr[index + 1]) {
//         return isSorted(arr, index + 1);
//     }
//      else {
//         return false;
//     }
// }
// public static void main(String[] args) {
//     // int arr[]={1,3,2,3,4,5};
//     int arr[]={5};
//     System.out.println("is array sorted ? :: "+ isSorted(arr,0));
// }
// }
// ----------------------------------------------------------------
// ## LAST OCCURENCE OF AN ELEMENT IN AN ARRAY :
// The last occurrence of an element in an array can be found using recursion by traversing the array from the end to the beginning.

public class Recursion{
    public static int Firstoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1; // Base case 
        }
        if (arr[i] == key) {
            return i; // Found the element
        }
        return Firstoccurence(arr, key, i + 1); // Recursive call
    }
    public static int Lastoccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1; // Base case
        }
       int isFound = Lastoccurence(arr, key,i+1); // Recursive call
        
       if (isFound == -1 && arr[i]==key) {
            return i; // If found in the recursive call, return the index
        }
        // If not found in the recursive call, return the previous result
        return isFound; // Otherwise, return the result of the recursive call
    }
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 2, 5};
            int key = 2;
         System.out.println("First occurrence of " + key + " is at index: " + Firstoccurence(arr, key, 0));
        System.out.println("Last occurrence of " + key + " is at index: " + Lastoccurence(arr, key, 0));
        }
    }
// -----------------------------------------------------------------------
        
