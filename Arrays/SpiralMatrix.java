public class SpiralMatrix{

	public static void spiral(int [][] arr){
     
     int startRow = 0;
     int startCol = 0;
     int endRow = arr.length-1;
     int endCol = arr[0].length-1;

     while(startRow <= endRow && startCol <= endCol){

     	// top
     	for (int t = startCol;t<=endCol ;t++ ) {
     		System.out.print(arr[startRow][t]+" ");
     	}

     	// right
     	for (int l =startRow+1;l<=endRow ;l++ ) {
     		System.out.print(arr[l][endCol]+" ");
     	}
     	// bottom
     	for (int b = endCol-1;b>=startCol ;b-- ) {
     		if (startRow == endRow) {
     			break;
     		}
     		System.out.print(arr[endRow][b]+" ");
     	}
     	// left 
     	for (int r= endRow-1; r>=startRow+1;r-- ) {
     		if (startCol == endCol) {
     			break;
     		}
     		System.out.print(arr[r][startCol]+" ");
     	}
     
        startRow++;
        startCol++;
        endRow--;
        endCol --;
    }
    System.out.println();
	}



   public static void main(String[] args) {
   	int [] [] arr = {{1,2,3,4},
   	                 {5,6,7,8},
   	                   {9,10,11,12},
                       {13,14,15,16}};
     spiral(arr);                  
   }

}
