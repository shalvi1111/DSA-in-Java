public class Sudoko{
	

   public static boolean isSafe(int[][] sudoko, int row ,int col,int dig){

    // col
     for (int i=0;i<=8 ;i++ ) {
       if (sudoko[i][col] == dig) {
         return false;
       }
     }

      for (int j=0;j<=8 ;j++ ) {
        if (sudoko[row][j] ==dig) {
           return false;
        }
      }

      //grid
      int sr = (row/3)*3;
      int sc = (col/3)*3;

      for(int i= sr;i<sr+3; i++){
        for(int j =sc; j<sc+3;j++){
          if (sudoko[i][j]==dig) {
            return false;
          }
        }
      }
      return true;
   }  
  


   public static boolean sudokoSol(int[][] sudoko, int row , int col){

       if (row==8 && col ==8) {
         return true;
       }

       int nextRow = row ,nextCol = col+1;
      if(col+1 ==9){
        nextRow = row+1;
        nextCol=0;
      }

      if (sudoko[row][col] !=0) {
       return sudokoSol(sudoko,nextRow,nextCol);
      }
    for (int dig =1; dig<=9 ;dig++ ) {
        if (isSafe(sudoko , row,col,dig)) {
            sudoko[row][col] =dig;
          if(sudokoSol(sudoko,nextRow , nextCol)){
            return true;
          }
          sudoko[row][col] =0;
        }
    }
     return false;
   }

    public static void printSudoko(int [][]sudoko){
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
        System.out.print(sudoko[i][j]+" ");
      }
      System.out.println();
    }
   }





  public static void main(String[] args) {
  	int [][] sudoko= {{0 ,0, 0, 0, 0, 0, 0, 5, 0},
                       {2 ,0 ,7 ,0 ,0 ,9 ,0 ,0 ,0},
                       {6, 0, 0 ,3, 5, 1, 0, 0, 0},
                       {5 ,0 ,0 ,0 ,0 ,0 ,0 ,1 ,0},
                       {0, 0, 3, 0, 0, 0, 0, 0, 8},
                       {0 ,0 ,0 ,8 ,2 ,0 ,5 ,3 ,0},
                       {0, 0, 0, 0, 7, 0, 8, 0, 4},
                       {0 ,0 ,6 ,2 ,0 ,0 ,0 ,0 ,0},
                       {0, 8, 0, 0, 0, 0, 7, 0, 0}};
       if (sudokoSol(sudoko,0,0)) {
         System.out.println("Sol exist");
         printSudoko(sudoko);
       }
       else{
        System.out.println("sol does not exist");
       }
}
  }
	