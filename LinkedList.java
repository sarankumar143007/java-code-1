package Linked;
class Node {
	int data;
	Node next;
	public Node(int val) {
		data = val;
		next = null;

	}

}
public class LinkedList {
	Node head;

	// Add a node to the end (default add)

	public void addNode(int val) {

		Node newNode = new Node(val);



		if (head == null) {

			head = newNode;

			System.out.println("Added " + val + " as head node.");

		} else {

			Node curr = head;

			while (curr.next != null) {

				curr = curr.next;

			}

			curr.next = newNode;

			System.out.println("Added " + val + " at the end.");

		}

	}
	// Add a node at the beginning

	public void addAtBeginning(int val) {

		Node newNode = new Node(val);

		newNode.next = head;

		head = newNode;

		System.out.println("Inserted " + val + " at the beginning.");

	}
	// Add a node at the end (explicitly)

	public void addAtEnd(int val) {

		Node newNode = new Node(val);



		if (head == null) {

			head = newNode;

			System.out.println("Added " + val + " as head node (list was empty).");

			return;

		}



		Node curr = head;

		while (curr.next != null) {

			curr = curr.next;

		}

		curr.next = newNode;

		System.out.println("Inserted " + val + " at the end.");

	}
	// Delete the node at the beginning

	public void deleteAtBeginning() {

		if (head == null) {

			System.out.println("List is already empty. Nothing to delete at beginning.");

			return;

		}



		System.out.println("Deleted " + head.data + " from beginning.");

		head = head.next;

	}
	// Delete the node at the end

	public void deleteAtEnd() {

		if (head == null) {

			System.out.println("List is already empty. Nothing to delete at end.");

			return;

		}



		if (head.next == null) {

			System.out.println("Deleted " + head.data + " (only node in list).");

			head = null;

			return;

		}



		Node curr = head;

		while (curr.next.next != null) {

			curr = curr.next;

		}
		System.out.println("Deleted " + curr.next.data + " from end.");

		curr.next = null;

	}
	// Print the current linked list

	public void traverse() {

		if (head == null) {

			System.out.println("List is empty.");

			return;

		}
		System.out.print("Current List: ");

		Node curr = head;

		while (curr != null) {

			System.out.print(curr.data + " ==> ");

			curr = curr.next;

		}

		System.out.println("Null");

	}
	// Print the middle node's value

	public void printMiddle() {

		if (head == null) {

			System.out.println("List is empty. No middle to print.");

			return;

		}



		Node slow = head;

		Node fast = head;



		while (fast != null && fast.next != null) {

			slow = slow.next;

			fast = fast.next.next;

		}
		System.out.println("Middle node value: " + slow.data);
	}
	public boolean search(int target) {

		if (head == null) {

			System.out.println("The list is empty.");

			return false;

		} else {

			Node curr = head;

			while (curr != null) {

				if (curr.data == target) {

					return true; // Found the target

				}

				curr = curr.next; // Move to next node

			}

			return false; // Target not found

		}

	}
    public int size() {

		int count = 0;

		Node curr = head;

		while (curr != null) {

			count++;

			curr = curr.next;

		}

		return count;

	}
// Main method to test

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addNode(10);

		list.addNode(20);

		list.addNode(30);

		list.addNode(30);
		list.addAtBeginning(25);

		list.addAtBeginning(30);

		list.addAtEnd(10);
		list.traverse();

		list.printMiddle();
		list.addAtEnd(10);

		list.addAtEnd(20);

		list.addAtEnd(30);
		list.traverse();
		list.deleteAtBeginning();
		list.traverse();
		list.deleteAtEnd();
		list.traverse();
		boolean found = list.search(20);
		System.out.println("Found 20? " + found);
		found = list.search(50);
		System.out.println("Found 50? " + found);
		System.out.println("Size of list: " + list.size());
	}
}

