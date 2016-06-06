import java.util.Scanner;

public class Quicksort1Partition {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] arr = new int[size];
		
		//populate array
		for(int i=0; i<size; i++){
			arr[i] = in.nextInt();
		}

		quicksort(arr, 0, size - 1);
		
		for(int num : arr){
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		in.close();
	}
	
	
	
	public static void quicksort(int[] arr, int low, int high){
		
		int pivot = arr[low]; //pick left most element
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int l = 0, r = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] < pivot){
				left[l] = arr[i];
			    l++;
			}else{
				right[r] = arr[i];
				r++;
			}
		}
		
		int k = 0;
		for(int i=0; i<arr.length; i++){
			if(i<l){
				arr[i] = left[i];
			}else{
				arr[i] = right[k];
				k++;
			}
		}
		
			
	}

	
}
