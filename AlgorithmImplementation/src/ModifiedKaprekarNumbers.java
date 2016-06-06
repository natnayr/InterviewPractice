import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int p = in.nextInt();
		int q = in.nextInt();
		
		boolean giveWarning = true;
		
		for(long i = p; i <= q; i++){
			if(i == 1){
				System.out.print(1 + " ");
				giveWarning = false;
				continue;
			}
			
			long square = i * i;
			String val = String.valueOf(square);
			
			if(val.length() == 1){
				continue;
			}
			
			int pivot = val.length() / 2;
			long left = Long.valueOf(val.substring(0, pivot));
			long right = Long.valueOf(val.substring(pivot, val.length()));
			
			if((left + right) == i){
				System.out.print(i + " ");
				giveWarning = false;
			}
			
		}
		
		if(giveWarning == true){
			System.out.println("INVALID RANGE");
		}
		
		in.close();
	}

}
