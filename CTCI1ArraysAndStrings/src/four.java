import java.util.Scanner;

public class four {

	//String with given "true" length, replace with %20
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
	
		String word = in.nextLine();
		int num = in.nextInt();
		
		char[] map = replacement(word, num);
		System.out.println(String.valueOf(map));
		
		in.close();
		
	}

	public static char[] replacement(String word, int num){
		
		char[] map = word.toCharArray();
		
		int mapTail = map.length-1;
		
		for(int i = num-1; i>=0; i--){
			if(map[i] == ' '){
				map[mapTail] = '0';
				map[mapTail-1] = '2';
				map[mapTail-2] = '%';
				mapTail-=2;
			}else{
				map[mapTail] = map[i];
			}
			
			mapTail--;
		}
		
		return map;
	}
	
}
