package anush.revisitdsa;

import java.util.LinkedList;
import java.util.Queue;

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

    public void levelOrderTraversal(Node root) {
        //add root then in while check for empty,
        //proceed to add left then right then terminate the loop,
        //continue to remove the root(current element)

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr = queue.remove();
            if (null == curr) {
                return;
            }
            System.out.print(curr.data + "  ");
            queue.add(curr.left);
            queue.add(curr.right);
        }
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
        System.out.println(" ");
        bt.levelOrderTraversal(root);
    }


}
