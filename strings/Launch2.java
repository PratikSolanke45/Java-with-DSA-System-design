package strings;

public class Launch2 {
    public static void main(String[] args) {
        // String s1 = "pwskill";
        // String s2 = "pwskill";
        // String s3 = "pwJAVA";

        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));



        String s1 = "pwskill";
        String s2 = new String("pwskill");
        String s3 = new String("pwskill");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
    }
    
}
