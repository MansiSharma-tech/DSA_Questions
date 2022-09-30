 class Main2
{
  void eat()
  {
      System.out.println("eat method of parent class");
  }
} 
 class Main1 extends Main2
  {
      void eat()
      {
      System.out.println("eat method of sub class");
      }
  }
public  class MethodOverriding{
  public static void main (String[]args)
  { System.out.println("Before Method overrinding ");
    Main2 m2 = new Main2();
    m2.eat();
    
    Main1 m1 = new Main1();
    m1.eat();
    System.out.println("After Method overrinding ");
    Main2 m1new = new Main1();
    m1new.eat();
    
  }
}


