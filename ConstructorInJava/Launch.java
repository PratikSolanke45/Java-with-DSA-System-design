package ConstructorInJava;

class Student
{
    int age;
    String name;

    Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Launch {
    public static void main(String[] args) {
        Student obj = new Student("Rahul", 10);
        String name = obj.getName();
        System.out.println(name);

        int age = obj.getAge();
        System.out.println(age);

        
    }
    
}
