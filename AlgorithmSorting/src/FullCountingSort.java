import java.util.LinkedList;
import java.util.Scanner;

public class FullCountingSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<String>[] wordList = new LinkedList[100];
		
		int[] countList = new int[100];
		int n = in.nextInt();
		
		for(int i=0; i<n; i++){
			int num = in.nextInt();
			String word = in.next();
			
			countList[num]++;
			
			if(wordList[num] == null){
				wordList[num] = new LinkedList<String>();
			}
			
			if(i >= (n/2)){
				wordList[num].add(word);
			}else{
				wordList[num].add("-");
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<countList.length; i++){
			int k = countList[i];
			for(int j=0; j<k; j++){
				sb.append(wordList[i].pop() + " ");
			}
		}
		
		System.out.println(sb.toString());
		
		in.close();
	}

}
