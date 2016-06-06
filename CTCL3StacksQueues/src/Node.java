public class Node {

	Node next = null;
	Object data;
	
	public Node(Object d){
		this.data = d;
	}
	
	public void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		
		//cycle to end
		while(n.next != null){
			n = n.next;
		}
		//append to end
		n.next = end;
	}
	
	
	public static void printLinkedList(Node head){
		Node n = head;
		
		System.out.print(n.data + " ");
		while(n.next != null){
			System.out.print(n.next.data + " ");
			n = n.next;
		}
		
		System.out.println();
	}
}