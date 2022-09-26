import java.util.*;

public class PowerOfInteger
{
    public static boolean PowerOfInt(int n)
    {

    
    if(n == 1) return true;
        if(n == 0 || n % 2 != 0) return false;
        double d = n/4.0;
        if (d % 1 != 0) return false;
        return PowerOfInt((int)d);
    }
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
    	System.out.println(PowerOfInt(num));
	}
}

