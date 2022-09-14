import java.util.*;
public class MaxEvenFrq
{
    public static int maxEvenFrq(int [] nums)
    {
        int n=nums.length;
	        if(n==1 && nums[0]%2==0)
	           return nums[0];
	        Arrays.sort(nums);
	        
	      int max_count = 1, res = nums[0];
	        int curr_count = 1 ,count=0 ,res1=0;
	 
	        for (int i = 1; i < n; i++) {
	            if(nums[i]%2==0){
	                if(count ==0){
	                    count ++;
	                    res1=nums[i];
	                    
	                }
	             
	                
	            if (nums[i] == nums[i - 1] )
	                curr_count++;
	            else
	                curr_count = 1;
	 
	            if (curr_count > max_count) {
	                max_count = curr_count;
	                res = nums[i - 1];
	            }
	        }}
	        if(curr_count==1&& count!=0)
	            return res1;
	        if(curr_count==1)
	            return -1;
	        return res;
    }
	public static void main(String[] args) {
		System.out.println("Enter size : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
			System.out.println("Enter Array element : ");
		int [] arr = new int [size];
		
		for(int i=0; i<size; i++)
		{
		    arr[i]= sc.nextInt();
		}
		System.out.println("Max even frequescy is  : ");
	System.out.println(maxEvenFrq(arr));
	}
}
