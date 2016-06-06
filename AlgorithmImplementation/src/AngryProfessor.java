import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T > 0){
			int N = sc.nextInt();
			int K = sc.nextInt();
			int count = 0;
			
			for(int i=0; i<N; i++){
				int num = sc.nextInt();
				if(num <= 0){
					count++;
				}
			}
			
			if(count < K){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
			
			T--;
		}
		
		sc.close();
	}

}
