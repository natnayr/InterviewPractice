import java.util.Scanner;

public class LisasWorkbook {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int chapters = in.nextInt(); // 5
		int nPageSize = in.nextInt(); // 3
		int curPage = 1;
		int count = 0;
		
		for(int i = 0; i < chapters; i++){
			int nProblems = in.nextInt();
			
			for(int k = 1; k <= nProblems; k++){
				if(curPage == k){
					count++;
				}
				
				if((k % nPageSize) == 0)
					curPage++;
				
			}
			
			if((nProblems % nPageSize) != 0)
				curPage++;
			
		}
		
		System.out.println(count);
		
		
		in.close();
	}
	
}
