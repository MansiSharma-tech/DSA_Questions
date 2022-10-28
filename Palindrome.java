class Palindrome {
    public boolean isPalindrome(int x) {//121
         int sum=0;
        int temp=x;
        while(x>0)
        {
        int rem = x%10;//rem=1,2
        sum=(sum*10)+rem;//sum=1,121
        x=x/10;//12,1,0
        }
        if(temp==sum)
            return true;
        else
            return false;
        
        
    }
}