// ## TOPIC :: valid parenthesis 

// import java.util.*;

// public class Stack2 {

//     public static boolean isValid(String str) {
//         Stack<Character> s = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             // opening
//             if (ch == '(' || ch == '[' || ch == '{') {
//                 s.push(ch);
//             }
//             // closing
//             else if (ch == ')' || ch == ']' || ch == '}') {
//                 if (s.isEmpty()) {
//                     return false;
//                 }
//                 if ((ch == ')' && s.peek() == '(') ||
//                     (ch == '}' && s.peek() == '{') ||
//                     (ch == ']' && s.peek() == '[')) {
//                     s.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         return s.isEmpty();
//     }

//     public static void main(String[] args) {
//         String str = "((){}])";
//         System.out.println(" the given parthesis is :" + isValid(str)); // true
//     }
// }

// --------------------------------------------------------------------------------------------------
// ## TOPIC :: DUPLICATE PARENTHESIS ::
import java.util.*;

public class Stack2 {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing bracket
            if (ch == ')') {
                int count = 0;

                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // If there are 0 or 1 elements inside the brackets, it's a duplicate
                if (count <= 1) {
                    return true;
                }

                // Pop the opening bracket '('
                if (!s.isEmpty()) {
                    s.pop();
                }

            } else {
                // push every character (including '(') into stack
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "(+)";  // Duplicate
        String str2 = "(a+(b)/c)"; // Not Duplicate
        String str3 = "(a+b*(c-d))"; // Not Duplicate

        System.out.println(isDuplicate(str1)); // true
        System.out.println(isDuplicate(str2)); // false
        System.out.println(isDuplicate(str3)); // false
    }
}

// ------------------------------------------------------------------------------------------------------------------------
