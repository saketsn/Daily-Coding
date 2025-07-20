package udemy_DSA.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

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

    //Level Order
    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if( presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }

        }
    }

    // Search Method
    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                System.out.println("The vlaue " +value+" is found in Tree");
                return;
            }else{
                if(presentNode.left!= null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!= null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value is not found");
    }



}
