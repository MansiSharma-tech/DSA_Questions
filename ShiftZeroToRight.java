import java.util.*;

public class Main
{
    public static int[] ShiftZeroToRight(int [] a)
    {
        if(a.length==1)
        {
            return a;
        }
        
        int newArray[] = new int[a.length];
        int count=0;
        for(int number:a)
        {
            if(number!=0)//for non-zero numbers
            {
                newArray[count]=number;
                count++;
            }
        }
        return newArray;
    }
	public static void main(String[] args) {
	/*	System.out.println("Enter the length of an array : ");
		Scanner sc =  new Scanner(System.in);
		int size  =  sc.nextInt();
		System.out.println("Enter the length of an array : ");
		int [] arr = new int [size];
		for(int i=0; i<size; i++)
		{
		    arr[i] = sc.nextInt();
		}*/
		
		int [] i = new int [] {1,3,2,0,4,0,5};
		System.out.println(Arrays.toString(ShiftZeroToRight(i)));
		
	}
}
