package DSClass.src;

class LinkedList {
    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    // Function to reverse linked list
    Node reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // store next
            current.next = prev;   // reverse current node
            prev = current;        // move prev forward
            current = next;        // move current forward
        }
        head = prev;  // new head
        return head;
    }

    // Print the linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        list.printList(list.head);

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList(list.head);
    }
}
