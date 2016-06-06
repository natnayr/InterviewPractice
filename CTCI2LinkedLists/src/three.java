import java.util.Scanner;

public class three {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		Node head = null;
		int count = in.nextInt(); //assumption of odd list
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
		Node mid = getMiddle(head);
		removeMiddle(mid);
		Node.printLinkedList(head);
		
		in.close();
	}
	
	public static Node getMiddle(Node head){
		Node mid = head;
		Node doubleEnd = head;
		Node midPrev = null;
		while(doubleEnd.next != null){
			midPrev = mid;
			mid = mid.next;
			doubleEnd = doubleEnd.next.next;
		}
		
		System.out.println("mid: " + mid.data);
		
		return mid;
	}
	
	public static void removeMiddle(Node mid){
		if(mid == null || mid.next == null)
			return;
		
		mid.data = mid.next.data; //store next data as mid 
		//delete next node
		mid.next = mid.next.next;
	}
	
}
