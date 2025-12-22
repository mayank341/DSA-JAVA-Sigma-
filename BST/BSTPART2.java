// ## TOPIC : 

public class BSTPART2 {
    // Topicv : BINARY search to balanced BST -
     static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    // Convert sorted array to BST
    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private static TreeNode buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null; // Base case
        }
        
        // Middle element becomes root
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build left and right subtrees
        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);

        return root;
    }

    // Inorder traversal (to check result)
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] sortedArray = {-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(sortedArray);

        System.out.println("Inorder Traversal of BST:");
        inorder(root);
    }
}
// ------------------------------------------------------------------------------------------------------------------