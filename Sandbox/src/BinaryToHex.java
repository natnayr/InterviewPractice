import java.util.Scanner;

public class BinaryToHex {

	public static void main(String[] args) {
		
		//program to check if the binary and hexidecimal number are equal in value
		Scanner in = new Scanner(System.in);
		
		System.out.print("Type binary:");
		String binary = in.nextLine();
		
		System.out.print("Type hexadecimal:");
		String hex = in.nextLine();
		
		
		
		
		in.close();
	}
	
	public boolean compareBinToHex(String hex, String bin){
		
		int binNum = convertToBase(bin, 2);
		int hexNum = convertToBase(hex, 16);
		
		if(binNum < 0 || hexNum < 0)
			return false;
		else
			return binNum == hexNum;	
	}

	public int convertToBase(String strValue, int base){
		
		return 0;
	}
	
}
