package Inheritance.Polymer_Abstraction;
class AeroPlane{
    public void takeOff(){
        System.out.println("AeroPlane is taking off");
    }
    public void fly(){
        System.out.println("AeroPlane is flying");
    }
}

class CargoPlane extends AeroPlane{
    public void takeOff(){
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly(){
        System.out.println("CargoPlane flies at lower height");
    }
}

class PassengerPlane extends AeroPlane{
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class LaunchPoly {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();

        PassengerPlane pp = new PassengerPlane();

        AeroPlane ref;
        ref = cp;
        
        ref.takeOff();
        ref.fly();

        System.out.println("                     ");
        ref = pp;

        ref.takeOff();
        ref.fly();

        //pp=cp;  //invalid
        
    }
    
}
