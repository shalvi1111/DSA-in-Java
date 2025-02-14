public class Circular_Queue{


  static class Queue{
  	static int arr[];
  	static int size;
  	static int rear ;
  	static int front ;

  	Queue(int n){
  		arr = new int[n];
  		size = n;
  		rear = -1;
  		front = -1;
  	}

  	static boolean isEmpty(){
  		return rear == -1 &&( front == -1);
  	}

  	static boolean isFull(){
  		return (rear+1)%size == front;
  	}
  	static void add(int data){
  		
  		if (isFull()) {
  			System.out.print("Queue is full");
  			return ;
  		}
  		if (isEmpty()) {
  			front =0;
  		}

  		rear = (rear+1)%size;
  		arr[rear] = data ;
  	}
  	static int remove(){
  		if (isEmpty()) {
  			System.out.print("Queue is empty");
  			return -1;
  		}
  		int res = arr[front];
  		
            // del of last element
  	       if (rear == front) {
  	       	rear = front = -1;
  	       
  	       }
  	       else {
  	       	front = (front+1)%size;
  	       }
  	       return res ;
  	}

  	static int peek(){
  		if (isEmpty()) {
  			System.out.print("Queue is empty");
  			return -1;
  		}
  		return arr[front];
  	}
  }






	public static void main(String[] args) {
	  Queue q = new Queue(3);
	  q.add(1);
	  q.add(2);
	  q.add(3);
	  System.out.println("_______");
	  System.out.print(q.remove());
	  q.add(4);
	  System.out.println("_______");
	  System.out.print(q.remove());
	  q.add(5);

	  while (!q.isEmpty()) {
	  		System.out.print(q.peek());
	  		q.remove();
	  	}	
	}
}