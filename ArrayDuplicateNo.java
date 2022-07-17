import java.util.*;

public class ArrayDuplicateNo{
    
static int dublicateNo(int array[]){// array=1,2,3,3,4
    
    //base condition
    if(array.length==0)//length=4
    return 0;
   
   for(int i=0; i<array.length-1; i++)//0<4
   {
       for(int j=i+1; j<array.length; j++) //1<4, 2<4
       {
           if(array[i]==array[j])//array[0]==array[1],1==2,,,,
           return array[i];//1
           
       }
   
 } return 0;
 }
     
   // Driver Function
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      
     int [] arr = new int[size];
     
     for(int i=0; i<size; i++)
     {
         arr[i] = sc.nextInt();
     }
       
      System.out.println(dublicateNo(arr));
    }
}