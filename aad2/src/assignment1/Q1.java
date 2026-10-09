package assignment1;
class Node{
    int data;
    Node left,right;
    Node(int data){
      this.data=data;
      left=right=null;
    }
}
public class Q1 {
    static Node insert(int[] arr, int i){
        if(i>=arr.length){
            return null;
        }
        Node root=new Node(arr[i]);
        root.left=insert(arr,2*i+1);
        root.right=insert(arr,2*i+2);
        return root;
    }
    static void print(Node root){
        if(root==null)
            return;
        System.out.println(root.data);
        print(root.left);
        print(root.right);

    }
    public static void main(String[] args) {

        int[] T = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node root = insert(T, 0);
        System.out.println("Binary Tree Created Successfully!");
        System.out.print("Preorder Traversal: ");
        print(root);

    }

}

