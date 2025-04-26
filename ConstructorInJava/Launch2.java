package ConstructorInJava;                         //Constructor Overloading
class Student{
private int age;
private String name;

public Student(){
    System.out.println("Default constructor is called : ");
    name = "Rohit";
    age = 18;
}
public Student(String name){
    this.name = name;
    age = 19;
}
public Student(String name,int age){
    this.name = name;
    this.age = age;
}
public void show(){
    System.out.println(name + " " + age);
}
}

public class Launch2 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.show();
        Student obj2 = new Student("Rahul");
        obj2.show();
        Student obj3 = new Student("Rohit",19);
        obj3.show();
        
        
    }
    
}
