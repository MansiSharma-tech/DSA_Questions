class ArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        Set<Integer> set = new HashSet<>();
        for(int add : nums)
        {
            if(set.contains(add-diff)&&set.contains(add-diff*2))
            {
                count++;
            }
            set.add(add);    
        }
       return count; 
    }
}