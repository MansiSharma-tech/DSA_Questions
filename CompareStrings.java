

import java.util.*;
public class CompareStrings
{
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   String str1 =  sc.nextLine();
	  String str2 =  sc.nextLine();
	  
	 System.out.println(CompareString(str1, str2));
	  
	 }
	 
	 public static boolean CompareString(String s1, String s2 ){
	     if(s1.equals(s2))
	     return true;
	     
	     else return 
	     false;
	 }
	   
	}
	
	