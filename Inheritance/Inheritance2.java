package Inheritance;
class Human{
    private String name;
    int age;

    Human()
    {
        System.out.println("Human class constructor");
    }

    void sleep()
    {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }

}

class Student1 extends Human{
    //public Student()
    //{
    //super();
    //}

    void disp()
    {
        System.out.println("The age is : " + age);
        System.out.println("The Name is : + name");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.sleep();
        st1.disp();
        
    }
    
}
