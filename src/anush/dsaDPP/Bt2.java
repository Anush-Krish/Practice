package anush.dsaDPP;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Binary Tree reverse order traversal.
public class Bt2 {
    public static class Node{
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        int data;
        Node left;
        Node right;
    }
    public static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }
        public static void reverseTraversal(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            Stack<Node> s=new Stack<>();
            q.add(root);
        //    q.add(null);
            while(!q.isEmpty()){

                Node currNode=q.peek();
                q.remove();
                s.push(currNode);

//                if(currNode==null){
//                    System.out.println();
//                    if(q.isEmpty()){
//                        break;
//                    }
//                    else{
//                        q.add(null);
//                    }
//                }
//                else{
//                    System.out.print(currNode.data+" ");
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
               }
                while(!s.isEmpty()){


                    Node currNode=s.peek();
                    if(currNode==null) {
                        System.out.println("-1");
                    }
                    System.out.println(currNode.data);
                    s.pop();

                }



        }



    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        tree.reverseTraversal(root);

    }
}
