 public class N_Queens{
	
  // n Queens - n rows (either they are attacking each other ot not )l
  public  static void nQueen(char [][]arr, int row){
    if (row==arr.length) {
    	printChess(arr);
    	return;
    }
      for(int j =0;j<arr.length;j++){
       arr[row][j]='Q';
       nQueen(arr,row+1);
       arr[row][j]='.';  
    }
  }
   public static void printChess(char[][]arr){
    System.out.println("___________CHESSS__________");
     for (int i=0;i<arr.length ;i++ ) {
  	   
       	for (int j=0;j<arr.length ;j++ ) {
     		System.out.print(arr[i][j]+" ");
     	}
     	System.out.println();
     }
   } 

  public static void main(String[] args) {
  	int n =2;
  	char arr [][]= new char[n][n];

  	for (int i=0;i<arr.length ;i++ ) {
  		for (int j=0;j<arr.length ;j++ ) {
  			arr[i][j] ='.';
  		}
  	}
    nQueen(arr,0);
  }
}