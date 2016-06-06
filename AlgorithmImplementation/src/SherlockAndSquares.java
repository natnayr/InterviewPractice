import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T>0){
			
			int A = in.nextInt();
			int B = in.nextInt();
			int count = 0;
			
			double a = Math.ceil(Math.sqrt(A));
			double b = Math.floor(Math.sqrt(B));
			
			System.out.println((int) (b - a) + 1);
			
			T--;
		}
		
		in.close();
		
	}

}
