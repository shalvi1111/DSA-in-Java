public class Arrays_A{
	
    public static int linear_search(int []arr,int key){
    	
    	for(int i=0 ;i< arr.length ;i++){
    		if (arr[i]==key) {
    			return i;
    		}    		
    	}
    	return -1;
    }

    public static int getLargest(int [] arr){
         
         int largest = Integer.MIN_VALUE;
    	for (int i=0 ;i< arr.length ;i++ ) {
    		if (largest < arr[i]) {
    			largest = arr[i];
    		}
    	}
    	return largest;
    }




	public static void main(String[] args) {
		int [] arr ={ 2,4,6,7,8,9,10,11,12};
	/*	int key = 111;
		int index = linear_search(arr,key);
		if (index==-1) {
			System.out.println("Not found");
		}
		else{
		  System.out.println("Found element at index " +index);
	}*/
	   System.out.println(getLargest(arr));
}
}