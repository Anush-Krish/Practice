package anush.dsaDPP;

import static anush.dsaDPP.bt1.BinaryTree.depth;

public class bt1 {
    static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.left = null;
            this.right =null;
            this.data = data;
        }

    }
    public static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;


        }
        public static int depth(Node root){
            if(root==null){
                return 0;
            }
            int leftDepth=depth(root.left);
            int rightDepth=depth(root.right);
            int maxDepth=Math.max(leftDepth,rightDepth)+1;
            return maxDepth;
        }
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Depth of tree:"+depth(root));

    }
}
