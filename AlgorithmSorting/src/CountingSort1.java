import java.util.Scanner;

public class CountingSort1 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[100];
		
		for(int i=0; i<N; i++){
			int num = in.nextInt();
			arr[num]++;
		}
		
		for(int num : arr){
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		
		in.close();
	}
	
}
