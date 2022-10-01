import java.util.*;

class StudentDetails{
public void sDetails()
    { 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter name : ");
       String name = sc.next();
       System.out.println("Enter age : ");
       int age = sc.nextInt();
    }
}

class StudentResult extends StudentDetails
{
    public void sResult()
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Makrs :");
        int marks = sc.nextInt();
        System.out.println("Student Details : ");
        if(marks>=60)
        System.out.println("Pass");
        else
        System.out.println("Fail");
    }
}

class SingleLevelInheritance
{
    public static void main(String args[])
    {
        StudentResult sr = new StudentResult();
        sr.sDetails();
        sr.sResult();
    }
}