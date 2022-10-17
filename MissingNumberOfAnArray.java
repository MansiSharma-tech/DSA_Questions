import java.util.*;
public class MissingNumberOfAnArray{
    
    public int missingNumber(int []arr, int size)//[0,1,3]
    {
        if(size==0)
        
            return -1;
        
         
         Arrays.sort(arr);
         for(int i=0; i<size; i++)
         {
             if(arr[i]!=i)
             
                 return i;
             
             
             
         }
                 return -1;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter size an array");
         int size = sc.nextInt();
         
         int arr[] = new int[size];
        System.out.println("Enter elements of an array");
        for(int i=0; i<size; i++)
        {
            arr[i]= sc.nextInt();
        }
        
        MissingNumberOfAnArray obj = new MissingNumberOfAnArray();
        System.out.println("Missing elements of an array is : ");
        System.out.println(obj.missingNumber(arr,size));
    }
}