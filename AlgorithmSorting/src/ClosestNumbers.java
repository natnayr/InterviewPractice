import java.util.Scanner;

public class ClosestNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i] = in.nextInt();
		}
		
		//sort arr
		CNMergeSort mergeSort = new CNMergeSort();
		mergeSort.sort(arr);
		
		//calculate differences and put into array
		//diff[i] = i+1
		int lowest = Integer.MAX_VALUE;
		int[] diffArr = new int[arr.length-1];
		for(int i=0; i<N-1; i++){
			diffArr[i] = arr[i+1] - arr[i];
			if(lowest>diffArr[i]) lowest = diffArr[i];
		}
		
		//print out arr[i] pairs which hold the lowest diff
		for(int i=0; i<N-1; i++){
			if(diffArr[i] == lowest){
				System.out.print(arr[i] + " " + arr[i+1] + " ");
			}
		}
		
		in.close();
	}
	
}

class CNMergeSort{
	
	private int[] arr;
	private int[] helper;
	private int n;
	
	public void sort(int[] array){
		this.arr = array;
		n = array.length;
		this.helper = new int[n];
		mergesort(0, n-1);
	}
	
	private void mergesort(int low, int high){
		if (low < high){
			int pivot = low + (high - low) / 2;
			
			mergesort(low, pivot);
			mergesort(pivot + 1, high);
			merge(low, pivot, high);
		}
	}
	
	private void merge(int low, int pivot, int high){
		for(int i=low; i<=high; i++){
			helper[i] = arr[i];
		}
		
		int i = low;
		int j = pivot + 1;
		int k = low;
		
		//push in the smaller	
		while(i <= pivot && j <= high){
			if(helper[i] <= helper[j] ){
				arr[k] = helper[i];
				i++;
			}else{
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		
		//pop in the rest
		while(i <= pivot){
			arr[k] = helper[i];
			k++;
			i++;
		}
	}
	
}	
