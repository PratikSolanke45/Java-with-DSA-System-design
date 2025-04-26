package Interface;
// interface Car{
//     void drive();
// }

// public class LambdaExp {
//     public static void main(String[] args) {
//         Car obj = () -> System.out.println("Driving...");
//         obj.drive();
//     }
    
// }
// interface Car{
//     void drive(int avg);
// }
// public interface LambdaExp {
//     public static void main(String[] args) {
//         Car obj = (int avg) -> System.out.println("Driving...");

//         obj.drive(16);
        
//     }
// }

interface Car{
    void drive(int avg, int ts);
}
public class LambdaExp{
    public static void main(String[] args) {
        Car obj = (int avg, int ts) -> System.out.println("Driving...");

        obj.drive(16, 40);
    }
}