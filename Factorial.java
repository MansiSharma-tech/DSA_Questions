import java.util.*;
public class FactorialWithoutRecursion{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(Fact(num));
        
    }
    
    public static int Fact(int num){
        int result=1;
        
        for(int i=2; i<=num; i++)
        {
            result *= i;
           
        }
        return result;
        
    }
}