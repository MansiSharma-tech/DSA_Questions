import java.util.*;

public class PrimeNumber
{
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   int num =  sc.nextInt();// num=3
	   
	   PrimeNumber obj= new PrimeNumber();
	   System.out.println(obj.prime(num));
	   
	   
	}
	
	public boolean prime(int n){//n=3
	
	//base condition for nagative Number
	if(n<=1)//3<=1
	return false;
	
	//logic
	
	for(int i=2; i<n; i++){//2<3,3<3
	    if(n%i==0)//3%2=1,
	   return false;
	    
	    
	}
	return true;
	   
	
	}
}
