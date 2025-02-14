public class Binary_Search{
	
   public static int binary_search(int [] arr,int key){
   	  int start = 0;
   	  int end =arr.length-1;
       for (int i=start ;i<= end ;i++ ) {
       	int mid = (start + end)/2;
       	if (arr[mid]==key ) {
       	 	return mid;
       	 } 
       	 else if(arr[mid] >key){
          end = mid-1;
       	 }
       	 else{
            start = mid+1;
       	 }
       }
       return -1;
   }

	public static void main(String[] args) {
		int [] arr= {2,4,6,8,10,12};
		int key = 1;
		int index = binary_search(arr,key);
		if (index==-1) {
			System.out.println("NOT FOUND");
		}
		else{
			System.out.println("Found at index "+index);
		}
	//	System.out.println("found key at index " +binary_search(arr,key));
	}
}