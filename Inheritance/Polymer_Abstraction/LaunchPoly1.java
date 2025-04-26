package Inheritance.Polymer_Abstraction;
class AeroPlane2
{
    public void takeOff(){
        System.out.println("AeroPlane is taking Off");
    }
    public void fly(){
        System.out.println("AeroPlane is flying");
    }
}
class Cargoplane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly(){
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane extends AeroPlane2{
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly(){
        System.out.println("Passengerplane flies at medium height");
    }
}
class FlightPlane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("FlighterPlane requires small size runway");
    }
    public void fly(){
        System.out.println("FlighterPlane flies at high height");
    }
}

class Airport{
    public void poly(AeroPlane2 ref)
    {
        ref.takeOff();
        ref.fly();

        System.out.println("_______________");
    }
}
public class LaunchPoly1 {
    public static void main(String[] args) {
        Cargoplane2 cp = new Cargoplane2();
        PassengerPlane pp = new PassengerPlane();
        FlightPlane2 fp = new FlightPlane2();

        Airport  a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
        
    }
    
}
