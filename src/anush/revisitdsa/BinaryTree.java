package anush.revisitdsa;

public class BinaryTree {
    Node root;

    private class Node {
        int data;
        Node left, right;

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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        BinaryTree bt =new BinaryTree();
        bt.insertLevelOrder(arr,0);
    }



}
