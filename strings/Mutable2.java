package strings;

public class Mutable2 {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder();
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());
        // sb.append("s");
        // System.out.println(sb.capacity());        //how many character you can add
        // System.out.println(sb.length());          //how many character are present

        // StringBuffer sb2 = new StringBuffer("Sachin");
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

