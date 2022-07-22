import java.util.*;
public class CountVowelAndConsonent
{

	public static void CountVowelAndConsonent(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    Count(str);
		//System.out.println("Hello World");
	}
	
	public static void Count(String s){
	    int cns=0, vwl=0;
	    
	    //base coding
	    if(s.length() == 0)
	    System.out.println("Plz enter a String");
	    
	    for(int i=0; i<s.length(); i++)
	    {
	        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
	        {
	            vwl++;
	        }
	        else
	        cns++;
	        
	    }
	    System.out.println("vowels = "+vwl+"consonents = " +" " +cns);
	}
}
