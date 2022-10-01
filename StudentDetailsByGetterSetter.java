import java.util.*;

class StudentDetails
{
    private String name;
    private int marks;
    private int age;
    //set Method
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setMarks(int marks)
    {
        this.marks=marks;
    }
    
    public void setAge(int age)
    {
        this.age=age;
    }
    
     //getMethod
    public String getName()
    {
        return name;
    }
    
     public int getMarks()
    {
        return marks;
    }
     public int getAge()
    {
        return age;
    }
}

class StudentDetailsByGetterSetter
{
    public static void main (String[] args) 
    {
        StudentDetails obj = new StudentDetails();
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
        obj.setName(name);
        obj.setAge(age);
        obj.setMarks(marks);
        
        System.out.println("Details of the Student : ");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getMarks());
        
    }
}