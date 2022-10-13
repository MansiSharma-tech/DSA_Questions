import java.util.*;
// class representing custom exception  
class InvalidNoException  extends Exception  
{  
    public InvalidNoException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
public class DivideByFiveException  
{  
  
    // method to check the age  
    static void validate (int n1, int n2) throws InvalidNoException{    
        if(n2==5 )
        {
  
        // throw an object of user defined exception  
        throw new InvalidNoException("Number can not be divide by 5");    
    }  
       else {  
           int ans = n1/n2;
        System.out.println(" Division of two number is " + ans);   
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st positive numeric number :  ");
        int n1 = sc.nextInt();
        System.out.println("Enter 1st positive numeric number :  ");
        int n2 = sc.nextInt();
        
        try  
        {  
           
            // calling the method   
            validate(n1,n2);  
        }  
        catch (InvalidNoException ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
      
    }  
}  