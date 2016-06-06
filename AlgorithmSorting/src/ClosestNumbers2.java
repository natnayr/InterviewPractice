import java.util.Scanner;

public class ClosestNumbers2 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		long[] arr = new long[N];
		
		for(int i=0; i<N; i++){
			arr[i] = in.nextInt();
		}
		
		MergeSortAlgo ms = new MergeSortAlgo();
		ms.sort(arr);
		
		//find pairs
		long[] diffArr = new long[N];
		diffArr[N-1] = Long.MAX_VALUE; //last item no invalid
		long smallestDiff = Long.MAX_VALUE;
		
		for(int i=0; i<N-1; i++){
			diffArr[i] = Math.abs(arr[i] - arr[i+1]);
			if(smallestDiff > diffArr[i]){
				smallestDiff = diffArr[i];
			}
		}
		
		for(int i=0; i<N-1; i++){
			if(diffArr[i] == smallestDiff){
				System.out.print(arr[i] + " " + arr[i+1] + " ");
			}
		}
		
		
		in.close();
	}
	
	
}

class MergeSortAlgo{
	
	private long[] arr;
	private long[] helper;
	
	private int n;
	
	
	public void sort(long[] arr){
		this.n = arr.length;
		this.arr = arr;
		this.helper = new long[n];
		mergesort(0, n-1);
	}
	
	public void mergesort(int low, int high){
		if(low < high){
			int m = (high + low) / 2;
			mergesort(low, m);
			mergesort(m+1, high);
			merge(low, m, high);
		}
	}
	
	public void merge(int low, int middle, int high){
		//copy parts to helper
		for(int i=low; i<=high; i++){
			helper[i] = arr[i];
		}
		
		int i = low, k = low;
		int j = middle + 1;
		
		while(i <= middle && j <= high){
			if(helper[i] <= helper[j]){
				arr[k] = helper[i];
				i++;
			}else{
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		
		//copy the rest of left side into target array
		while(i <= middle){
			arr[k] = helper[i];
			k++;
			i++;
		}
		
	}
}
