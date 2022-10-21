class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int a[]=new int[m+n];
        for(i=0;i<(m+n);i++){
            if(m!=0 && n!=0 && k<n && j<m && nums2[k]<=nums1[j]){
                a[i]=nums2[k];
                k++;
            }else{
                if(m!=0 && n!=0){
                if(j<m){
                a[i]=nums1[j];
                j++;}
                else{
                a[i]=nums2[k];
                k++;  
                }
                }
            }
        }
        if(m==0){
            for (int l=0;l<(m+n);l++){
                nums1[l]=nums2[l];
            }
        }else if(n==0){
            //pass
        }
        else{
            for (int l=0;l<(m+n);l++){
                nums1[l]=a[l];
            }
        }
    }
}