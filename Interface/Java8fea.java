package Interface;
interface A{
    void show();
    default void config(){
        System.out.println("in config");
    }
    default void abc(){
        System.out.println("in abc");
    }

}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
}

public class Java8fea {
    public static void main(String[] args) {
        
        A obj = new B();
        obj.show();
        obj.config();
        
    }
    
}

