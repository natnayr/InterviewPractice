import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		
		//compression
		Scanner in = new Scanner(System.in);
		
		String word = in.nextLine();
		char[] map = word.toCharArray();
		
		boolean compression = false;
		StringBuffer sb = new StringBuffer();
		int i=0;
		for(; i<map.length-1; i++){
			//if two char are the same
			if(map[i] == map[i+1]){
				compression = true;
				char match = map[i];
				int count = 0;
				int j=i;
				for(; j<map.length; j++){
					if(map[j] == match){
						count++;
					}else{
						break;
					}
				}
				i=j-1;
				sb.append(match +  "" + count);
			}
		}
		if(compression == true){
			System.out.println(sb.toString());
		}else{
			System.out.println(word);
		}
		in.close();

	}

}
