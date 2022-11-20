class NumberOfDistinct {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        
        Set<Integer> arr = new HashSet<>();
        for(int i=0; i<nums.length/2; i++)
        {
            arr.add(nums[i]+nums[nums.length-1-i]);
        }
        return arr.size();
    }
}