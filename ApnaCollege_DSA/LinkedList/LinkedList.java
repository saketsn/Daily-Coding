package ApnaCollege_DSA.LinkedList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public  void addMiddle(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i< index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // Print all nodes
    public  void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.addLast(4);
        ll.print();

        ll.addMiddle(3,20000);
        ll.print();


    }
}
