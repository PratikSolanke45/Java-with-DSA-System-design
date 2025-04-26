package Inheritance;
class Demo1 {
    int a, b;

    public Demo1() {
        System.out.println("Parent class constructor");
    }

    public Demo1(int x, int y) {
        System.out.println("Parameterized Parent class constructor");
        a = x;
        b = y;
    }
}

class Demo2 extends Demo1 {
    int m, n;

    public Demo2() {
        super(10, 20);  // Calls the parameterized constructor in the same class
        System.out.println("Child class constructor");
    }

    public Demo2(int x, int y) {
        this();  // ✅ Call the parent parameterized constructor
        System.out.println("Parameterized child class constructor");
        m = x;
        n = y;
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        Demo2 d = new Demo2(3, 4);  // This calls the parameterized constructor of Demo2
    }
}
