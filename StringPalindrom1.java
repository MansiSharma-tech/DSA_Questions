import java.util.*;
public class StringPalindrom1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringPalindrom obj = new StringPalindrom();
        System.out.println(obj.Palin(str));
    }
    
     public boolean Palin(String s){
         
         String temp=s, emptyStr="";//temp=mansi
         char result='\0';
         for(int i=0; i<s.length(); i++)//i=0, i=1,
         {
             result= s.charAt(i);//result=m,result=a,
             emptyStr=result+emptyStr;//emptyStr=am
             
         }
         if(temp.equals (emptyStr))
         return true;
         else
         return false;
     }
    
}