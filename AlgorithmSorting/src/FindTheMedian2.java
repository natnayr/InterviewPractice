import java.util.Scanner;

public class FindTheMedian2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i] = in.nextInt();
		}
		
		MergeSortFTM2 ms = new MergeSortFTM2();
		ms.sort(arr);
		
		System.out.println(arr[arr.length/2]);
		
		in.close();
		
	}

	static class MergeSortFTM2{
		
		public int[] helper;
		public int[] arr;
		public int n;
		
		public void sort(int[] arr){
			this.helper = new int[arr.length];
			this.n = arr.length;
			this.arr = arr;
			mergesort(0, n-1);
		}
		
		public void mergesort(int low, int high){
			if(low < high){
				int m = (low + high) / 2;
				mergesort(low, m);
				mergesort(m+1, high);
				merge(low, m, high);
			}	
		}
			
		public void merge(int low, int middle, int high){
		
			//copy over
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
			
			//since right side is the else, pour left back into array
			while(i <= middle){
				arr[k] = helper[i];
				k++;
				i++;
			}
			
		}
		
	}
	
}


