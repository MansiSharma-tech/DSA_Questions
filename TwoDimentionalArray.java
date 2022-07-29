import java.util.*;
public class TwoDimentionalArray


{
    public static void TwoDArray(int [][] arr2, int row, int col) 
    {
        for(int i=0; i<row; i++)
	    {
	        for(int j=0; j<col; j++)
	        {
	            System.out.print(arr2[i][j]+" ");
	        }
	        System.out.println(" ");
	    }
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of row");
	    int row = sc.nextInt();
	     System.out.print("Enter the size of Column");
	    int col = sc.nextInt();
	    
	     System.out.print("Enter array elements");
	    
	    int [][] arr1 = new int[row][col];
	    for(int i=0; i<row; i++)
	    {
	        for(int j=0; j<col; j++)
	        {
	            arr1[i][j]= sc.nextInt();
	        }
	        
	    }
	     System.out.println("Result of entered elements");
		TwoDArray(arr1,row,col);
	}
}
