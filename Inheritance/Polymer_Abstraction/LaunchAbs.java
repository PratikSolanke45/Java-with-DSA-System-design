package Inheritance.Polymer_Abstraction;
 abstract class AeroPlane3{
    abstract public void takeOff();
    abstract public void fly();

    public void landing(){
        System.out.println("Aeroplane is landing");
    }
}

class Cargoplane extends AeroPlane3{
     public void takeOff(){
        System.out.println("CargoPlane requires longer runway");
     }
     public void fly(){
        System.out.println("Cargoplane flies at lower height");
     }
     public void alert(){
        System.out.println("Alert..");
     }
}

class PassengerPlane extends AeroPlane3{
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("PassengerPlane flies at medium height");
    }
}

public class LaunchAbs {
    public static void main(String[] args) {
        AeroPlane3 ref1 = new Cargoplane();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();

        // if(ref1 instanceof Cargoplane){
        // ((CargoPlane) ref1).alert();
        // }

        AeroPlane3 ref2 = new PassengerPlane();
        ref2.takeOff();
        ref2.fly();
        ref2.landing();
        
    }
    
}
