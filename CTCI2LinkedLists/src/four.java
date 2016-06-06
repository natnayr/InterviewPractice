import java.util.Scanner;

public class four {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		int x = in.nextInt();
		Node head = null;
		Node n = null;
		
		for(int i=0; i<count; i++){
			if(head == null){
				head = new Node(in.nextInt());
				n = head;
			}else{
				n.next = new Node(in.nextInt());
				n = n.next;
			}
		}
		
		Node.printLinkedList(head);
		head = partitionList2(head, x);
		Node.printLinkedList(head);
		
		in.close();
	}
	
	public static Node partitionList2(Node head, int x){
		//The extra list method
		Node leftHead = null;
		Node rightHead = null;
		Node equalHead = null;
		
		Node n = head;
		
		while(n != null){
			
			Node temp = n.next;
			if(n.data < x){				
				n.next = leftHead;
				leftHead = n;
			}else if(n.data > x){
				n.next = rightHead;
				rightHead = n;
				
			}else if(n.data == x){
				n.next = equalHead;
				equalHead = n;
			}
			n = temp;
		}
		
		head = leftHead;
		while(leftHead != null){
			if(leftHead.next == null) break;
			leftHead = leftHead.next;
		}
		
		if(leftHead != null){
			leftHead.next = equalHead;
		}else{
			head = equalHead;
		}
		
		while(equalHead.next != null){
			if(equalHead.next == null) break;
			equalHead = equalHead.next;
		}
		equalHead.next = rightHead;
		
		
		return head;
		
	}
	
	public static Node partitionList(Node head, int x){
		//the hard way...
		
		//find the tail of list
		Node tail = head;
		while(tail.next != null){
			tail = tail.next;
		}

		Node n = head;
		Node prev = null;
		
		// before x, < x, then put infront of head
		while(n != null && n.data != x){
			
			if(n.data > x){
				Node temp = n.next;
				if(n == head){
					head = n.next;
				}else{
					prev.next = n.next;
				}
				tail.next = n;
				tail = n;
				n.next = null;
				n = temp;
			}else{
				prev = n;
				n = n.next;
			}
		}
		
		// x should be head, all < x will be put infront
		while(n != null){
			
			if(n.data < x && n != head){
				Node temp = n.next;
				prev.next = n.next;
				n.next = head;
				head = n;
				n = temp;
				
			}else{
				prev = n;
				n = n.next;
			}
		}
		
		return head;
	}
	
}
