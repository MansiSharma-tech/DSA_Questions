public class CountArrayLength{
  public static void main(String[] args) {
      
   int count =0;
    int arr[] = {10, 20, 30, 40, 50};
      
    // display array length
    for(int i=0; i<arr.length; i++)
    {
        count++;
    }
    System.out.print("The length of the given array = ");
      System.out.println(count);
  }
}