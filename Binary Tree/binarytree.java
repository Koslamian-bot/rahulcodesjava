class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        data = x;
    }
}
class MyBinaryTree{

    TreeNode root;

    //Insertion methods
    public void add(int data){
        root = addRec(root,data);
    }
    //Reccurssion for insertion---->
    public TreeNode addRec(TreeNode root , int data){
        if(root==null){
            root = new TreeNode(data);
        }
        else if(data < root.data){
            root.left = addRec(root.left , data);
        }
        else if(data > root.data){
            root.right = addRec(root.right , data);
        }
        return root;
    }

    //Traversal methods 
    public void display(){
        if(root==null)
            System.out.println("The tree is empty");
        inorderRec(root);
    }
    //Reccurssion for traversal --> Inorder traversal
    public void inorderRec(TreeNode root){
        
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }

}

public class binarytree {
    public static void main(String args[]){
        MyBinaryTree binarytree= new MyBinaryTree();
        binarytree.add(8);
        binarytree.add(3);
        binarytree.add(6);
        binarytree.add(7);
        binarytree.add(9);
        binarytree.add(1);
        binarytree.add(0);
        binarytree.add(4);
        binarytree.add(2);
        binarytree.add(5);

        binarytree.display();
    }
}
