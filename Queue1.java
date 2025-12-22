// public class Queue1{
//     static class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queue{
//         static Node head = null; // front of queue
//         static Node tail = null; // rear of queue
//         // isEmpty
//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }
//         // Enqueue - add to tail
//         public static void enqueue(int data) {
//             Node newNode = new Node(data);
//             if (tail == null) {
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }
//         // Dequeue - remove from head
//         public static int dequeue() {
//             if (isEmpty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             int result = head.data;
//             head = head.next;
//             if (head == null) {
//                 tail = null;
//             }
//             return result;
//         }
//         // Peek - see head
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.enqueue(100);
//         q.enqueue(200);
//         q.enqueue(300);

// while(!q.isEmpty()){
//         System.out.println("Peek: " + q.peek());
//         q.dequeue();
//         // System.out.println("Dequeued: " + q.dequeue());
//         // System.out.println("Peek after dequeue: " + q.peek());
      
//     }
// }
// }
// --------------------------------------------------------------------------------------------------------------------

