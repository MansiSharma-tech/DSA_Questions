class Sqrt(x) {
    public int mySqrt(int x) {
       long left=0, right=x;

       while(left<right)
       {
           long mid = left + ((long) right - left + 1) / 2;
           if(mid*mid<=(long)x)
           {
               left=mid;
           }
           else
           {
               right=mid-1;
           }
       }
return (int)left;
    }
}