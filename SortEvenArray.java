import java.util.*;
public class SortEvenArray
{
    public static int[] sortEvenArray(int [] arr, int size)
    {
        if(arr.length==0)
        System.out.println("Enter valid array");
        int firstIndex=0,lastIndex=size-1;
        int [] newArr = new int[size];
        for(int i=0; i<size; i++)
        {
            if(arr[i]%2==0)
            {
                newArr[firstIndex]=arr[i];
                firstIndex++;
            }
            else{
                newArr[lastIndex]=arr[i];
                lastIndex--;
            }
            
        }
        return newArr;
    }
	public static void main(String[] args) {
		System.out.println("Enter size of an array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int [size];
		for(int i=0; i<size; i++)
		{
		    arr[i] = sc.nextInt();
		}
		System.out.println("Sorted elements are: ");
		int [] result = sortEvenArray(arr,size);
		for(int i=0; i<size; i++)
		{
		    System.out.println(result[i]);
		}
	}
}
