import java.util.*;
public class SelectionSort{


   public static void selection(int [] arr){
     for(int turns=0; turns <arr.length-1; turns++){
      int smallest = turns;
        for (int j=turns+1; j<arr.length ;j++ ) {
          if (arr[j] < arr[smallest]) {
            smallest = j;
          }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[turns];
        arr[turns] = temp;
   }
   }

   public static void printArray(int [] arr){
     for (int i =0;i<arr.length ;i++ ) {
      System.out.print(arr[i]+" ");
     }
      System.out.println();
   }
 

	public static void main(String[] args) {
		int [] arr = {5,4,1,3,2};
		selection(arr);
		printArray(arr);
	}
}