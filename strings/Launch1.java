
package strings;

public class Launch1 {
    public static void main(String[] args) {
        String brand = "pwskill";
        System.out.println(brand);
        brand.concat("Bengaluru");
        System.out.println(brand);                                      //Immutable String(non-changeble)

        StringBuilder brand1 = new StringBuilder("pwskill");
        System.out.println(brand);
        brand1.append("Bengaluru");
        System.out.println(brand1);                                     //Mutable String(changeble)
    }
    
}
