import java.util.*;
 
class AdditionOfTwoMatrix1{
 
    // Function to print Matrix
    static void printMatrix(int M[][],
                            int rowSize,
                            int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
 
            System.out.println();
        }
    }
 
    // Function to add the two matrices
    // and store in matrix C
    static int[][] add(int A[][], int B[][],
                       int size)
    {
        int i, j;
        int C[][] = new int[size][size];
 
        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];
 
        return C;
    }
 
    // Driver code
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of the row");
	     int size = sc.nextInt();
	    
	        int [][] arr = new int [size][size];
	        for(int i=0; i<size; i++)
	        {
	            for(int j=0; j<size; j++)
	            {
	                arr[i][j] = sc.nextInt(); 
	            }
	        }
	    
	        
	        int [][] arr1 = new int [size][size];
	        for(int i=0; i<size; i++)
	        {
	            for(int j=0; j<size; j++)
	            {
	                arr1[i][j] = sc.nextInt(); 
	            }
	        }
        // Print the matrices A
        System.out.println("\nMatrix A:");
        printMatrix(arr,size,size);
 
      
        System.out.println("\nMatrix B:");
        printMatrix(arr1, size,size);
 
        // Add the two matrices
        int C[][] = add(arr,arr1,size);
 
        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, size, size);
    }
}