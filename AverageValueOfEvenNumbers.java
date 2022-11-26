class AverageValueOfEvenNumbers {
    public int averageValue(int[] nums) {
        int add=0, avg=0,count=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2==0&&nums[i]%3==0)
            {
                add+=nums[i];
                count++;      
            }
            
        }
        if(count>0)
        {
        avg = add/count;
        return avg;
        }
        return avg;
    }
}