package Interface;
interface A{
    void show();
}
interface X{
    void abc();
}

class B implements A,X{
   public void show()
   {
    System.out.println("In show");
   }
   public void abc()
   {
    System.out.println("In abc");
   }
}

public class Demo1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        
        
        
        
    }
    
}
