import java.util.Scanner;

public class TheGridSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T > 0){
			
			int R = sc.nextInt();
			int C = sc.nextInt();
			
			
			String[] grid = new String[R];
			
			for(int i=0; i < R; i++){
				grid[i] = sc.next();
			}
			
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			String[] match = new String[r];
			
			for(int i=0; i < r; i++){
				match[i] = sc.next();
			}
			
			if(matchingAlgo(match, grid, R, C, r, c)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
			T--;
		}
		
		sc.close();
		
	}

	
	public static boolean matchingAlgo(String[] match, String[] grid, int R, int C, int r, int c){ 
		
		
		
		for(int i=0; i<R; i++){
			for(int j=0; j<C; j++){
				
				if(j+c <= C){
					if(grid[i].substring(j, j+c).equals(match[0]) && i+r <= R){//matches first line
						
						int mustmatch = r;
						boolean escape = false;
					
						//start matching downwards
						for(int k=i, g=0; k<R && g<r && escape == false; k++, g++){
							if(grid[k].substring(j, j+c).equals(match[g])){
								mustmatch--;
							}else{
								escape = true;
							}
						}
						
						if(mustmatch == 0){
							return true;
						}
						
					}	
				}
				
			}
		}
		
		return false;
	}
	
	
	
}
