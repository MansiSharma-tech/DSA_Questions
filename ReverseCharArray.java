class ReverseCharArray {
    public void reverseString(char[] s) {
        char[] ch = new char[s.length];
        int j=0;
        for(int i=s.length-1; i>=0; i--)
        {
            ch[j]=s[i];
            j++;
        }
        for(int i=0; i<s.length; i++)
        {
            s[i]=ch[i];
        }
        
    }
}