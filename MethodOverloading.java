public class MethodOverloading
{
  static void add (int a, int b)
  {
    System.out.println (a + b);
  }
  static void add (int a, int b, int c)
  {
    System.out.println (a + b + c);
  }

  static void add (double a, double b)
  {
    System.out.println(a+b);
  }
  public static void main (String[]args)
  {
    
    add (2, 4);
    add (2, 4, 6);
    add(1.2, 3.6);
  }
}
