import java.util.*;

public class EvenOdd
{ 
    public static int [] evenOdd(int [] arr, int size)
    {
        int evenCounter=0, oddCounter=1;
        int [] result = new int [size];
        
        if(size==0)
        return result;
        
        
        for(int i=0; i<size; i++)
        {
            if(arr[i]%2==0)
            {
                result[i]=arr[i];
                evenCounter+=2;
            }
            else{
                result[i] = arr[i];
                oddCounter+=2;
            }
        }
        return result;
        
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter an size of an Array : ");
		int size = sc.nextInt();
		int arr[] = new int [size];
		for(int i=0; i<size; i++)
		{
		    arr[i] = sc.nextInt();
		}
		 System.out.println("result is : ");
		int [] finalResult=evenOdd(arr,size);
		for(int i=0; i<size; i++)
		{
		    System.out.println(finalResult[i]);
		}
		
	}
}
