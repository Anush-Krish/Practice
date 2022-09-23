package anush.dsa;
//Subtree of another tree.
public class BinaryTree10 {
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
        public static boolean isIdentical(Node root,Node sroot){
            if(sroot==null && root==null){
                return true;
            }
            if(sroot==null || root==null){
                return false;
            }
            return isIdentical(sroot.left,root.left) && isIdentical(sroot.right,root.right);
        }
        public static boolean isSubtree(Node root,Node sroot){
            if(sroot==null ){
                return true;
            }
            if(root==null){
                return false;
            }
            if(sroot.data== root.data){
                if(isIdentical(sroot,root)){
                    return true;
                }
            }
            return isSubtree(root.left,sroot) || isSubtree(root.right,sroot);

        }

    }

    public static void main(String[] args) {
        BinaryTree mTree=new BinaryTree();
        BinaryTree sTree=new BinaryTree();

    }
}
