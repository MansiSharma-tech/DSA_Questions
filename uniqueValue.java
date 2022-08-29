import java.util.*;
public class uniqueValue
{
    public static int UniqueValue(int size, int num, int[] arr )
    {
        //base condition 
        if(size==0)
            return 0;
            
          
           //4 ,2, || 10,20,10,20
            Arrays.sort(arr);//10,10,20,20
            int ans = size-num;
            return arr[ans];

    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		System.out.println("Enter the number of unique values you want :  ");
		int num = sc.nextInt();
		
		System.out.println("Enter the elements of an array : ");
		
		int [] arr = new int [size];
		for(int i=0; i<size; i++)
		{
		   arr[i] = sc.nextInt();
		}
		
	

	System.out.println("Answer is : "+ 	UniqueValue(size, num, arr));
		
	}
}