class MissingNumOfArrayByFormula {
    public int missingNumber(int[] nums) {
        int size=nums.length;
        int sum=0, totalSum=0;
        for(int i=0; i<size;i++)
        {
            sum=sum+nums[i];
        }
        totalSum= ((size)*(size+1)/2);
        return totalSum-sum;
    }
}