 import java.util.*;
 public class pushAt_Bottom_Stack{


    static void pushElement(Stack<Integer> s , int data){
    	if (s.isEmpty()) {
    		s.push(data);
    		return ;
    	}
    	int top = s.pop();
    	pushElement(s,data);
    	s.push(top);
    }


 	public static void main(String[] args) {
 		Stack<Integer> s = new Stack<>();
 		s.push(1);               
 		s.push(2);
 		s.push(3);

 		pushElement(s , 4);
 		while (! s.isEmpty()) {
 			System.out.print(s.pop());
 		}

 	}
 }