package anush.dsa;
//search in BST.
public class Bst2 {
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
    public static Node insert(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(root.data>key){
            root.left=insert(root.left,key);
        }
        else{
            root.right=insert(root.right,key);
        }
        return root;
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }

    public static void main(String[] args) {
        int[] keys={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i< keys.length;i++){
            root=insert(root,keys[i]);
        }
        System.out.println(search(root,6));

    }
}
