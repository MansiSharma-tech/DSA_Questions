import java.util.*;
public class ReverseArr1
{
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the size of the array : ");
	   int size = sc.nextInt();
	   int [] arr = new int[size] ; 
	 
	   
	   for(int i=0; i<size; i++)
	   {
	       arr[i]= sc.nextInt();
	   }
	  
	    int [] newarr =  reverseArray(arr);
        
	    
	   for(int i=0; i<size; i++)
	   {
	       System.out.println(newarr[i]);
	   }
	  
	  
	 }
	 
	 public static int [] reverseArray(int [] a){
	     
	     int [] result = new int[a.length];
	     int index=0;
	     
	     for(int i=a.length-1; i>=0; i--){
	         result[index]=a[i];
	         index++;
	         
	     }
	     return result;
	    
	 }
	   
	}
	
	