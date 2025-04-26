package strings;

public class Mutable3 {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());
        // sb.append("s");
        // System.out.println(sb.length());


        // StringBuilder sb2 = new StringBuilder("Sachin");
        // System.out.println(sb2);
        // System.out.println(sb2.capacity());
        // System.out.println(sb2.charAt(1));
        // sb2.setCharAt(1,'A');
        // System.out.println(sb2);


        StringBuilder sb = new StringBuilder(150);
        System.out.println(sb.capacity());
        sb.append("java");
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb.capacity());

    }
    
}
