class MinimizeMaximumOfArray {
    public int minimizeArrayValue(int[] nums) {
        long max = nums[0];
        long sum = nums[0];
        for(int i=1; i<nums.length; i++) {
            sum += nums[i];
            long ans = sum%(i+1) == 0 ? sum / (i+1) : sum / (i+1) + 1;
            max = Math.max(max, ans);
        }
        
        return (int) max;
    }
}