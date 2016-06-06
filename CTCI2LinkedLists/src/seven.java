import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
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
		
		Node.printLinkedList(head);
		System.out.println(checkPalindrome(head));
		
		
		in.close();

	}
	
	public static boolean checkPalindrome(Node head){
		//copy over node and reverse it
		Node revcp = head;
		Node rev = null;
		
		while(revcp != null){
			Node temp = revcp;
			revcp = revcp.next; //revcp is moved
			temp.next = rev;
			rev = temp;
		}
		//check
		while(rev != null && head != null){
			if(rev.data != head.data){
				return false;
			}
			rev = rev.next;
			head = head.next;
		}
	
		return true;
	}

}
