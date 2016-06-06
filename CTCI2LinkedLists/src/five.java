import java.util.Scanner;

public class five {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int count1 = in.nextInt();
		int count2 = in.nextInt();
		
		Node head1 = null;
		for(int i=0; i<count1; i++){
			Node temp = new Node(in.nextInt());
			temp.next = head1;
			head1 = temp;
		}
		
		Node head2 = null;
		for(int i=0; i<count2; i++){
			Node temp = new Node(in.nextInt());
			temp.next = head2;
			head2 = temp;
		}
		
		Node.printLinkedList(head1);
		Node.printLinkedList(head2);
		
		Node total = addTogether(head1, head2);
		
		Node.printLinkedList(total);
		
		in.close();
		
	}

	
	
	
	//have to be aware number could be really big
	public static Node addTogether(Node head1, Node head2){
		
		Node totalList = null;
		Node n = null;
		int carry = 0;
		while(head1 != null && head2 != null){
			int total = head1.data + head2.data + carry;
			carry = total / 10;
			int store = (total % 10); //carry cant add
			
			
			if(totalList == null){
				totalList = new Node(store);
				n = totalList;
			}else{
				n.next = new Node(store);
				n = n.next;
			}
			
			head1 = head1.next;
			head2 = head2.next;
		}
		
		return totalList;
	}
	
}
