public class LinkedListConcept {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void printmyLinkedList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListConcept ll = new LinkedListConcept();
		Node FirstNode = ll.new Node(10);
		ll.head = FirstNode;
		
		
		Node SecondNode = ll.new Node(20);
		FirstNode.next=SecondNode;
		
		Node ThirdNode = ll.new Node(30);
		SecondNode.next=ThirdNode;
		
		ll.printmyLinkedList();
	}

}
