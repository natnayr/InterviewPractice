import java.util.Scanner;

public class two {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		
		MinStack ms = new MinStack();
		
		ms.push(5);
		System.out.println(ms.min());
		
		ms.push(6);
		ms.push(1);
		ms.push(7);
		
		System.out.println(ms.min());
		
		ms.pop();
		ms.pop();
		ms.pop();
		
		System.out.println(ms.min());
		
		in.close();
	}
}

class MinStack{

	MinNode top;
	
	//Store stack like a linkedlist
	int pop(){
		if(top != null){
			int item = top.data;
			top = top.next;
			
			return item;
		}
		return -1;
	}
	
	void push(int item){
		MinNode t = new MinNode(item);
		if(top != null){
			if(top.min > item){		
				t.min = item; //change
			}else{
				t.min = top.min; //copy over
			}
		}else{
			t.min = item;
		}
		
		t.next = top;
		top = t;
	}
	
	int min(){
		return top.min;
	}
	
	
	Object peek(){
		return top.data;
	}
	
}

class MinNode{

	
	MinNode next = null;
	int data;
	public int min;
	
	public MinNode(int d){
		this.data = d;
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