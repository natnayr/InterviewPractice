import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt();
		int n = in.nextInt();
		
		int[][] map = new int[m][n];
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				map[i][j] = in.nextInt();
			}
		}
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(map[i][j] == 0){
					for(int ii=0; ii<m; ii++){
						map[ii][j] = -1;
					}
					for(int jj=0; jj<n; jj++){
						map[i][jj] = -1;
					}
				}
			}
		}
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(map[i][j] == -1){
					map[i][j] = 0; 
				}
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		in.close();

	}

}
