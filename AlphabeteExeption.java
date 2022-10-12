import java.util.*;
// class representing custom exception  
class InvalidCharException  extends Exception  
{  
    public InvalidCharException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
public class AlphabeteExeption  
{  
  
    // method to check the age  
    static void validate (char upr) throws InvalidCharException{    
        if(upr=='A' ||upr=='E'|| upr=='I'|| upr=='O'|| upr=='U' )
        {
  
        // throw an object of user defined exception  
        throw new InvalidCharException("Its a vowel");    
    }  
       else {   
        System.out.println(" it's a consonent");   
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabate :  ");
        char c = sc.next().charAt(0);
        char upr = Character.toUpperCase(c);
        
        try  
        {  
           
            // calling the method   
            validate(upr);  
        }  
        catch (InvalidCharException ex)  
        {  
            System.out.println("Caught the exception");  
    
            // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
      
    }  
}  