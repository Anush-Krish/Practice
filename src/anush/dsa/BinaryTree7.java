package anush.dsa;
//Sum of nodes.
public class BinaryTree7 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
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
        static int sum=0;
        public static int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            sumOfNodes(root.left);
            sumOfNodes(root.right);
            sum+= root.data;
            return sum;

        }
        //ans from source.
//        public static int sumOfNodes(Node root){
//            if(root==null){
//                return 0;
//            }
//            int leftNodes=sumOfNodes(root.left);
//            int rightNodes=sumOfNodes(root.right);
//            return leftNodes+rightNodes+root.data;
//        }
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(tree.sumOfNodes(root));


    }
}
