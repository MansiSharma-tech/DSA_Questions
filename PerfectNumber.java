class PerfectNumber {
    public boolean checkPerfectNumber(int num) {//7
        if(num==1)
        return false;
        int sum=1;
        for(int i=2; i*i<=num; i++)
        {
            if(num%i==0)
            {
                sum+=i+num/i;
            }
        }
        if(sum==num)
        return true;
        else
        return false;
    }
}