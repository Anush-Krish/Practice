package anush.revisitdsa;

public class BinaryTree {

    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insertLevelOrder(int[] arr, int i) {
        Node root = null;
        if (i < arr.length) {
            root = new Node(arr[i]);
            root.left = insertLevelOrder(arr, 2 * i + 1);
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root; //if return null then backtracking will start
    }

    //root->left->right
    public void preorderTraversal(Node root) {
        if (null == root) {
            return;
        }
        System.out.print(root.data + "  ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    //left->right->root
    public void postOrderTraversal(Node root) {
        if (null == root) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + "  ");
    }

    //left->root->right
    public void inorderTraversal(Node root) {
        if (null == root) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + "  ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        BinaryTree bt = new BinaryTree();
        Node root = bt.insertLevelOrder(arr, 0);
        bt.preorderTraversal(root);
        System.out.println(" ");
        bt.postOrderTraversal(root);
        System.out.println(" ");
        bt.inorderTraversal(root);
    }


}
