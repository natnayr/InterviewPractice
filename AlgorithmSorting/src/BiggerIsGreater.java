import java.util.Scanner;

public class BiggerIsGreater {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		while(T>0){
			
			String read = in.next();
			
			int[] arr = new int[read.length()];
			for(int i=0; i<read.length(); i++){
				arr[i] = read.charAt(i) - 97;
			}
			
			if(!nextPermutation(arr)){
				System.out.println("no answer");
			}else{
			
				for(int i=0; i<arr.length; i++){
					System.out.print((char)(arr[i] + 97));
				}
				System.out.println();
			}
			
			T--;
		}
		
		in.close();

	}
	
	public static boolean nextPermutation(int[] arr){
		//find i, pivot is arr[i-1]
		int i = arr.length-1;
		while(i>0 && arr[i-1] >= arr[i]){
			i--;
		}
		
		//last permutation
		if(i <= 0)
			return false;
		
		//find the next biggest from right than arr[i-1]
		int j = arr.length-1;
		while(arr[j] <= arr[i-1]){
			j--;
		}
		
		//swap arr[j] with arr[i-1]
		int temp = arr[i-1];
		arr[i-1] = arr[j];
		arr[j] = temp;
		
		
		//reverse from i onwards
		for(int k=arr.length-1; k > i;){
			int revtemp = arr[i];
			arr[i] = arr[k];
			arr[k] = revtemp;
			i++;
			k--;
		}
		
		return true;
	}

}
