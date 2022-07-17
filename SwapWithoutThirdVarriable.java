import java.util.Scanner;
public class SwapWithoutThirdVarriable
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int n2 = sc. nextInt();
	     System.out.println(n1+" "+ n2);
	     
	     Swap(n1,n2);
	
	}
	
	public static void Swap(int n1, int n2)
	{
	    //n1=1, n2=2
	    n1=n1+n2;//3
	    n2=n1-n2;//1
	    n1=n1-n2;//2
	    System.out.println(n1+" "+ n2);
	}
}
