import java.util.*;
class Name {
 
    private int age; // Private is using to hide the data//20
 
    public int getAge() { return age; } // getter
 
    public void setAge(int age)
    {
        this.age = age;//20
    } // setter
}
 
class GetSetUse {
    public static void main(String[] args)
    {
 
        Name n1 = new Name();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        n1.setAge(age);
 
        System.out.println("The age of the person is: "
                           + n1.getAge());
    }
}