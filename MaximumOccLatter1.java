import java.util.*;


public class MaximumOccLatter1
{
    
    
     public static char MaxOccLatter(String sr)//test
     
     {
         int [] arr = new int[256];
         
        //  if(sr.length()==0)
        //  return '';
         
         for(int i=0; i<sr.length(); i++)
         {
             arr[sr.charAt(i)]++;
             
           }
           int count=-1;
           char ch='\0';
            for(int j=0; j<sr.length(); j++)
            {
                if(count<arr[sr.charAt(j)])
                {
                    count=arr[sr.charAt(j)];
                    ch = sr.charAt(j);
                }
                
            }
            return  ch;
         
         
         
         
     }
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    
		System.out.println(MaxOccLatter(str));
	}
}
