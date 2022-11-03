class DistinctNoOfAnArray {
    public int singleNumber(int[] nums) {//[4,1,2,1,2]
   int n = nums.length;//5
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            ans ^= nums[i];
        }
        return ans;
}
}