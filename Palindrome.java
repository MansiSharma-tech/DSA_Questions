import java.util.*;
 
class Palindrome{
 
  static boolean checkPalindrome(int n)
  {
    int reverse = 0;
    int temp = n;
    while (temp != 0) {
      reverse = (reverse * 10) + (temp % 10);
      temp = temp / 10;
    }
    return (reverse == n); // if it is true then it will return 1;
    // else if false it will return 0;
  }
 
  // Driver Code
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      
    int n = sc.nextInt();
    if (checkPalindrome(n) == true) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}