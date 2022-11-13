class TwoOutOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] freqMap = new int[101];
        List<Integer> result = new ArrayList<Integer>();
        
        int[][] all = {nums1, nums2, nums3};
        for(int j = 0; j < all.length; j++) {
            boolean[] tempSeen = new boolean[101];
            for (int i = 0; i < all[j].length; i++) {
                int val = all[j][i];
                if(!tempSeen[val]) {
                    freqMap[val] = freqMap[val] + 1;
                    tempSeen[val] = true;
                }
            }
        }
        
        for(int i = 0; i < freqMap.length; i++) {
            if(freqMap[i] >= 2) {
                result.add(i);
            }
        }
        return result;
    }
}