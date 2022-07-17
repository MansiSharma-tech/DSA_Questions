import java.util.*;

public class ReverseString{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        ReverseString obj = new ReverseString();
        
        System.out.println(obj.Rev(str));
    }
    
    public String Rev(String str){
        String result="";
        char ch;
        //str=mansi
        for(int i=0; i<str.length(); i++)//i=4;4>=0, 
        {
             ch = str.charAt(i); //ch=i
             result = ch+result;//result=i
        }
        return result;
    }
}