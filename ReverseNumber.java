import java.util.*;

public class ReverseNumber{
    
static int reverse(int n){
       
      int rev = 0; // reversed number
      int rem;   // remainder
       
      while(n>0){ //n=123, n=12, n=1
          
        rem = n%10;//rem=3, rem=1
        rev = (rev*10) + rem;//rev=0+3=3, rev=30+2=32, rev=320+1=321
        n = n/10; //n=12, n=1, n=0
      }
       
      return rev;//rev=321
    }
     
   // Driver Function
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
         
        System.out.print("Reversed Number is "+ reverse(n));
    }
   
}