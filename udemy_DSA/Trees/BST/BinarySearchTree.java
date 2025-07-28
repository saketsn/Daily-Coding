package udemy_DSA.Trees.BST;

public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree(){
        root = null;
    }

    //Insert Method
    private BinaryNode insert(BinaryNode currentNode, int value){
        if(currentNode == null){
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value successfully inserted.");
            return newNode;
        }else if(value <= currentNode.value){
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        }else{
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    void insert(int value){
        insert(root, value);
    }
}
