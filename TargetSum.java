import java.util.Scanner;
class Main{
    
    public static void FindTarget(int [] arr, int targetValue)
    {
        //base condition 
        if(arr.length==0)
        {
            System.out.println("Enter valid array");
        }
        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==targetValue)
                {
                    System.out.println("("+ i + " ," + j +")");
                }

            }
            
        }
        
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        System.out.println("Enter the element of an array");
        
        int [] arr = new int [size];
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
         System.out.println("Enter the target value");
         int targetValue = sc.nextInt();
         
         FindTarget(arr, targetValue);
    }
}