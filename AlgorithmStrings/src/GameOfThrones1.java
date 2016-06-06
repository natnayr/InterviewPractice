import java.util.Scanner;

public class GameOfThrones1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] alpha = new int[26];
		
		String line = in.nextLine();
		
		//count frequencies
		for(int i=0; i<line.length(); i++){
			alpha[line.charAt(i) - 97]++;
		}
		
		boolean even = false;
		if(line.length() % 2 == 0){
			even = true;
		}
		
		int oddCount = 1;
		boolean palindrome = true;
		
		for(int i=0; i<alpha.length; i++){
			
			if((alpha[i] % 2) != 0){
				//if one item is not even
				if(even == false && oddCount > 0){
					oddCount = 0;
				}else{
					palindrome = false;
					break;
				}
			}
		}
		
		if(palindrome){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		in.close();
		
		
	}

}
