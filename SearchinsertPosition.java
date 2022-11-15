
class SearchinsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l=0; //low pointer
        int h=nums.length-1; //high pointer
        int mid = l+(h-l)/2; //calculating mid
        while(l<=h){
		
            if(target==nums[mid])
                return mid; //if found return
				
            else if(target>nums[mid])
                l=mid+1;
				
            else
                h=mid-1;
				
            mid=l+(h-l)/2;
        }
        return mid; 
        
    }
}