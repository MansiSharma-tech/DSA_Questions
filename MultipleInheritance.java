
// Java program to demonstrate working of
// interface
  
import java.io.*;
  interface newInterface{
      int a1=20;
      void show();
      //void notShow();
  }
// A simple interface
interface In1 {
    

    // public, static and final
    final int a = 10;
  
    // public and abstract
    void display();
}
  
// A class that implements the interface.
class MultipleInheritance implements In1,newInterface {
    
    // Implementing the capabilities of
    // interface.
    public void display(){ 
      System.out.println("Display method"); 
    }
    public void show()
     {
        System.out.println("show method"); 
    } 
     
  
    // Driver Code
    public static void main(String[] args)
    {
        //In interface we only creates an object of main class(not other interface(like super or sub interface))
        MultipleInheritance t = new MultipleInheritance();
        t.display();
        t. show();
        System.out.println(a);
        System.out.println(a1);
    }
}