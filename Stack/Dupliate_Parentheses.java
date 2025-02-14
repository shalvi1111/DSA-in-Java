import java.util.*;
public class Dupliate_Parentheses{


   static boolean isDuplicate(String str2){
   	Stack<Character> s = new Stack<>();

   	for (int i=0;i<str2.length() ;i++ ) {
   		char ch = str2.charAt(i);
   		if (ch ==')' ){
   			int count = 0;
   			while(s.peek() !='('){
   			s.pop();
   			count++;
   			
   		}
   		if (count <1) {
   			return true ;
   		}
   		else {
   			s.pop(); 
   		}
   	}
   	else {
   		s.push(ch);
   	}
   		}
   		return false;
   	
   }
	public static void main(String[] args) {
		String str1 = "(((a+b))+c)";
		String str2 = "((a+b) +(c+d))";
		System.out.print(isDuplicate(str2));
	}
}