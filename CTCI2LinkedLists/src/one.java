import java.util.HashSet;
import java.util.Scanner;

public class one {
	
	public static Node head;

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		//Make the linkedlist
		int count = in.nextInt();
		
		Node n = null;
		for(int i=0; i<count; i++){
			
			if(n != null){
				n.next = new Node(in.nextInt());
				n = n.next;
			}else{
				n = new Node(in.nextInt());
			}
			
			if(i==0){
				head = n; 
			}
			
		}
		
		Node.printLinkedList(head);
		//removeDuplicates();
		followUpNoBuffer();
		
		Node.printLinkedList(head);
		
		in.close();
		
	}
	
	public static void removeDuplicates(){
		HashSet<Integer> hash = new HashSet<Integer>();
		Node n = head;
				
		while(n != null){
			
			if(hash.add(n.data) == false){
				head = n.deleteNode(head, n.data);
			}
			
			n = n.next;
		}
		
	}
	
	// O(n^2) solution
	public static void followUpNoBuffer(){
		
		Node cur = head;
		
		while(cur != null){
			Node n = cur.next;
			Node prev = cur;
			while(n != null){
				//delete duplicate
				if(cur.data == n.data){
					prev.next = n.next;
					n = n.next;
				}
				//shift down
				prev = n;
				if(n != null){
					n = n.next;
				}
			}
			
			cur = cur.next;
		}
		
	}
	
}
