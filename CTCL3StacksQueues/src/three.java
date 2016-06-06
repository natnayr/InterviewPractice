import java.util.LinkedList;

public class three {

	public static void main(String[] args) {
		
		
		SetOfStacks ss = new SetOfStacks(3);
		ss.push(1);
		ss.push(2);
		ss.push(3);
		ss.push(4);
		ss.push(5);
		ss.push(6);
		ss.push(7);
		ss.push(8);
		ss.push(9);
		ss.push(10);
		
		System.out.println(ss.popAt(1));
		
		System.out.println("size: " + ss.stacks.size());
		System.out.println("placeCount: " + ss.top.placeCount);
		System.out.println(ss.pop()); //9
		System.out.println(ss.pop()); //8
		System.out.println("size: " + ss.stacks.size());
		System.out.println("placeCount: " + ss.top.placeCount);
		
		System.out.println(ss.pop()); // 7 -- 1
		System.out.println(ss.pop()); // 6
		System.out.println(ss.pop());
		System.out.println("size: " + ss.stacks.size());
		System.out.println("placeCount: " + ss.top.placeCount);
		System.out.println(ss.pop());
		System.out.println(ss.pop());
		
		System.out.println("size: " + ss.stacks.size());
		System.out.println("placeCount: " + ss.top.placeCount);
		System.out.println(ss.pop());
		System.out.println(ss.pop());
		System.out.println("size: " + ss.stacks.size());
		
	}
}


class SetOfStacks{
	
	SetNode top;
	int capacity;
	
	LinkedList<SetNode> stacks;
	
	
	public SetOfStacks(int capacity){
		this.stacks = new LinkedList<SetNode>();
		this.capacity = capacity;
	}
	
	void push(Object item){
		
		if(top != null && top.placeCount == capacity){
			stacks.add(top); //push into set
			top = null; //reset top
		}
		
		SetNode t = new SetNode(item);
		if(top == null){
			t.placeCount = 1;
		}else{
			t.placeCount = top.placeCount + 1;
		}
		
		t.next = top;
		top = t;
	}
	
	Object pop(){
		if(top == null & stacks.size() == 0)
			return null;
		
		SetNode t = null;
		if(top == null){
			t = stacks.removeLast();
		}else{
			t = top;
		}
		
		top = t.next;
		return t.data;
		
	}
	
	//Follow up objective
	Object popAt(int index){
		if(index >= stacks.size()){
			return null;
		}
		
		SetNode node = stacks.get(index);
		Object sum = node.data;
		node = node.next;
		stacks.set(index, node);
		
		return sum;
	}
	
	Object peek(){
		return top.data;
	}
}

class SetNode extends Node{

	public int placeCount;
	public SetNode next;
	
	public SetNode(Object d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
}