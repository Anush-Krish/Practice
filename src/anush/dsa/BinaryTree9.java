package anush.dsa;
//diameter.
public class BinaryTree9 {
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
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            int max=Math.max(leftHeight,rightHeight)+1;
            return max;
        }
        //O(n^2)
        public static int diameter(Node root){
            if(root==null){
                return 0;
            }
            int dia1=diameter(root.left);
            int dia2=diameter(root.right);
            int dia3=height(root.left)+height(root.right)+1;


            return Math.max(dia3,Math.max(dia1,dia2));
        }
        static class TreeInfo{
            int ht;
            int diam;
            TreeInfo(int ht,int diam){
                this.ht=ht;
                this.diam=diam;
            }
        }
        //O(n)
        public static TreeInfo diameter2(Node root) {
            if(root == null) {
                return new TreeInfo(0, 0);
            }

            TreeInfo leftTI = diameter2(root.left);
            TreeInfo rightTI = diameter2(root.right);

            int myHeight = Math.max(leftTI.ht, rightTI.ht) + 1;

            int diam1 = leftTI.ht + rightTI.ht + 1;
            int diam2 = leftTI.diam;
            int diam3 = rightTI.diam;

            int myDiam = Math.max(diam1, Math.max(diam2, diam3));

            return new TreeInfo(myHeight, myDiam);
        }

    }

    public static void main(String[] args) {
        int[] nodes={1,2,3,4,5,6,-1,-1,-1,-1,-1,7,-1,8,-1,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(tree.diameter2(root).diam);
        System.out.println(tree.diameter(root));
    }
}
