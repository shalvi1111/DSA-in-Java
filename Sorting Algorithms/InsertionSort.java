import java.util.Arrays;
import java.util.Collections;
public class InsertionSort{

   public static void insertion(int []arr){

   	for (int turns=1; turns<arr.length ;turns++ ) {
   		int cur = arr[turns];
   		int prev = turns-1;
   		while(prev >=0 && arr[prev] > cur){
          arr[prev+1] = arr[prev];
          prev--;
   		}
   		arr[prev+1] = cur;
   	}
   }

   public static void printArray(int []arr){
   	for (int i=0;i<arr.length ;i++ ) {
   		System.out.print(arr[i]+" ");
   	}
   }




	public static void main(String[] args) {
		int [] arr = {5,4,2,3,1};
		insertion(arr);
	// 	//Arrays.sort(arr);
	// //	Arrays.sort(arr,0,3);

	// 	Arrays.sort(arr,Collections.reverseOrder());
		printArray(arr);
	}
}