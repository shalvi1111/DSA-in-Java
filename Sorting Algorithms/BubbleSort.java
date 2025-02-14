public class BubbleSort{

    public static void bubble(int [] arr){
    	int swap =0;
    	for (int turn=0 ;turn<arr.length-1 ;turn++ ) {
    		
    		for (int i=0 ;i<arr.length-1-turn ;i++ ) {
    			if (arr[i] > arr[i+1]) {
    				int temp = arr[i];
    				arr[i] = arr[i+1];
    				arr[i+1] = temp;
    				swap++;
    			}
    		}
    	}
    		System.out.println(swap);
    	

    }
     public static void printArray(int []arr){
     	for(int i=0 ;i<arr.length ; i++){
     		System.out.print(arr[i] +" ");
     	}
     	System.out.println();
     }

	public static void main(String[] args) {
		int [] arr = {1,2,3,5,4};
		bubble(arr);
		printArray(arr);
	}
}