package udemy_DSA.Trees.BinaryTree;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root= null;
    }

    //PreOrder Traversal
    void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //InOrder Traversal
    void InOrder(BinaryNode node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.value+ " ");
        InOrder(node.right);
    }

    //PostOrder Traversal
    void PostOrder(BinaryNode node){
        if(node == null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value+ " ");
    }



}
