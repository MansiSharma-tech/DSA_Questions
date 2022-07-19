

import java.util.*;
public class PrintPrimeNumber
{
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   int num =  sc.nextInt();// num=8
	   
	   PrintPrimeNumber obj= new PrintPrimeNumber();
	   
	 for(int i=1; i<num;i++)//i=1, 1<8;i++
	 {
	     if(obj.prime(i)){
	         
	           System.out.print(" "+i);
	   
	     }
	 }
	 
	   
	}
	
	public boolean prime(int mansi){
	
	//base condition for nagative Number
	if(n<=1)//1<=1
	return false;
	
	//logic
	
	for(int i=2; i<mansi; i++){//2<3,3<3
	    if(mansi%i==0)//3%2=1,
	   return false;
	    
	    
	}
	return true;
	   
	
	}
}