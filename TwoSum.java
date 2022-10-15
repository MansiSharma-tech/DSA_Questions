import java.util.*;
public class TwoSum{
    
    public int [] sum(int [] arr, int size, int target)
    {
        int [] newArray = new int[2];
        
        for(int i=0; i<size-1; i++)
        {
             for(int j=i+1; j<size; j++)
             {
                 if(arr[i]+arr[j]==target)
                {
                    newArray[0]=i;
                    newArray[1]=j;
                }
             }
        }
        return newArray;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        System.out.println("Enter the element of an array : ");
        int [] arr = new int[size];
         for(int i=0; i<size; i++)
         {
             arr[i] = sc.nextInt();
         }
        Main obj = new Main();
        System.out.println("Enter the target value : ");
        int target =  sc.nextInt();
       
        int [] result = obj.sum(arr,size,target);
		for(int i=0; i<size; i++)
		{
		    System.out.println(result[i]);
		}
    
    }
    
}
