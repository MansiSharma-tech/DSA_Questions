import java.util.*;
public class ThreeDArrays


{
    public static void ThreeDArray(int [][][] arr2, int row, int col, int third) 
    {
        for(int i=0; i<row; i++)
	    {
	        for(int j=0; j<col; j++)
	        {
	             for(int k=0; k<third; k++){
	            System.out.print(arr2[i][j][k]+" ");
	             }
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
	     System.out.print("Enter the size of 3rd element");
	    int third = sc.nextInt();
	    
	     System.out.print("Enter array elements");
	    
	    int [][][] arr1 = new int[row][col][third];
	    for(int i=0; i<row; i++)
	    {
	        for(int j=0; j<col; j++)
	        {
	            for(int k=0; k<third; k++){
	            arr1[i][j][k]= sc.nextInt();
	            }
	        }
	        
	    }
	     System.out.println("Result of entered elements");
		ThreeDArray(arr1,row,col,third);
	}
}
