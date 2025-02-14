   public class Recursion_2{
	
/*	public static void main(String[] args) {
		System.out.println(tiling(4));
	}

	static int tiling(int n ){

		if (n==0 || n==1) {
			return 1;
		}
       int vertical = tiling(n-1);
        
        int horizontal = tiling(n-2);

        int total = vertical +horizontal;
        
        return total ; 
	}
}  */

 /* // REMOVE DUPLICATES IN A STRING
 
  public static void main(String[] args) {
  	String str  = "shalvishukla";
  	 removeDuplicate(str,0,new StringBuilder(""),new boolean [26]);
  }

   static void removeDuplicate(String str, int idx , StringBuilder newStr , boolean map[]){
      
      if (idx == str.length()) {
      	System.out.println(newStr);
      	return;
      }
     char currChar = str.charAt(idx);
     if (map[currChar-'a']==true) {
     	 removeDuplicate(str,idx+1,newStr,map);
     }
     else{
     	map[currChar-'a']= true;
        removeDuplicate(str,idx,newStr.append(currChar),map);
     }
 
   }
}  */

 
 /*// FRIEND's PAIRING PROBLEM

  public static void main(String[] args) {
  	int n = 4;
  	System.out.println(friendPairing(n));
  }

  static int friendPairing(int n){
  	if (n ==1 || n==2) {
  		
  		return n;
  	}

  	int fnm1 = friendPairing(n-1);
  	int fnm2 =friendPairing(n-2);
  	int pairways = (n-1) * fnm2;

  	return (fnm1 + pairways);
  }
}  */

  // BINARY STRING PROBLEM
  // print all binary strings of size N without consecutive ones

   public static void main(String[] args) {
   	consecutive_1s(3,0,"");
   }

   static void consecutive_1s(int n ,int lastPlace , String str){
      
      if (n ==0) {
      	System.out.println(str);
      	return ;
      }
     consecutive_1s(n-1 ,0,str+"0");
     if (lastPlace ==0) {
     	  consecutive_1s(n-1 ,1,str+"1");
     } 
   }
 }