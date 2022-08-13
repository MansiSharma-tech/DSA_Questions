import java.util.*;
public class DiagonalMetrix
{
     public static int DiagonalSumOfMetrix(int [][]  arr, int row, int col){
         int sum=0;
    
           //base condition
           if(arr.length==0)
           {
             return 0;
           }
        // //   1,2,3
        //      (0,0)
        // //   4.5.6
        //       (1,1)
        // //   7.8.9
        //         (2,2)
        
       for(int i=0; i<row; i++)
	        {
	            for(int j=0; j<col; j++)
	            {
	               if(i==j)
	               {
	                   sum+=arr[i][j];
	               }
	            }
	            
	        }
	        return sum;
	    
     }
     
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of the row");
	     int row = sc.nextInt();
	      System.out.println("Enter the size of the column");
	        int col = sc.nextInt();
	         System.out.println("Enter metrix values : ");
	        
	        int [][] arr = new int [row][col];
	        for(int i=0; i<row; i++)
	        {
	            for(int j=0; j<col; j++)
	            {
	                arr[i][j] = sc.nextInt(); 
	            }
	        }
	    //output
	    System.out.println("Your entered metrix is : ");
	     for(int i=0; i<row; i++)
	        {
	            for(int j=0; j<col; j++)
	            {
	                System.out.print( arr[i][j] +" ");
	            }
	            System.out.println(" ");
	        }
	    
	 
	   System.out.println(DiagonalSumOfMetrix(arr,row,col));
	}
	    
	    
	   
	
}
