public class SearchInSortedMatrix{
	

   public static boolean search(int [][] arr,int key){
       // brute force
       for (int i=0;i<arr.length ;i++ ) {
       	 for (int j =0;j<arr[0].length ;i++ ) {
       	 	if (arr[i][j]==key) {
       	 		System.out.println("Found key" +"("+i+","+j+")");
                return true;
       	 	}
       	 }
       }
        return false;
   }

   public static boolean stairCaseSearch(int [][] arr,int key){
   // 1 method

   /*	 int row =0; 
   	 int col = arr[0].length-1;

   	 while(row<arr.length && col>=0){
        if (arr[row][col]==key) {
        	System.out.println("Found key" +"("+row+","+col+")");
        	return true;
        }
        else if (key < arr[row][col]) {
        	  col--;
        }
        else{
        	row++;
        }
   	 }
   	 return false;
   }*/
   
      // 2 method
     int row = arr.length-1;
     int col = 0;
     while(row>=0 && col<arr.length){
     	if (arr[row][col] == key) {
     		System.out.println("Found key" +"("+row+","+col+")");
     		return true;
     	}
     	else if (key < arr[row][col]) {
     		row--;
     	}
     	else{
           col ++;
     	}
     }
       return false;
   }


	public static void main(String[] args) {
		int [][] arr = {{1,2,3,4},
   	                   {5,6,7,8},
   	                   {9,10,11,12},
                       {13,14,15,16}};
         int key = 10;              
      stairCaseSearch(arr,key);   
	}
}