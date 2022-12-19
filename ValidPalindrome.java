class ValidPalindrome {
    public boolean isPalindrome(String s) {
    s=s.toLowerCase();
    
    String str = new String();
    for(int i=0; i<s.length(); i++)
    {
        if((s.charAt(i)>='a'&& s.charAt(i)<='z' )||( s.charAt(i)>='0'&& s.charAt(i)<='9' ))
        {
            str=str+s.charAt(i);
        }
    }
     int start=0,last=str.length()-1;
     while(start<last)
     {
         if(str.charAt(start)!=str.charAt(last))
         {
            return false;
         }
         start++;
         last--;
     }
     return true;
    }
}