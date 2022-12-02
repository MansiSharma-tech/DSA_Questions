class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        int arr[] = new int[26];
        int arr1[] = new int[26];
        for(char i : word1.toCharArray())
        {
            arr[i-'a']++;
        }
        
        for(char i : word2.toCharArray())
        {
            arr1[i-'a']++;
        }
        
        for(int i=0; i<26; i++)
        {
            if(arr[i]==arr1[i])
            {
                continue; 
            }
            if(arr[i]==0||arr1[i]==0)
            {
                return false;
            }
        }
        
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0; i<26; i++)
        {
            if(arr[i]!=arr1[i])
            {
                return false;
            }
        }
        return true;
    }
}