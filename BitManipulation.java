// public class BitManipulation {
 // ## Bit Manipulation Operations:
 // These methods demonstrate basic bit manipulation operations such as getting, setting, clearing, and updating
// a specific bit in an integer. The operations are performed using bitwise operators.

    // public static int getBit(int n, int pos) {
    //     return (n & (1 << pos)) != 0 ? 1 : 0;
    // }

    // public static int setBit(int n, int pos) {
    //     return n | (1 << pos);
    // }

    // public static int clearBit(int n, int pos) {
    //     return n & ~(1 << pos);
    // }

    // public static int updateBit(int n, int pos, int value) {
    //     n = clearBit(n, pos);
    //     return n | (value << pos);
    // }



//     public static void main(String[] args) {
         // int n = 5; // Binary: 0101
        // int pos = 1;

         // System.out.println("Original number: " + n);
        // System.out.println("Bit at position " + pos + ": " + getBit(n, pos));
        
         // n = setBit(n, pos);
         // System.out.println("After setting bit at position " + pos + ": " + n);
        
         // n = clearBit(n, pos);
        // System.out.println("After clearing bit at position " + pos + ": " + n);
        
         // n = updateBit(n, pos, 1);
         // System.out.println("After updating bit at position " + pos + " to 1: " + n);


// // bitwise operators :
// System.out.println(( "Bitwise and:" + (5 & 6))); // AND operation
// System.out.println(( "Bitwise or:" + (5 | 6))); // OR operation
// System.out.println(( "Bitwise xor:" + (5 ^ 6))); // XOR operation
// System.out.println(( "Bitwise not:" + (~5))); // NOT operation
// // Left Shift and Right Shift operations
// System.out.println(( "Left shift by 1:" + (5 << 1))); // Left shift by 1 (equivalent to multiplying by 2)
// System.out.println(( "Right shift by 1:" + (5 >> 1))); // Right shift by 1 (equivalent to dividing by 2)
// // Unsigned Right Shift operation
// System.out.println(( "Unsigned right shift by 1:" + (5 >>> 1))); // Unsigned right shift by 1
// // Bitwise operations on negative numbers
// System.out.println(( "AND operation with negative number:" + (-5 & 6))); // AND operation with negative number
// System.out.println(( "OR operation with negative number:" + (-5 | 6))); // OR operation with negative number
// System.out.println(( "XOR operation with negative number:" + (-5 ^ 6))); // XOR operation with negative number
// System.out.println(( "NOT operation with negative number:" + (~(-5)))); // NOT operation with negative number
// // Left Shift and Right Shift operations on negative numbers
// System.out.println(( "Left shift by 1:" + (-5 << 1))); // Left shift by 1 on negative number
// System.out.println(( "Right shift by 1:" + (-5 >> 1))); // Right shift by 1 on negative number
// System.out.println(( "Unsigned right shift by 1:" + (-5 >>> 1))); // Unsigned right shift by 1 on negative number
// // Bitwise operations on zero
// System.out.println(( "AND operation with zero:" + (0 & 6))); // AND operation with zero
// System.out.println(( "OR operation with zero:" + (0 | 6))); // OR operation with zero
// System.out.println(( "XOR operation with zero:" + (0 ^ 6))); // XOR operation with zero
// System.out.println(( "NOT operation with zero:" + (~0))); // NOT operation with zero
// // Left Shift and Right Shift operations on zero
// System.out.println(( "Left shift by 1:" + (0 << 1))); // Left shift by 1 on zero
// System.out.println(( "Right shift by 1:" + (0 >> 1))); // Right shift by 1 on zero
// System.out.println(( "Unsigned right shift by 1:" + (0 >>> 1))); // Unsigned right shift by 1 on zero

//     }
// }
// -------------------------------------------------------------------------------------------------------------------

// ## TOPIC : check odd or even number using bit manipulation:
// public class BitManipulation {

//     public static boolean isOdd(int n) {
//         return (n & 1) == 1; // Check if the least significant bit is set
//     }

//     public static void main(String[] args) {
//         int number = 5; // Example number
//         if (isOdd(number)) {
//             System.out.println(number + " is odd.");
//         } else {
//             System.out.println(number + " is even.");
//         }
//     }
// }
// --------------------------------------------------------------------------------------------------------

