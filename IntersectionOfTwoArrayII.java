class IntersectionOfTwoArrayII {
    public int[] intersect(int[] nums1, int[] nums2) { //n1= 4,5,9  n2=4,4,8,9,9
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
     ArrayList<Integer> arr = new ArrayList<Integer>();
        // Use two pointers i and j for the two arrays and initialize both with zero.
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            // If nums1[i] is less than nums2[j]...
            // Leave the smaller element and go to next(greater) element in nums1...
            if(nums1[i] < nums2[j]) {
                i++;
            }
            // If nums1[i] is greater than nums2[j]...
            // Go to next(greater) element in nums2 array...
            else if(nums1[i] > nums2[j]){
                j++;
            }
            // If both the elements intersected...
            // Add this element to arr & increment both i and j.
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        int arr1[] = new int[arr.size()];
        for(int k=0; k<arr.size(); k++)
        {
            arr1[k] = arr.get(k);
        }
        return arr1;
    }
}