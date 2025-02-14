import java.util.*;
public class rvrs_String_Stack{

   static String reverse(String str){
   	Stack<Character> s = new Stack<>();
   	int idx = 0;
   	while(idx < str.length()){
   		s.push(str.charAt(idx));
   		idx++;
   	}
   	StringBuilder newStr = new StringBuilder("");
   	while (!s.isEmpty()) {
   		char curr = s.pop();
   		newStr.append(curr);
   	}
   	return newStr.toString();
   }

	public static void main(String[] args) {
		String str = "abc";
		System.out.print(reverse(str));
	}
}