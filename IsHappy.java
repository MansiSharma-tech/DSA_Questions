class IsHappy {
public static boolean isHappy(int n) {//9
int sum = 0, temp = 0;

	//1*1 = 1, 2*2 = 4, 3*3 = 9, more than that we have 2 digits!
	while(n > 4)//9>4
	{
		sum = 0; temp = n;//temp=9
		while(temp > 0)//9>0
		{
			sum += (temp%10)*(temp%10);//sum=0+9*9=81
			temp = temp/10;//9/10=0 	        	
		}
		n = sum;
	}
	return n == 1;
}
public static void main(String agrs[])
{
    int n=9;
    System.out.println(isHappy(n));
}
}