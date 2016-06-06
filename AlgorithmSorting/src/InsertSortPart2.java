import java.util.Scanner;

public class InsertSortPart2 {

	public static void insertionSortPart2(int[] ar) {
        //step by step print insert sort
        int i = 1;
        while(true){

            //spot non-swapped integer
            if(ar[i-1] > ar[i]){
                int toBeSwap = ar[i];
                int j = i;
                for(; j>0; j--){
                    if(toBeSwap < ar[j-1]){
                        //push up
                        ar[j] = ar[j-1];
                    }else{
                    	break;
                    }
                }
                ar[j] = toBeSwap;
            }
            
            printArray(ar);
            i++;
            if(i == ar.length)
                break;
        }
    }
    
    
    /* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertionSortPart2(ar);
         in.close();
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }

}
