import java.util.Scanner;

public class three {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		String firstWord = in.next();
		String secondWord = in.next();
		
		char[] first = firstWord.toCharArray();
		char[] second = secondWord.toCharArray();
		
		mergeSort(first, 0, first.length-1);
		mergeSort(second, 0, second.length-1);
		
		if(String.valueOf(first).equals(String.valueOf(second))){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		in.close();
		
	}
	
	public static void mergeSort(char[] word, int low, int high){
		if(low < high){
			int m = (low + high) / 2;
			mergeSort(word, low, m);
			mergeSort(word, m+1, high);
			merge(word, low, m, high);
		}
	}
	
	public static void merge(char[] word, int low, int m, int high){
		
		char[] helper = new char[word.length];
		for(int i=low; i<=high; i++){
			helper[i] = word[i];
		}
		
		int i = low, k = low;
		int j = m+1;
		
		while(i <= m && j <= high){
			if(helper[i] < helper[j]){
				word[k] = helper[i];
				i++;
			}else{
				word[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while(i <= m){
			word[k] = helper[i];
			i++;
			k++;
		}
		
	}
	
}
