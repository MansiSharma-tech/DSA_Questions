import java.util.*;

public class RemoveElementFromArray
{
    public static int removeElement(int[] nums, int val)
    {
      int size = nums.length;
      if(size==0)
      return -1;
      
      int count=0;
      
      for(int i=0; i<size; i++)
      {
          if(nums[i]==val)
          {
              count++;
          }
      }
    return size-count;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
			System.out.println("Enter elements of an array");
			for(int i=0; i<size; i++)
			{
			    arr[i]=sc.nextInt();
			}
		System.out.println("Enter the element which you want to remove from an array");
		int val=sc.nextInt();
		System.out.println("Your count of remaining elements ")
			System.out.println(removeElement(arr,val));
	}
}
