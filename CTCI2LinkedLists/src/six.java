import java.util.Scanner;

public class six {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		int circularNth = in.nextInt();
		Node hook = null;
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
			
			if(i == circularNth){
				hook = n;
			}
			
		}
		
		//set tail link to hook
		n.next = hook;
		
		//must be able to identfy that hook is start of circular linkedlist
		Node find = findCircleStart(head);
		
		if(find == hook){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		
		in.close();
	}
	
	
	public static Node findCircleStart(Node head){
		
		Node fastRunner = head.next.next;
		Node slowRunner = head.next;
		
		//fast hop twice, slow hop once
		while(fastRunner != slowRunner){
			fastRunner = fastRunner.next.next;
			slowRunner = slowRunner.next;
		}
		
		//should be times head, so move both slowly
		fastRunner = head;
		while(fastRunner != slowRunner){
			fastRunner = fastRunner.next;
			slowRunner = slowRunner.next;
		}
		
		
		return slowRunner;
	}
	
}
