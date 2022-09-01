import java.util.*;

public class RotateMatrix
{
    
    
    public static void transpose(int [][]arr){
        
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<i;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
           }
       } 
        
    }
      public static void reverse(int [][]arr){
       
       for(int r=0;r<arr.length;r++){
           int l=0,right=arr.length-1;
          while(l<right){
             int temp=arr[r][l];
              arr[r][l]=arr[r][right];
              arr[r][right]=temp;
              l++;
              right--;
              
          } 
           
       }
      }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the size of the row");
	    int row= sc.nextInt();
		System.out.println("Enter the size of the cooumn");
	    int col= sc.nextInt();
	    
	    int [][]arr = new int[row][col];
	   for(int i=0; i<row; i++)
	   {
	       for(int j=0; j<col; j++)
	       {
	           arr[i][j] = sc.nextInt();
	       }
	       
	   }
	   transpose(arr);
	   
	    reverse(arr);
	    System.out.println("Rotate matrix is : ");
	    for(int i=0; i<row; i++)
	    {
	        for(int j=0; j<col; j++)
	        {
	            System.out.print(arr[i][j]);
	        }
	        System.out.println(" ");
	    }
	    
	}
	
      
}
