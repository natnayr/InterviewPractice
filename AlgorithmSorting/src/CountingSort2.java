import java.util.Scanner;

public class CountingSort2 {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int[] countBox = new int[100];
		int N = in.nextInt();
		
		for(int i=0; i<N; i++){
			countBox[in.nextInt()]++;
		}
		
		for(int i=0; i<100; i++){
			int times = countBox[i];
			for(int j=0; j<times; j++){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		in.close();
		
	}
	
}
