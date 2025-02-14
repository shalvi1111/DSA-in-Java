public class MergeSort{

/* //Apply Mergesort to sort an array of Numbers.
   static void  printArray(int []arr){
   	for (int i=0;i<arr.length ;i++ ) {
   		System.out.print(arr[i]);
   	}
   	 System.out.println();
   }
    
   static void mergeSort(int []arr ,int si , int ei){
   	   
   	 if (si >=ei) {
   	 	return ;
   	 }
   	 int mid = si+(ei-si)/2;
   	 mergeSort(arr,si,mid);
   	 mergeSort(arr,mid+1,ei);
   	 merge(arr,si,mid,ei);
   } 

    static void merge(int []arr,int si , int mid, int ei){
       
       int [] temp = new int[ei-si+1];
       int i = si;
       int j =  mid+1;
       int k =0;
       while(i<=mid && j<=ei){
       	if (arr[i] <arr[j]) {
       		temp[k] = arr[i];
       		i++;
       	}
       	else{
       		temp[k] = arr[j];
       		j++;
       	}
       	k++;
       }
       while(i<=mid) {
       	  temp[k++] = arr[i++];
       }
       while(j <= ei){
       	temp[k++] = arr[j++];
       }
       for ( k=0,i=si ;k<temp.length; k++,i++ ) {
       	  arr[i]= temp[k];
       }
     }

	public static void main(String[] args) {
	 int []arr ={6,3,9,5,2,8};
      mergeSort(arr,0,arr.length-1);
      printArray(arr);
	}
}*/


//:Apply Mergesort to sort an array of Strings.
 // (Assume that all the characters in all the Strings are in lowercase). 

  
   static boolean smallerAlphabet(String arr1 , String arr2){
 //     String arr1 = arr1.toLowerCase();
    //  String arr2 = arr2.toLowerCase();
      if (arr1 .compareTo (arr2)<0) {
         return true ;
      }
      return false;
   }

static String[] Mergesort(   String []arr, int si, int ei){
   if (si == ei) {
      String []A = {arr[si]};
      return A;
   }
   int mid = (si+ei)/2;

   String [] arr1 =  Mergesort(arr,si,mid);
   String [] arr2 = Mergesort(arr,mid+1,ei);
   String [] temp = merge(arr1 , arr2);
    return temp;
}
 
  static String[] merge(String arr1[] , String []arr2){
    
    int m = arr1.length ;
    int n = arr2.length;
   String  temp [] = new String [m+n];
   int i =0;
   int j= 0;
   int k = 0;
   
   while(i<m && j<n){
      if (smallerAlphabet(arr1[i] , arr2[j])) {
         temp[k] = arr1[i];
         i++;
      }
      else{
         temp[k]= arr2[j];
         j++;
      }
      k++;
   }
    while(i<m){
      temp[k++]=arr1[i++];
    }
    while(j<n){
      temp[k++]= arr2[j++];
    }
    return temp;
  } 


public static void main(String[] args) {
   String []arr = { "sun", "earth", "mars", "mercury"};
   String [] a = Mergesort(arr,0,arr.length-1);
  for (int i=0;i<a.length ;i++ ) {
     System.out.print(a[i]+" ");
  }
   //printArray(arr);
}
}