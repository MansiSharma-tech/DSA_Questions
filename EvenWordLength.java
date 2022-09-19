import java.util.*;
class EvenWordLength {
 public static void printWords(String s)
 {
 
  for (String word : s.split(" "))
 
   if (word.length() % 2 == 0)
    System.out.println(word);
 }
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printWords(str);
		
	}
}
