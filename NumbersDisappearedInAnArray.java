import java.util.*;

public class NumbersDisappearedInAnArray
{
    public List<Integer> findDisappearedNumbers(int [] arr, int size)
    {
      boolean arr1[] = new boolean[size];
      for(int i=0; i<size; i++)
      {
        arr1[arr[i]-1] = true;
      }
      List<Integer> list = new ArrayList<>();
      for(int i=0; i<size; i++)
      {
          if(arr1[i]==false)
          {
              list.add(i+1);
          }
      }
      return list;
    }
	public static void main(String[] args) {
	    
		System.out.println("Enter a size of an array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter a elements of an array : ");
		for(int i=0; i<size; i++)
		{
		    arr[i] = sc.nextInt();
		}
		System.out.println("Disappeared elements of an array : ");
		 NumbersDisappearedInAnArray obj = new NumbersDisappearedInAnArray();
		 System.out.println(obj.findDisappearedNumbers(arr,size));
		
	}
}
