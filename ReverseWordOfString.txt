import java.util.*;
import java.util.regex.Pattern;
public class ReverseWordOfString{
    
public static void main (String args [])
{
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
   
    System.out.println( reverseWords(str));
    
    
}
static String reverseWords(String shiv)
    {
  
        // Specifying the pattern to be searched'
        Pattern pattern = Pattern.compile("\\s");
  
        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        //  is whitespace and store in temp array.
        String[] temp = pattern.split(shiv);
        String result = "";
  
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }

}