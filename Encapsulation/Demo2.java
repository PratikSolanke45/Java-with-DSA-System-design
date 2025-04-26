package Encapsulation;
class Student {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show()
    {
        System.out.println(name + " " + age);
    }

    
}




public class Demo2 {
    public static void main(String[] args){
        Student obj = new Student();
        Student obj2 = new Student();
        obj.setAge(18);
        obj2.setAge(25);
        obj.setName("Navin");
        obj.setName("Kiran");
        int stud1Age = obj.getAge();
        System.out.println(stud1Age);

    }

}
