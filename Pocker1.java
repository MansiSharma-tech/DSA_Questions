import java.util.*;
public class Pocker1
{
     public static String Pocker(int [] arr1, char [] arr2){
    
           //base condition
           if(arr1.length==0||arr2.length==0)
           {
             return "Invalid Input";
           }
         
          if(arr2[0]==arr2[1]&&arr2[1]==arr2[2]&&arr2[2]==arr2[3]&&arr2[3]==arr2[4])
          {
              return "Flush";
          }
          else{
              //1 2 3 4 1
                //1 1 2 3 4
                 // 0 1 2 3 4 
                Arrays.sort(arr1);
            
               if(arr1[0]==arr1[1]&&arr2[1]==arr2[2]//(1==1||1==2),F
               ||arr2[1]==arr2[2]&&arr2[2]==arr2[3]//(1==2||2==3),f
               ||arr2[2]==arr2[3]&&arr2[3]==arr2[4])//(2==3||3==4),f
              {
                  return "3 of Kind";
              }
              
              if(arr1[0]==arr1[1]||arr2[1]==arr2[2]||arr2[2]==arr2[3]||arr2[3]==arr2[4])
              {
                  return "Pair";
              }

          }
          return "Hired Card";
         
     }
     
	public static void main(String[] args) {
	     System.out.println("Enter Array Interger Elements till index of 5  : ");
	       int [] arr1 = new int[5];
	    
	      char [] arr2= new char[5];
	    
	      
	    Scanner sc = new Scanner(System.in);
	  for(int  i=0; i<5; i++)
	  {
	   arr1[i] = sc.nextInt();
	  }
	    System.out.println("Enter Array Character Elements till index of 5  : ");
	    for(int  i=0; i<5; i++)
	    {
	       
	    arr2[i] = sc.next().charAt(0);
	    }
	    
	    
	    System.out.println(Pocker(arr1, arr2));
	}
	    
	    
	   
	
}
