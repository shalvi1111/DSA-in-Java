public class QuickSort{
    
    
    static void printArray(int []arr){
    	for (int i=0;i<arr.length ;i++ ) {
    		System.out.print(arr[i]+ " ");
    	}
    } 

	static void quicksot(int []arr ,int si, int ei){
       if (si >= ei) {
       	 return;
       }
       int pIdx = partition(arr,si,ei);

       quicksot(arr,si,pIdx-1);
       quicksot(arr,pIdx+1,ei);
	}
    static int partition(int []arr, int si, int ei){
    	int pivot = arr[ei];
    	int i= si-1;
     for (int j=si ;j<ei ;j++ ) {
     		if (arr[j] <=pivot) {
     			i++;
     		int temp = arr[j];
     		arr[j] = arr[i];
     		arr[i] = temp;	
     		}
     	}
      i++;
      int temp = pivot;
      arr[ei] = arr[i];
      arr[i] = temp;
      return i;		
    }

	public static void main(String[] args) {
		int [] arr ={9,2,4,1,5,6};
		quicksot(arr,0,arr.length-1);
		printArray(arr);
	}
}