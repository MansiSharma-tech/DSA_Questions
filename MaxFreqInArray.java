import java.util.*;
public class MaxFreqInArray
{
    public static int MaxFreq(int [] arr, int size)//arr={1,7,5,1,1}, size=5, res=1
    {
        if(size==0)
			return -1;
		
		 Arrays.sort(arr);//arr={1,1,1,5,7}
		 
	        int max_count = 1, res = arr[0];
	        int curr_count = 1;
	 
	        for (int i = 1; i < size; i++) {
	            if (arr[i] == arr[i - 1])//i=1
	                curr_count++;//2,3,4
	            else
	                curr_count = 1;
	 
	            if (curr_count > max_count) {
	                max_count = curr_count;//max=2,3
	                res = arr[i - 1];//res=1,1,
	            }
	        }
	        if(max_count>size/2)
	        {
	        System.out.println("Max Frequency is :");
	        return res;
	        }
	        else
	        return -1;
	       
	        
    }
	public static void main(String[] args) {
	    
	System.out.println("Enter the size of an Array : ");
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	
	int [] arr = new int [size];
	for(int i=0; i<size; i++)
     arr[i] = sc.nextInt();
	
	System.out.println(MaxFreq(arr,size));
	
	
}
}
