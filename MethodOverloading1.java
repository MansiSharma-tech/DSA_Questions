import java.io.*;
  
class Square {
  

    void Area(double side)
    {
        System.out.println("Area of the Square: "
                           + side * side);
    }
  
   
    void Area(float side)
    {
        System.out.println("Area of the Square: "
                           + side * side);
    }
}
  
class MethodOverloading1{
  
   
    public static void main(String[] args)
    {
  
        Square obj = new Square();
  
       
        obj.Area(10);
        obj.Area(3.2);
    }
}