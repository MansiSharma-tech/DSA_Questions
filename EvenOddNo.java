import java.util.*;
public class EvenOddNo
{
    public static void EvenOdd(int num)
    {
        //base condition
        if(num<=0)
        {
            System.out.println("Invalid No.");
        }
        
        else if(num%2==0)
        {
            System.out.println("Even No.");
        }
        else
        {
            System.out.println("Odd No.");
        }
    }
     
	public static void main(String [] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the No.");
	    int n = sc.nextInt();
		EvenOdd(n);
	}
}