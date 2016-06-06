import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int start = 0;
		int end = n-1;
		int[][] map = new int[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				map[i][j] = in.nextInt();
			}
		}
		
		while(start < end){
			
			for(int i=0; i<(end-start); i++){
				//store top left
				int temp = map[start][start+i];
				//btmleft to topleft
				map[start][start+i] = map[end-i][start];
				//btmright to btmleft
				map[end-i][start] = map[end][end-i];
				//topright to btmright
				map[end][end-i] = map[start+i][end];
				//topleft temp to topright
				map[start+i][end] = temp;
			}
			
			start++;
			end--;
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		in.close();

	}

}
