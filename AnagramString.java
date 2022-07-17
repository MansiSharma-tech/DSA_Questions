import java.util.*;

public class AnagramString{
    
static boolean anagram(String s1, String s2){
     //converting string to char array
    char [] arr1 = s1.toCharArray();
    char [] arr2 = s2.toCharArray();
    
    Arrays.sort(arr1);
     Arrays.sort(arr2);
    
    
    //Corner case 
 
 if(arr1.length!=arr2.length)
     return false;

        
    //logic
    for(int i=0; i<arr1.length; i++)
    {
        if(arr1[i]!=arr2[i])
        return false;
    }
    
    return true;
    
       
    }
     
   // Driver Function
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
       
      System.out.println(anagram(str1,str2));
    }
}