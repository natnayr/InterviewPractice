import java.util.Scanner;

public class ExtraLongFactorials {

	public static int arrSize = 160; //size of 100! is 160 long
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int[] ans = new int[arrSize];
		int N = sc.nextInt();
		
		//initialise
		for(int i=0; i<arrSize; i++){
			ans[i] = 0;
		}
		ans[arrSize-1] = 1;
		
		for(int i=1; i<=N; i++){
			ans = multiply(ans, i);
		}
		
		//print ans[]
		boolean zeros = true;
		for(int i=0; i<arrSize; i++){
			if(zeros == true && ans[i] > 0){
				zeros = false;
			}
			
			if(zeros == false){
				System.out.print(ans[i]);
			}
		}
		
		sc.close();
		
	}

	
	public static int[] multiply(int[] ans, int by) {
		int[] carry = new int[arrSize];
		for(int i=0; i<arrSize; i++){
			carry[i] = 0;
		}
		
		for(int i = arrSize-1; i >= 0; i--){
			int miniAns = (ans[i] * by) + carry[i];
			carry[i] = 0; //empty carry
			
			if(miniAns > 0){
				ans[i] = miniAns % 10;
				
				if(i-2 >= 0){
					carry[i-2] += miniAns / 100;
					miniAns -= (miniAns/100) * 100;
				}
				
				if(i-1 >= 0) carry[i-1] += miniAns / 10; 
			}
		}
		
		return ans;
	}
	
}
