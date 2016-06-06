import java.util.LinkedList;
import java.util.Scanner;

public class AlmostSorted {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		LinkedList<Integer> upIdx = new LinkedList<Integer>();
		LinkedList<Integer> dipIdx = new LinkedList<Integer>();
		
		int N = in.nextInt();
		
		int[] arr = new int[N + 2];
		
		arr[0] = 0;
		arr[N+1] = Integer.MAX_VALUE;
		
		for(int i=1; i<N+1; i++){
			arr[i] = in.nextInt();
		}
		
		for(int i=0; i<N+2; i++){
			System.out.print(arr[i] + " ");
		}
		
		//runthrough
		//2 dips, 2ups is swapping
		//1 dip and 1 up is inversion
		int dip = 0;
		int up = 0;
		for(int i=1; i<=N; i++){
			//ups
			if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
				up++;
				upIdx.add(i);
			}
			
			//dips
			if(arr[i-1] > arr[i] && arr[i] < arr[i+1]){
				dip++;
				dipIdx.add(i);
			}
		}
		
		System.out.println("\ndip " + dip);
		System.out.println("ups " + up);
		
		if(up == 1 && dip == 1){
			System.out.println("yes");
			System.out.println("reverse " + upIdx.get(0) + " " + dipIdx.get(0));
		}else if(up == 2 && dip == 2){
			System.out.println("yes");
			System.out.println("swap " + upIdx.get(0) + " " + dipIdx.get(1));
		}
		
		in.close();

	}

}
