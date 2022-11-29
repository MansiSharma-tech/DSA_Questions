class ApplyOperationsToAnArray {
    public int[] applyOperations(int[] nums) {
        if(nums.length<0)
            return nums;
        
        for(int i=0; i<nums.length-1; i++)//1,2,2,1,1,0
        {
            if(nums[i] == nums[i + 1])
            {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        Shift(nums);
        return nums;
        
    }
    public void Shift(int [] nums)
    {
        int count=0;
        for(int i=0; i<nums.length; i++)//1,0,1,2
        {
            if(nums[i]!=0)
            {
                int temp = nums[count];
                nums[count]=nums[i];
                nums[i]=temp;
                count++;
            }
        }
    }
}