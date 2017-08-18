package FortinetHackerRank;

public class Linkedlist {

	Node head;

	// Logic for reverse Linked list
	Node reverseList(Node head) {

		// Initializing three pointer for current, next and previous Node in
		// Linked list
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			// Put next Node as current.next Node
			next = current.next;
			// Put current.next Node as previous Node
			current.next = prev;
			// Put current Node as previous Node
			prev = current;
			// Now going for next Node
			current = next;
		}

		// Put previous as head
		head = prev;
		// Return head
		return head;

	}

}

class Node {

	int data;
	Node next;

	// Creating constructor for adding Node in Linkedlist
	Node(int data) {
		this.data = data;
	}

}
