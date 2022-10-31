class Monotonic {
    public boolean isMonotonic(int[] nums) {
         boolean increasing = true;
        int size=nums.length;
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
}