package Interface;
interface Computer{
    void compilecode();
}

class Laptop implements Computer{
    public void compilecode(){
        System.out.println("you got 5 errors");
    }
}
class Desktop implements Computer{
    public void compilecode(){
        System.out.println("you got 5 errors,faster");
    }
}
class Developer{
    public void buildApp(Computer obj){
        System.out.println("Building App");
        obj.compilecode();
    }
     
    public class Main{
        public static void main(String[] args) {
            // Laptop obj = new Laptop();
            Computer obj = new Laptop();

            Developer dev = new Developer();
            dev.buildApp(obj);
        }
    }
    }
