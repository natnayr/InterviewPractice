import java.util.Scanner;

public class Gemstones {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int times = N;
		int[] alpha = new int[26];
		
		
		//first line to mark
		
		while(N > 0){
			String line = in.next();
			String bin = "";
			
			for(int i=0; i<line.length(); i++){
				if(!bin.contains(line.charAt(i) + "")){
					alpha[line.charAt(i) - 97]++;
					bin = bin + line.charAt(i);
				}
			}
			
			N--;
		}
		
		int count = 0;
		for(int i=0; i<alpha.length; i++){
			if(alpha[i] == times)
				count++;
		}
		
		System.out.println(count);
		
		in.close();
	}
}
