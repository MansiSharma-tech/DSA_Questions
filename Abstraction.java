import java.util.*;

abstract class Car
{ 
    String carModel;
    int carPrice;
    String carType;
    
    abstract int calculateInsurance();
   
}
class Manual extends Car
{
     int calculateInsurance()
    {
        int carPrice=400000;
        int result = carPrice/10;
        return result;
        
    }
}

class Automate extends Car
{
      int calculateInsurance()
    {
        int carPrice=30000;
        int result = carPrice/5;
        return result;
        
    }
}

class Abstraction{
public static void main (String[] args) {
    Car c = new Manual();
    Car c1 = new Automate();
    System.out.println("Manual Car "+c.calculateInsurance());
    System.out.println("Automate Car "+c1.calculateInsurance());
   
}
}