import java.util.*;
public class LargestPositiveInteger
{
    public int MaximumPositiveNegative(int arr[], int size)//-7,-1,4,3,7,10
    {
        Arrays.sort(arr);
        if(arr[0]>0)
        return -1;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<size; i++)
        {
            set.add(arr[i]);
        }
        
        for(int i=size-1; i>=0; i--)
        {
            if(set.contains(-arr[i]))
            return arr[i];
        }
        return -1;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the Elements of an Array : ");
		for(int i=0; i<size; i++)
		{
		    arr[i]= sc.nextInt();
		}
		
		LargestPositiveInteger obj = new LargestPositiveInteger();
		System.out.println("The Maximum positive and Negative Element of an Array : ");
		System.out.println(obj.MaximumPositiveNegative(arr,size));
	}
}
