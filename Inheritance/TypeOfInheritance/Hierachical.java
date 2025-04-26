package Inheritance.TypeOfInheritance;
class Animal{
    void sleep(){
         System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal{

}
class monkey extends Animal{

}
class Deer extends Animal{

}
public class Hierachical {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
        
    }
    
}
