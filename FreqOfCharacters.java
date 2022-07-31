import java.util.*;

public class FreqOfCharacters
{
    
    public static void FreqOfChar(String stri)
    {
        int[] freq = new int[stri.length()];    
        int i, j;    
         
         char [] charArr = stri.toCharArray();
            
        //base condition
        
        if(stri.length()==0)
    
        {
            System.out.println("Empty String");
        }
        
        for(i=0; i<stri.length(); i++)
        {
              freq[i] = 1;   
            for(j=1; j<stri.length(); j++)
            {
                if(charArr[i]==charArr[j])
                {
                 freq[i]++;    
            
            charArr[j] = '0'; 
                }
            }
        }
        
         for(i = 0; i <freq.length; i++) {    
            if(charArr[i] != ' ' && charArr[i] != '0')    
                System.out.println(charArr[i] + "-" + freq[i]);    
        }    
    
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    FreqOfChar(str);
		
	}
}
