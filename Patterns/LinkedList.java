// ## introduction of linked list ::
// Linked List is a linear data structure where elements are stored in nodes, and each node points to the next node.
// Unlike arrays, linked lists do not require contiguous memory allocation, allowing for dynamic memory usage.
// Linked lists consist of nodes, where each node contains data and a reference to the next node.
// This structure allows for efficient insertion and deletion of elements, making linked lists suitable for applications where
// frequent modifications to the data structure are required.
// Linked lists can be singly linked (each node points to the next) or doubly linked (each node points to both the next and previous nodes).
// The time complexity for insertion and deletion operations in a linked list is O(1) when the position is known, while searching for an element takes O(n) time.
// The space complexity of a linked list is O(n), where n is the number of nodes in the list.
// Linked lists are commonly used in applications such as implementing stacks, queues, and adjacency lists for
// representing graphs, as well as in scenarios where dynamic memory allocation is required.

// import java.util.LinkedList;

// public class LinkedList {

//     class Node{
//         int data;
//         Node next;
//  public Node(int data){
//     this.data=data;
//     this.next=null;
//  }
//     }
//      public static Node head;
//  public static Node tail;
// int size=0;
// // addFirst== method to add a node at the beginning of the linked list
// // complexity: O(1), as it only involves creating a new node and updating the head pointer.
//  public void addFirst(int data){
//     // step 1:create new node 
//     Node newNode=new Node(data);
//     if(head==null){
//         head=tail=newNode;
//         return;
//     }
//     // step 2:
//     newNode.next=head;// link new node to old head
//     // Step 3 : 
//     head=newNode;
// }
// // addLast== method to add a node at the end of the linked list.
// // This method creates a new node with the given data and appends it to the end of the linked list.
// public void addLast(int data){
//     Node newNode=new Node(data);
//     if(head==null){
//         head=tail=newNode;
//         return;
//     }
//     tail.next=newNode;
//     tail=newNode; // update tail to new node
// }
// // print method to display the linked list.
// // This method traverses the linked list and prints the data of each node.
// // complexity: O(n), where n is the number of nodes in the linked list.

// public void print(){
//     Node temp=head;
//     while(temp!=null){
//         System.out.print(temp.data+"->");
//         temp=temp.next;
//     }
//     System.out.println();
// }
// // add method to insert a node at a specific index.
// // This method creates a new node with the given data and inserts it at the specified index in the linked list.
// // complexity: O(n), where n is the number of nodes in the linked list, as it requires traversing the list to find the insertion point.
// public void add(int idx,int data){
//     Node newNode=new Node(data);
//     Node temp=head;
//     int i=0;

//     while(i<idx-1){
//         temp=temp.next;
//         i++;
//     }
//     newNode.next=temp.next;
//     temp.next=newNode;
// }
// // removeLast method to remove the last node from the linked list.
// // This method traverses the linked list to find the second-last node, updates its next pointer
// // to null, and updates the tail pointer to the second-last node.
// // complexity: O(n), where n is the number of nodes in the linked list, as it requires traversing the list to find the second-last node.
//   public int removeFirst() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return Integer.MIN_VALUE;
//         }
//         int val = head.data;
//         head = head.next;
//         size--; // ✅ decrement
//         if (head == null) {
//             tail = null;
//         }
//         return val;
//     }
// // removeLast method to remove the last node from the linked list.
//     public int removeLast() {
//         if (size == 0) {
//             System.out.println("List is empty");
//             return Integer.MIN_VALUE;
//         } else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         Node prev = head;
//         for (int i = 0; i < size - 2; i++) {
//             prev = prev.next;
//         }
//         int val = tail.data;
//         prev.next = null;
//         tail = prev;
//         size--; // ✅ decrement
//         return val;
//     }
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.addFirst(1);
//         list.addFirst(2);
//         list.addLast(3);
//         list.addLast(4);
//         list.add(2, 5); // Adding 5 at index 2
//         System.out.println("Linked List after adding elements:");
//         list.print();
//         System.out.println("Head: " + head.data);

//     System.out.println("\nRemoving first element: " + list.removeFirst()); 
// list.print(); 

// System.out.println("\nRemoving last element: " + list.removeLast());
// list.print(); 
//     }
// }
// ----------------------------------------------------------------------------------------------------------------------------------
public class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    int size = 0;

    // Add at beginning (O(1))
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at end (O(1))
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add at specific index (O(n))
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Remove from beginning (O(1))
    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
        return val;
    }

    // Remove from end (O(n))
    public int removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Print linked list (O(n))
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get current size of linked list
    public int getSize() {
        return size;
    }

    // recurisve serach 
public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}
public int recSearch(int key)
{
    return helper(head,key);
}
    // Main method to test the list
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.add(2, 5); // insert 5 at index 2

        System.out.println("Linked List after adding elements:");
        list.print();
        System.out.println("Size: " + list.getSize());
        System.out.println("Head: " + head.data);

        System.out.println("\nRemoving first element: " + list.removeFirst());
        list.print();
        System.out.println("Size: " + list.getSize());

        System.out.println("\nRemoving last element: " + list.removeLast());
        list.print();
        System.out.println("Size: " + list.getSize());

        System.out.println("recursive Search:" + list.recSearch(3));
    }
}


  


