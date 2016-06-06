import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		while(T > 0){
			
			String first = in.next();
			String second = in.next();
			
			int[] arr = new int[26];
			arr = freqTabulator(first, arr);
			arr = freqTabulator(second, arr);
			
			boolean print = false;
			for(int i=0; i<arr.length; i++){
				if(arr[i] > 1){
					print = true;
					break;
				}
			}
			
			if(print){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
			
			T--;
		}
		
		in.close();

	}

	public static int[] freqTabulator(String word, int[] arr){
		
		//make a array and count single occurances
		int[] freq = new int[26];
		
		//add occurances to input and return back
		for(int i=0; i<word.length(); i++){
			char c = word.charAt(i);
			if(freq[c-97] == 0){
				freq[c-97]++;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			arr[i]+= freq[i];
		}
		
		return arr;
	}
	
}
