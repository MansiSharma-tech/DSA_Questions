import java.util.*;

public class Main
{
    public static boolean checkDuplicateInt(int arr[])
    {
        if(arr.length==0)
       return false;
       
     HashSet<Integer> h=new HashSet<Integer>();//iska mtlb btao
        for(int i=0;i<arr.length;i++)
        {   
            if(h.contains(arr[i]))
                return true;
            h.add(arr[i]);
        }
        
        return false;
        
       
        
        
    }
	public static void main(String[] args) {
		System.out.println("Enter a size of an array :  ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter a elements of an array :  ");
		for(int i=0 ; i<size; i++)
		{
		    arr[i] = sc.nextInt();
		}
	
		System.out.println(checkDuplicateInt(arr));
	}
}
