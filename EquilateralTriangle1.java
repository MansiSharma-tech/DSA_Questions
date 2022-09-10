import java.util.*;
 
// Java code to demonstrate star pattern
public class EquilateralTriangle1
{
    // Function to demonstrate printing pattern
    public static void printTriangle(int n)
    {
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++)//n=3
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)//j=3,
            {
                // printing spaces
                System.out.print("&");
            }
  
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )//j=0,0<=0|| j=1,1<=0
            {
                // printing stars
                System.out.print("* ");
            }
  
            // ending line after each row
            System.out.println();
        }
    }
     
    // Driver Function
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no. of rows you want to print : ");
       int n= sc.nextInt();
        printTriangle(n);
    }
}