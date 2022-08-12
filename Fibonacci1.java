import java.util.*;
public class Fibonacci1{
    
    public static void Fibo(int num){
        
        // base condition 
        if(num<=0)
        {
            System.out.println("enter valid no");
        }
        int f1 =0, f2=1, f3=0;
         System.out.println(f1);//0,1
         System.out.println(f2);
       
        for(int i=0; i<num-2; i++)//i<2
        {
             f3=f1+f2;//1, 
             f1=f2;
             f2=f3;
              System.out.println(f3);//1,
        }
    }
    
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibo(n);
        
    }
}