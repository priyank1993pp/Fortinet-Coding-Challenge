package FortinetHackerRank;

import static org.junit.Assert.*;

import org.junit.Test;

public class Reverse_Linkedlist_Test {

	@Test
	public void reverseLinkedlistTest() {
		Linkedlist reverseTest = new Linkedlist();
		reverseTest.head = new Node(1);
		reverseTest.head.next = new Node(2);
		reverseTest.head.next.next = new Node(3);
		Node result = reverseTest.reverseList(reverseTest.head);
		assertEquals(3 , result.data);
	}

}
