import java.util.*;
public class Recursion{

/*	// PRINT NO FROM N TO 1 IN dec order
		public static void main(String[] args) {
		int n = 11;
		printNo(n);
	}


	public static void printNo(int n){

		if (n==1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printNo(n-1);
	}
}*/

 /* // PRINT NO FROM N TO 1 IN INCREASING ORDER

   public static void main(String[] args) {
   	int n = 10;
   	printINC(n);
   }

     static void printINC(int n){
     	if(n == 1){
     		System.out.print(n +" ");
     		return;
     	}
     	
     	printINC(n-1);
     	System.out.print(n+" ");
     }
 } */

 /*  // FIND FACTORIAL of N NUMBERS

   public static void main(String[] args) {
   	int n = 5 ;
   System.out.println(printfac(5));
   }

     static int printfac(int n){
     	
     	if (n == 0) {	
         return 1;
     	}
     	int facnm1 = printfac((n-1));
     	int fac = n*printfac((n-1));
     		
     return fac;
 }
}  */

 /* // PRINT SUM OF N NATURAL NUMBER

    public static void main(String[] args) {
    	int n =5;
    	System.out.print(printsum(n));
    }

     static int printsum(int n ){
     	 if (n == 1) {
     	 	return 1 ;
     	 }
     	  int sum_nm1 = printsum(n-1);
     	  int sum = n + printsum(n-1);
     	  return sum ;
     }
 }  */

 /*  // PRINT FIBONCCI SERIES 

    public static void main(String[] args) {
    	int n = 7 ;
    	System.out.println(fibonaaci(n));
    }


      static int fibonaaci(int n ){
      if (n==0 || n==1) {
          return 1 ;
      }
      	int fib_nm1 = fibonaaci(n -1);
      	int fib = fib_nm1 + fibonaaci(n-2);
      	 return fib;
      }
  }  */

 /*   //  SORTED ARRAY

   public static void main(String[] args) {
     int [] arr = {1,2,3,4 };
     
     System.out.println(isSorted(arr,1));
   }

    static boolean isSorted(int [] arr,int i){
       if (i == arr.length-1) {
           return true;
       }
       if (arr[i] >=arr[i+1]) {
            return false;
       }
           
       return isSorted(arr,arr[i+1]);
    }
  }  */

  /*  // FIRST OCCURENCE OF ELEMENT

    public static void main(String[] args) {
      int [] arr = {8,3,6,9,5,10,2,5,3};
      int key = 11 ;
     System.out.println(firstOccurence(arr,key,0));
    }

     static int firstOccurence(int []arr ,int key,int i){

      if (arr.length == i) {
         return -1;
      }

      if ( arr[i] == key) {
          return i;
      }
      return firstOccurence(arr,key,i+1);
     }
   }  */

  /*  // LAST OCCURENCE OF ELEMENT

    public static void main(String[] args) {
      int [] arr = {8,3,6,9,5,10,2,5,3};
      int key = 5 ;
     System.out.println(lastOccurence(arr,key,0));
   }

     static int lastOccurence(int [] arr , int key ,int i){

      if (i ==arr.length) {
         return -1;
      }

      int isFound = lastOccurence(arr,key,i+1);
       if (arr[i] ==key && isFound == -1) {
           
              return i;
           }
           return isFound; 
     }
   }  */

    //POWER

   public static void main(String[] args) {
    int n =2;
    int x = 10;
     System.out.println(power(n , x));
   }

   static int power(int n ,int x){
  /*  if (x==0) {
        return 1;
    }
    int mul = power(n,x-1);
    int res = n * mul;
    
     return res;  */

     //OPTIMIZED WAY

      if (x==0) {
        return 1;
      }

     int poe = power(n,x/2)*power(n,x/2);
       if (x %2 !=0) {
           return n*poe ;
       }
       
       return poe;
   }
 }