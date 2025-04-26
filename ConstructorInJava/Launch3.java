package ConstructorInJava;
class Student1
{
    private String name;
    private int age;
    
    public Student1()
    {
        this("Rohit",19);
        System.out.println("Default constructor is calles");
        name = "Rohan";
        age = 18;
    }
    public Student1(String name)
    {
        this();
        this.name = name;
        age = 19;
    }
    public Student1(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void show()
    {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Launch3 {
    public static void main(String[] args) {
        Student1 obj1 = new Student1();
        obj1.show();
        Student1 obj2 = new Student1("Rahul");
        obj2.show();
        
    }
    
}
