class BestTeamWithNoConflicts {
    public int bestTeamScore(int[] scores, int[] ages) {
        int len=ages.length;
        int nums[][]=new int[len][2];
        for(int i=0;i<len;i++) {
            nums[i][0]=ages[i];
            nums[i][1]=scores[i];
        }
        Arrays.sort(nums,(a,b)->{
            if(a[0]==b[0])
                return a[1]-b[1];
            return a[0]-b[0];
        });
        int[][] dp=new int[len+1][len+1];
        for(int[] arr:dp)
            Arrays.fill(arr,-1);
        return rec(nums,1,len+1,0,dp);
    }
    int rec(int[][] nums,int curr,int len,int maxIdx,int[][] dp) {
        if(curr==len)
            return 0;
        if(dp[curr][maxIdx]!=-1)
            return dp[curr][maxIdx];
        int maxAge=maxIdx==0?0:nums[maxIdx-1][0];
        int maxScore=maxIdx==0?0:nums[maxIdx-1][1];
        int currAge=nums[curr-1][0];
        int currScore=nums[curr-1][1];
        int include=0;
        if(maxAge==currAge||maxAge<currAge&&maxScore<=currScore) 
            include=currScore+rec(nums,curr+1,len,curr,dp);
        int exclude=rec(nums,curr+1,len,maxIdx,dp);
        return dp[curr][maxIdx]=Math.max(include,exclude);
    }
    
}