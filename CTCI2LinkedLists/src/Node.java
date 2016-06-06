
public class Node {

	Node next = null;
	int data;
	
	public Node(int d){
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
	
	public Node deleteNode(Node head, int d){
		Node n = head;
		
		if(n.data == d){
			return head.next; //head is Node, just return next
		}
		
		while(n.next != null){
			if(n.next.data == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next; //move down
		}
		
		//if fail
		return head;
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
