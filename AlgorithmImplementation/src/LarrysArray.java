import java.util.Scanner;

public class LarrysArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		while(T>0){
			
			int N = in.nextInt();
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++){
				arr[i] = in.nextInt();
			}
			
			//loop through
			for(int i=0; i<N-1; i++){
				if(arr[i] > arr[i+1]){
					if(i+1 < N-1){
						//right side of drop as mid, must have extra right
						for(int n = 0; n < 3; n++){
							rotate(arr, i+1);
							if(check3Sorted(arr, i+1)){
								break;
							}
						}
					}else{
						//leftside of drop as mid
						for(int n = 0; n < 3; n++){
							rotate(arr, i);
							if(check3Sorted(arr, i)){
								break;
							}
						}
					}
				}
			}
			
			if(checkFullySorted(arr)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		T--;	
		}
		in.close();
	}
	
	public static void rotate(int[] arr, int mid){
		int temp = arr[mid - 1];
		arr[mid - 1] = arr[mid];
		arr[mid] = arr[mid + 1];
		arr[mid + 1] = temp;
	}
	
	public static boolean check3Sorted(int[] arr, int mid){
		if(arr[mid-1] <= arr[mid] && arr[mid] <= arr[mid+1]){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean checkFullySorted(int[] arr){
		
		for(int i=0; i<arr.length-1; i++){
			
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
		
		return true;
	}

}
