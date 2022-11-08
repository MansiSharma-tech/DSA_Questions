import java.util.*;
public class SortThePeopleWithHeight
{
    public static String[] sortPeople(int height[], String name[]){
        //Hash Map declearaction
        
        Map<Integer, String> data= new HashMap<>();
        //storing values in hashmap
        for(int i=0; i<height.length; i++)
        {
            data.put(height[i],name[i]);
        }
        Arrays.sort(height);
        int index=0;
        
        String result[] = new String[height.length];
        for(int i=height.length-1; i>=0; i-- )
        {
            result[index]=data.get(height[i]);
            index++;
        }
        return result;
    } 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size of an array");
	    int size = sc.nextInt();      
	    int height[] = new int [size];
	     System.out.println("Enter heights of people : ");
	    for(int i=0; i<size; i++)
	    {
	        height[i]=sc.nextInt();
	    }
	    
	   String name[] = new String[size];
	    System.out.println("Enter name of people: ");
	   for(int i=0; i<size; i++)
	   {
	       name[i] = sc.next(); 
	   }
	String finalResult[] = sortPeople(height,name);
	    System.out.println("Sorted people in descending order are : ");
	for(int i=0; i<size; i++)
	{
	   System.out.println(finalResult[i]);
	}
	
	}
}
