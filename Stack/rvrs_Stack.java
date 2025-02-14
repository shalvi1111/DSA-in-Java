import java.util.*;
public class rvrs_Stack{
	

   static void pushAtBottom(Stack<Integer> s , int data){
   	if (s.isEmpty()) {
   		s.push(data);
   		return ;
   	}
   	int top = s.pop();
   	pushAtBottom(s,data);
   	s.push(top);
   }

    static void reverse_Stack(Stack <Integer> s ){
    	if (s.isEmpty()) {
    		return ;
    	}
    	int top = s.pop();
    	reverse_Stack(s);
    	pushAtBottom(s,top);

    }
    static void printStack(Stack<Integer> s){
    	while (!s.isEmpty()) {
    		System.out.print(s.pop());
    	}
    }



	public static void main(String[] args) {
		Stack <Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);

		
		reverse_Stack(s);
		printStack(s);
	}
}