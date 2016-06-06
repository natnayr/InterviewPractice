import java.util.LinkedList;
import java.util.Scanner;

public class SherlockAndWatson {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i=0; i<n; i++){
			list.add(in.nextInt());
		}
		
		for(int i=0; i<k; i++){
			list.push(list.removeLast());
			
		}
		
		for(int i=0; i<q; i++){
			int qNum = in.nextInt();
			System.out.println(list.get(qNum));
		}
		
		in.close();

	}

}
