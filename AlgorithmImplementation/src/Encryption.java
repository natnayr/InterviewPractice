import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		int len = (int) Math.ceil(Math.sqrt(input.length()));
		int bth = (int) Math.ceil(Math.sqrt(input.length()));
		
		char[][] box = new char[len][bth];
		int idx = 0;
		
		for(int i=0; i<len; i++){
			for(int j=0; j<bth; j++){
				if(idx < input.length()){
					box[i][j] = input.charAt(idx);
					idx++;
				}else{
					box[i][j] = '-';
				}
			}
		}
		
		for(int j=0; j<bth; j++){
			for(int i=0; i<len; i++){
				if(box[i][j] != '-'){
					System.out.print(box[i][j]);
				}
			}
			System.out.print(" ");
		}
		
		in.close();
		
	}
	
	

}
