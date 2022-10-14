import java.util.*;
public class MonotonicArray
{
     public boolean monotonus(int [] nums, int size)
     {
         boolean increasing = true;
			boolean decreasing = true;
       	//  [1,3,2]
			for(int i=0;i<size-1;i++){
				if(nums[i]<nums[i+1])//1<3, 3<2
				{
					decreasing =false;//f,f
				}
				if(nums[i]>nums[i+1])//1>3,3>2
				{
					increasing =false;//t,f
				}
			}
    
			return increasing || decreasing;
     }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   	System.out.println("Enter size of an array ");
	    int size = sc.nextInt();
	    
	     int [] arr = new int [size] ;
	     for(int i=0; i<=size; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    
	
	}
}
