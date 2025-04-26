package Inheritance;
// final class Animal1
// {
//     void sleep()
//     {
//         System.out.println("Animal is sleeping");
//     }
// }
class Animal1{
    final void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}

class Tiger1 extends Animal1{
    // void sleep()    final method we cannot override in child class
    // {

    // }
}

public class FinalKey {
    public static void main(String[] args) {
        Tiger1 t = new Tiger1();
        t.sleep();
        
    }
    
}
