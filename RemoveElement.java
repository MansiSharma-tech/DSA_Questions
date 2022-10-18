import java.util.*;

public class RemoveElement
    {
    public static void removeElement(int[] nums, int val) {//1,2,2,3,, val=2
          
      int res=0;
        for(int i=0; i<nums.length; i++){// i=0,1,2,3
            if(nums[i]!=val){//1!=2,2!=2,2!=2,2!=3
                nums[res]=nums[i];//nums[0]=1,nums[1]=3
                res++;//1,2
            }
        }
        for(int i=0; i<res; i++ )
        {
            System.out.println(nums[i]);
        }
        
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
		System.out.println("Your count of remaining elements ");
		removeElement(arr,val);
	}
}
