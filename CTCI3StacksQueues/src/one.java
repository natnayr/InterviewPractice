import java.util.Scanner;

public class one{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		ArrayStack arrStack = new ArrayStack();
		
		arrStack.pushFirst(1);
		arrStack.pushFirst(2);
		arrStack.pushFirst(3);
		
		arrStack.pushSecond(4);
		arrStack.pushSecond(5);
		arrStack.pushSecond(6);
		
		arrStack.pushThird(7);
		arrStack.pushThird(8);
		arrStack.pushThird(9);
		
		System.out.println(arrStack.popFirst() + " " + arrStack.popFirst() + " " + arrStack.popFirst());
		System.out.println(arrStack.popSecond() + " " + arrStack.popSecond() + " " + arrStack.popSecond());
		System.out.println(arrStack.popThird() + " " + arrStack.popThird() + " " + arrStack.popThird());

		in.close();
	}
	
}


class ArrayStack {
	
	int[] arr;
	int i1, i2, i3;
	
	ArrayStack(){
		arr = new int[1000];
		i1 = 0;
		i2 = 1; 
		i3 = 2;
	}
	
	//first stack
	void pushFirst(int item){
		arr[i1] = item;
		this.i1 += 3;
	}
	
	Object popFirst(){
		if(i1 == 0){
			return null;
		}
		
		i1 -= 3;
		Object item = arr[i1];
		arr[i1] = 0;
		return item;
	}
	
	//second stack
	void pushSecond(int item){
		arr[i2] = item;
		this.i2 += 3;
	}
	
	Object popSecond(){
		if(i2 == 1){
			return null;
		}
		
		i2 -= 3;
		Object item = arr[i2];
		arr[i2] = 0;
		return item;
	}
	
	//third stack
	void pushThird(int item){
		arr[i3] = item;
		i3 += 3;
	}
	
	Object popThird(){
		if(i3 == 2){
			return null;
		}
		
		i3 -= 3;
		Object item = arr[i3];
		arr[i3] = 0;
		return item;
	}
}
