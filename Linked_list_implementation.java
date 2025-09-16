///LinkedList Implementation linear search 
package List_09;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
public class Linked_list_implementation {
	Node head;
	public void addNode(int val ) {
		Node newNode = new Node(val);
		
		if(head==null) {
			head= newNode;
			
		}
		else {
//			head.next=newNode;
			Node curr=head;
			while(curr.next !=null){
				curr=curr.next;
				
			}
			curr.next=newNode;
			
		}
		
	}
	public void traversal() {
		if(head==null) {
			System.out.println("List is empty.");
			return;
		}
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
			
		}
		System.out.println("null");
	}
	public void insertAtBeginning(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
			return;
			
			
		}
		newNode.next=head;
		head=newNode;
		
		}
	public void deleteAtBeginning() {
		if(head==null) {
			System.out.println("List is empty..");
		}
		else {
			head=head.next;
		}
	}
	public void deleteAtEnd() {
		if(head==null) {
			System.out.println("List is empty.. ");
			
		}
		else {
			Node curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
			
		}
	}
	public boolean search(Node head,int target) {
		if(head==null) {
			System.out.print("List is empty...");
		}
		
		else {
			Node curr=head;
			while(curr!=null) {
				if(target==curr.data) {
					return true;
				}
				curr =curr.next;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Linked_list_implementation linkedList=new Linked_list_implementation();
		linkedList.addNode(25);
		linkedList.addNode(45);
		linkedList.addNode(30);
		linkedList.addNode(35);
		
		linkedList.traversal();
		linkedList.insertAtBeginning(1);
		System.out.println();
		linkedList.traversal();
		
		linkedList.deleteAtBeginning();
		System.out.println();
		linkedList.traversal();
		linkedList.deleteAtEnd();
		System.out.println();
		linkedList.traversal();
		
		System.out.println();
		System.out.println(linkedList.search(linkedList.head,45));			
	}
}
	

