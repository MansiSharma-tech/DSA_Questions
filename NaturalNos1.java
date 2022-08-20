import java.util.*;
public class NaturalNos1
{
    public static void NaturalNo(int num)
    {
        //base condition
        if(num==0)
        
            System.out.println("Whole No");
        
        
        else if(num<0)
        
           System.out.println("Invalid no.");
        
        else{
            for(int i=1; i<=num; i++)
            
          System.out.println(i);
                
            
        }
        
    }    
    

	public static void main(String [] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the No.");
	    int n = sc.nextInt();
		NaturalNo(n);
	}
}
