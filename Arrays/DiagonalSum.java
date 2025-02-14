public class DiagonalSum{
	

   public static int diagonalSum(int [][]arr){
   	int sum =0;
  /* 	// Brute Force
   	for (int i=0;i<arr.length ;i++ ) {
   		for (int j=0 ;j<arr[i].length ;j++ ) {
   			if (i==j) {
   				sum += arr[i][j];
   			}
   			else if ((i+j)==arr.length-1) {
   				sum+= arr[i][j];
   			}
   		}
   	}
   	return sum;
   }*/
      for (int i=0;i<arr.length ;i++ ) {
      	 int j = arr.length-1-i;
      	 
        	sum += arr[i][i];
      	 
      	  if (i!= arr[i][j]) {
      	 	sum += arr[i][j];
      	 }
      }
      return sum ;
    }

	public static void main(String[] args) {
		int [][] arr = {{1,2,3,4},
   	                   {5,6,7,8},
   	                   {9,10,11,12},
                       {13,14,15,16}};
            
       System.out.println(diagonalSum(arr));                
	}
}