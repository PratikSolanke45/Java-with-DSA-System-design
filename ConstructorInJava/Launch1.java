package ConstructorInJava;
class Demo{
    private int a;
    private int b;

    //public Demo()
    // {

    // }
    public Demo(int a ,int b)
    {
       this.a=a;      
       this.b=b;
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Launch1 {
    public static void main(String[] args) {
        Demo d = new Demo(0,0);
        d.disp();

        Demo d2 = new Demo(10, 20);
        d2.disp();
        
    }
    
}
