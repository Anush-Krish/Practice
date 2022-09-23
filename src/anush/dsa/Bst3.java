package anush.dsa;
//deleting a node.
public class Bst3 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int key){
        return null;
    }

    public static void main(String[] args) {
        int[] keys={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i< keys.length;i++){
            root=insert(root,keys[i]);
        }
    }

}
