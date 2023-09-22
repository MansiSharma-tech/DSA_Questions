class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
		// base case
        if(s.length() == 0) return true;
        
        int j = 0;
        for(char ch: t.toCharArray()){
            if(j >= s.length()) break;
            if(ch == s.charAt(j)) j++;
        }
        
		// If we reached the end of the string s, then it is a vaild sub sequence.
        if(j == s.length()) return true;
        return false;
    }
}