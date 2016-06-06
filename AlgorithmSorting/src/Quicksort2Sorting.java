import java.util.Scanner;

public class Quicksort2Sorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++){
			arr[i] = in.nextInt();
		}
		
		
		mergesort(arr, 0, size-1);
		
		printBetween(arr, 0, size-1);
		
		in.close();
	}
	
	
	public static void mergesort(int[] arr, int low, int high){
		
		int pivot = arr[low];
		int i = low, j = high;
		
		while(i <= j){
			if(arr[i] < pivot)
				i++;
			
			if(arr[j] > pivot)
				j--;
			
			if(i <= j){
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		
		if (low < j){
			mergesort(arr, low, j);
			printBetween(arr, low, j);
		}
		
		if (i < high){
			mergesort(arr, i, high);
			printBetween(arr, i, high);
		}
		
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printBetween(int[] arr, int low, int high){
		
		for(int i=low; i<=high; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}

}
