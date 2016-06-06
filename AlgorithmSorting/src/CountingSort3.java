import java.util.Scanner;

public class CountingSort3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[100];
		
		for(int i=0; i<N; i++){
			int num = in.nextInt();
			String word = in.next();
			arr[num]++;
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++){
			count += arr[i];
			System.out.print(count + " ");
		}
		
		in.close();
	}

}
