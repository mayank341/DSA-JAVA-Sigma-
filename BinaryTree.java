// ## TOPIC :: PRE ORDER TRAVERSAL 
// public class BinaryTree {
//     static class Node {
//         Node left;
//         Node right;
//         int data;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     static class TreeBuilder {
//         static int idx = -1;

//         public static Node buildTree(int[] nodes) {
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
//             return newNode;
//         }
//     }
//     // # Pre-order traversal: root → left → right
//     public static void preOrder(Node root) {
//         if (root == null) {
//             return;
//         }
//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }
//     // ## In-order traversal :: left ->root->right.
//     public static void inOrder(Node root){
//         if(root==null){
//             return;
//         }
//         inOrder(root.left);
//         System.out.println(root.data+" ");
//         inOrder(root.right);
//     }

//     // ## post-order Traversal :: left->right->root.

//     public static void postOrder(Node root){
//         if(root==null){
//             return ;
//         }
//         postOrder(root.left);
//         postOrder(root.right);
//         System.out.println(root.data+" ");
//     }
//     public static void main(String[] args) {
//         int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//         Node root = TreeBuilder.buildTree(nodes);
//         System.out.println("root node of preorder :"+ root.data);
        
//         System.out.println("Pre-order Traversal:");
//         // preOrder(root);
//         // inOrder(root);
//         postOrder(root);
//     }
// }
// -------------------------------------------------------------------------------------------------------------------------
// ## TOPIC :LEVEL ORDER:::
// import java.util.*;
// import java.util.LinkedList;
// public class BinaryTree {

//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             left = right = null;
//         }
//     }

//     public static void levelOrder(Node root) {
//         if (root == null) return;

//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
//         q.add(null); // Marker for new level

//         while (!q.isEmpty()) {
//             Node currNode = q.remove();

//             if (currNode == null) {
//                 System.out.println(); // Newline after one level
//                 if (q.isEmpty()) break;
//                 q.add(null); // Add marker for next level
//             } else {
//                 System.out.print(currNode.data + " ");

//                 if (currNode.left != null)
//                     q.add(currNode.left);
//                 if (currNode.right != null)
//                     q.add(currNode.right);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         /*
//               1
//              / \
//             2   3
//            / \   \
//           4   5   6
//         */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.right = new Node(6);
//         System.out.println("level order traversal is:");

//         levelOrder(root);
//     }
// }
// -----------------------------------------------------------------------------------------------------------
