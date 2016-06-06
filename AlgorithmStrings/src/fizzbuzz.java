
public class fizzbuzz {

	public static void main(String[] args){
		
		for(int i=1; i<1000; i++){
			if((i % 3) == 0 && (i % 5) != 0){
				
				System.out.println(i + " : fizz");
				
			}else if((i % 3) != 0 && (i % 5) == 0){
				
				System.out.println(i + " : buzz");
				
			}else if((i % 3) == 0 && (i % 5) == 0){
				
				System.out.println(i + " : FizzBuzz");
				
			}
		}
		
	}
	
}
