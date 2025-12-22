// // ## TOPIC : Binary SEARCH Tree --
// public class BinarySearchTree {
//     // Node class
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//         }
//     }
//     // Insert method
//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             return new Node(val); // fixed newNode(val)
//         }
//         if (val < root.data) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }
//     // Inorder traversal
//     public static void inorder(Node root) {
//         if (root == null) {
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }
//     // SEArching in BST ::::
//     public static boolean search(Node root,int key ){
//         if(root==null){
//             return false;
//         }
//         if(root.data==key){
//             return true;
//         }
//         if(root.data>key){
//             return search(root.left, key);
//         }
//         else{
//             return search(root.right,key);
//         }
//     }
//     public static void main(String[] args) {
//         int[] values = {5, 1, 3, 4, 2, 7};
//         Node root = null; // must define root

//         for (int i = 0; i < values.length; i++) {
//             root = insert(root, values[i]);
//         }
//         inorder(root); // just call, don’t print it
//         System.out.println();

//         if(search(root, 1)){
//             System.out.println("given key:"+"found");
//         }
//         else{
//             System.out.println("not found ");
//         }
//     }
// }
// ------------------------------------------------------------------------------------------------------------------------
// ## TOPIC : Mirror in a BST -

public class BinarySearchTree{
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    // Insert in BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    // Preorder traversal
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    // Mirror using preorder
    public static void mirrorPreorder(Node root) {
        if (root == null) return;

        // Step 1: Swap left and right
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Step 2: Go to left and right (which are swapped now)
        mirrorPreorder(root.left);
        mirrorPreorder(root.right);
    }
    public static void main(String[] args) {
        Node root = null;
        int[] values = {8, 3, 10, 1, 6, 14, 4, 7, 13};        
    /*                    
       / 8\
      3   10
     / \     \
    1   6     14
       / \    /
      4   7  13
                      
      
       / 8 \
     10   3
     /    / \
   14    6   1
     \  / \
     13 7  4             this is the mirror image .
                               
      */


        // Build BST
        for (int v : values) {
            root = insert(root, v);
        }

        System.out.println("Preorder before mirroring:");
        preorder(root);
        System.out.println();

        // Mirror
        mirrorPreorder(root);
        System.out.println("Preorder after mirroring:");
        preorder(root);
    }
}

