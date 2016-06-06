import java.util.Scanner;

public class two {

	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		
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
		
		
		Node kth = findKToLast(head, in.nextInt());
		
		in.close();
		
	}
	
	public static Node findKToLast(Node head, int k){
		
		Node n = head;
		
		for(int i=0; i<k; i++){
			n = n.next;
		}
		
		//print from kth onwards
		Node ncp = n;
		while(ncp != null){
			System.out.print(ncp.data + " ");
			ncp = ncp.next;
		}
		
		return n;
	}
	
}
