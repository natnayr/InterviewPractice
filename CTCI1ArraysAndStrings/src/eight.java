import java.util.Scanner;

public class eight {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String realWord = in.nextLine();
		String rotWord = in.nextLine();
		
		boolean matchfound = rotationCheck(realWord, rotWord);
		
		System.out.println("Answer: " + matchfound);
		
		
		in.close();

	}
	
	public static boolean rotationCheck(String realWord, String rotWord){
		
		if(realWord.length() != rotWord.length()){
			return false;
		}
		
		char[] rot = rotWord.toCharArray();
		char[] real = realWord.toCharArray();
		
		boolean match = false;
		int i = 0;
		for(; i<rot.length; i++){
			
			if(rot[i] == real[0]){
				
				int j = 0;
				int k = i;
				match = true;
				
				while(k < rot.length){
					
					if(rot[k] != real[j]){
						match = false;
						break;
					}
					
					k++;
					j++;
				}
				
				if(match){
					break;
				}
			}
		}
		
		//no match found at all
		if(!match)
			return false;
		
		//found breakaway that matches, check
		int breakaway = i;
		String snap = rotWord.substring(breakaway) + rotWord.substring(0, breakaway);
		
		if(realWord.equals(snap)){
			return true;
		}
		
		return false;
	}

}
