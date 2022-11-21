class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);//1,1,1,2,2
        HashMap<Integer, Integer> data = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
           int value = nums[i];
            if(data.containsKey(value))
            {
                data.put(value,data.get(value)+1);
                    
            if(data.get(value)>nums.length/2)
                return value;
            }
        
        else{
              data.put(value,1) ;
            }
        }
        return nums[0];
    }
}