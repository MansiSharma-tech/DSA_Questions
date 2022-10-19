import java.util.*;
public class ReverseNumber
{
    public int reverseNumber(int num)
    {
        int result=0;
        if(num==0)
        return 0;
       
	    while(num!=0)
        {
            result = result*10+num%10;
            num = num/10;
        }
        return result;
    }

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value : ");
		int num = sc.nextInt();
		
		Main obj = new Main();
		System.out.println(obj.reverseNumber(num));
		
	}
}
