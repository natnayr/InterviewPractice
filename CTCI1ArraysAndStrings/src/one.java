import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String word = in.nextLine();
		char[] characters = word.toCharArray();
		
		//bubble sort
		boolean swapped = true;
		while(swapped){
			swapped = false;
			for(int i=0; i<characters.length - 1; i++){
				
				if(characters[i] > characters[i+1]){
					swapped = true;
					char temp = characters[i];
					characters[i] = characters[i+1];
					characters[i+1] = temp;
				}
				
			}
		}
		
		boolean match = false;
		for(int i=0; i<characters.length-1; i++){
			if(characters[i] == characters[i+1]){
				match = true;
				break;
			}
		}
		
		if(match){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		
		in.close();

	}

}
