import java.util.Scanner;

public class FindTheMedian {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i] = in.nextInt();
		}
		
		if(N % 2 == 0){
			System.out.println("Error");
		}
		
		FTMMergeSort merge = new FTMMergeSort();
		
		merge.sort(arr);
		System.out.println(arr[arr.length/2]);
		
		in.close();
	}
}


class FTMMergeSort{
	
	int[] arr;
	int[] helper;
	int n;
	
	public void sort(int[] array){
		this.arr = array;
		this.helper = new int[array.length];
		this.n = array.length;
		mergesort(0, n-1);
	}
	
	public void mergesort(int low, int high){
		if(low < high){
			int pivot = low + (high - low)/2;
			
			mergesort(low, pivot);
			mergesort(pivot+1, high);
			merge(low, pivot, high);
		}
	}
	
	public void merge(int low, int pivot, int high){
		//copy low-high to helper
		for(int i=low; i<= high; i++){
			helper[i] = arr[i]; 
		}
		
		int i = low;
		int k = low;
		int j = pivot + 1;
			
		
		while(i <= pivot && j <= high){
			if(helper[i] <= helper[j]){
				arr[k] = helper[i]; 
				i++;
			}else{
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		
		//copy the rest of left
		while(i <= pivot){
			arr[k] = helper[i];
			i++;
			k++;
		}
	}
	
}
