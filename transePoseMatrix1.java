import java.util.*;

public class transePoseMatrix1
{
    public static void transePose(int row, int col, int arr [][])
    {
        //base case
        if(row==0&&col==0)
        System.out.println("Enter valid input");
       
       System.out.println("Before transepose");
        for(int i=0; i<row; i++)
	   {
	       for(int j=0; j<col; j++)
	       {
	          System.out.print(arr[i][j]+" ");
	       }
	       System.out.println(" ");
	   }
    
    System.out.println("After transepose");
        for(int i=0;i<col;i++)
        {
            for(int j=0; j<row; j++)
            {
                // int temp = arr[row][col];
                // arr[row][col]=arr[col][row];
                // arr[col][row]=temp;
                   
                System.out.print(arr[j][i]+" ");
                
            }
            System.out.println(" ");
    //         }
    //     for(int i=0; i<row; i++)
	   //{
	   //    for(int j=0; j<col; j++)
	   //    {
	   //        System.out.println(arr[row][col]);
	   //    }
	       
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
	    rotateArray(row,col,arr);
	}
}
