// import java.util.Stack;

// public class Stack1{
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         // 1. Push elements onto the stack
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         System.out.println("1. Stack after pushing elements: " + stack);

//         // 2. Pop an element from the stack
//         int poppedElement = stack.pop();
//         System.out.println("2. Popped Element: " + poppedElement);
//         System.out.println("3. Stack after popping an element: " + stack);

//         // 3. Check the size of the stack
//         int size = stack.size();
//         System.out.println("3. Stack Size: " + size);

//         // 4. Peek at the top element of the stack
//         int topElement = stack.peek();
//         System.out.println("4. Top Element: " + topElement);

//         // 5. Check if the stack is empty
//         boolean isEmpty = stack.isEmpty();
//         System.out.println("5. Is Stack Empty? " + isEmpty);
        
//         // 6. Search for an element in the stack
//         int searchElement = 20;
//         int position = stack.search(searchElement);
//         if (position != -1) {
//             System.out.println("6. Element " + searchElement + " found at position: " + position);
//         } else {
//             System.out.println("6. Element " + searchElement + " not found in the stack.");
//         }
//     }
// }
// ---------------------------------------------------------------------------------------------------------------------------------
// ## TOPIC : STACK USING ARRAYLIST :
// import java.util.ArrayList;
// public class Stack1{
//     static class Stack{
//        static ArrayList<Integer> list=new ArrayList<>();
//          public static boolean isEmpty(){
//               return list.size()==0;
//          }
//          // push operation:
//          public static void push(int data){
//             list.add(data);

//          }
//             // pop operation:
//             public static int pop(){
//                 if(isEmpty()){
//                     return -1;
//                 }
//                 int top=list.get(list.size()-1);
//                 list.remove(list.size()-1);
//                 return top;
//             }
//             // peek operation:
//             public static int peek(){
//                 if(isEmpty()){
//                     return -1;
//                 }
//                 return list.get(list.size()-1);
//             }
//             // size operation:
//             public static int size(){
//                 if(isEmpty()){
//                     return 0;
//                 }
//                 return list.size();
//             }
//         }
//             public static void main(String[] args) {
//                 Stack s= new Stack();
//                 s.push(10);
//                 s.push(20);
//                 s.push(30);
//                 while(!s.isEmpty()){
//                     System.out.println(s.peek());
//                     s.pop();
//                 }
//             }

//     }
// ----------------------------------------------------------------------------------------------------------------------------------
// ## TOPIC : STACK USING LINKED LIST :
// ## TOPIC : STACK USING LINKED LIST (with display method)

// public class Stack1{

//     // Node structure
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Stack implementation
//     static class Stack {
//         private Node head; // top of the stack

//         // Check if the stack is empty
//         public boolean isEmpty() {
//             return head == null;
//         }

//         // Push operation
//         public void push(int data) {
//             Node newNode = new Node(data);
//             newNode.next = head;
//             head = newNode;
//             System.out.println("Pushed: " + data);
//         }

//         // Pop operation
//         public int pop() {
//             if (isEmpty()) {
//                 System.out.println("Stack Underflow!");
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             System.out.println("Popped: " + top);
//             return top;
//         }

//         // Peek operation
//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Stack is empty!");
//                 return -1;
//             }
//             return head.data;
//         }

//         // Display all stack elements
//         public void display() {
//             if (isEmpty()) {
//                 System.out.println("Stack is empty!");
//                 return;
//             }
//             Node temp = head;
//             System.out.print("Stack (top to bottom): ");
//             while (temp != null) {
//                 System.out.print(temp.data + " -> ");
//                 temp = temp.next;
//             }
//             System.out.println("null");
//         }
//     }

//     // Main method to test the stack
//     public static void main(String[] args) {
//         Stack stack = new Stack();

//         stack.push(10);
//         stack.push(20);
//         stack.push(30);

//         stack.display();

//         System.out.println("Top element is: " + stack.peek());

//         stack.pop();
//         stack.display();

//         stack.pop();
//         stack.pop();
//         stack.pop(); // extra pop to show underflow

//         stack.display();
//     }
// }
// ------------------------------------------------------------------------------------------------------------------
 // ## push at bottom of stack ::
//  import java.util.Stack;
//  public class Stack1 {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         System.out.println("Stack before pushing at bottom: " + stack);
//         pushAtBottom(stack, 5);
//         System.out.println("Stack after pushing at bottom: " + stack);
//     }

//     // Function to push an element at the bottom of the stack
//     public static void pushAtBottom(Stack<Integer> stack, int data) {
//         if (stack.isEmpty()) {
//             stack.push(data);
//         } else {
//             int top = stack.pop();
//             pushAtBottom(stack, data);
//             stack.push(top);
//         }
//     }
// }

// // -------------------------------------------------------------------------------------------------------------------
// ##Reverse a String using a Stack :: Google,amazon 

// import java.util.Stack;
// public class Stcak1{
//     public static String reverseString(String str){
//         Stack<Character> s=new Stack<>();
//         int idx=0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }
//         StringBuilder result=new StringBuilder("");
//         while(!s.isEmpty()){
//             char curr=s.pop();
//             result.append(curr);

//         }
//         return result.toString();
//     }
//     public static void main(String[] args) {
//         String str="abcd";
//         String result=reverseString(str);
//         System.out.println(result);
//         }

// }


// ------------------------------------------------------------------------------------------------------------------
// ## : Reverse a Stack :

// import java.util.Stack;
// public class Stack1{
//     public static void pushAtBottom(Stack<Integer>s,int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top=s.pop();
//         pushAtBottom(s,data);
//         s.push(top);
//     }
//     public static  void reverseStack(Stack<Integer>s){
//         if(!s.isEmpty()){
//             return;
        
//         }
//         int top=s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);
//     }
//     public static void printStack(Stack<Integer>s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s=new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     s.push(4);
//     System.out.println("after reverssing stack :");
//     reverseStack(s);
//     printStack(s);


//     }
    
// }
// --------------------------------------------------------------------------------------------------------------------
// ## STOCK SPAN PROBLEM :
import java.util.*;
public class Stack1{
    public static void stockSpan(int stocks[],int span[]){
        Stack <Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);

        for(int i=1;i<stocks.length;i++){
            int currPrice=stocks[i];
            while(!s.isEmpty() && currPrice>stocks[s.peek()]){
                s.pop();

            }
            if(!s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevhigh=s.peek();
                span[i]=i-prevhigh;
            }
            s.push(i);

        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]+" ");
        }

    }

}


