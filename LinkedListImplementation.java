package Linkedlist;


//Node class
class Node {
 int data;
 Node next;

 public Node(int val) {
     this.data = val;
     this.next = null;
 }
}
public class LinkedListImplementation {
	Node head;  // Head node of the linked list

    // Add a node at the end of the list
    public void addNode(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    // Insert a node at the beginning of the list
    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // Traverse and print the list
    public void traverse() {
        if (head == null) {
            System.out.println("List is Empty...");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);

        System.out.println("List after adding nodes:");
        list.traverse();

        list.insertAtBeginning(5);
        System.out.println("List after inserting at beginning:");
        list.traverse();
    }
}

