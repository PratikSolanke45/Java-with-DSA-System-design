package Inheritance.TypeOfMethods;
class AeroPlane{
    public void takeOff(){
        System.out.println("AeroPlane is taking off");
    }
    public void fly(){
        System.out.println("AeroPlane is flying");
    }
}
 
class CargoPlane extends AeroPlane{
    public void fly(){
        System.out.println("CargoPlane is flying");

    }
    public void CarryGoods(){
        System.out.println("CargoPlane carries goods");
    }
}

class PassengerPlane extends AeroPlane{
    public void fly(){
        System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger(){
        System.out.println("PassengerPlane carries passenger");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        AeroPlane cp =  new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp =  new PassengerPlane();
        pp.takeOff();
        pp.fly();
        
    }
    
}
