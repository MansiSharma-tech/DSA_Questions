import java.util.*;

public class SecondLargestElement
{
    public static int SecondLargest(int arr1 []){
        int n=arr1.length;
        Arrays.sort(arr1);
        return arr1[n-2];
        
    }
    
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   
	   int arr[] = new int[n];
	   
	   for(int i=0; i<n; i++){
	       
	       arr[i] = sc.nextInt();
	       
	   }
	   
 System.out.println(SecondLargest(arr));
	}
}
