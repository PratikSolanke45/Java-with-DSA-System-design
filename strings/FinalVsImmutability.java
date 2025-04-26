package strings;

import javax.sql.rowset.spi.SyncResolver;

public class FinalVsImmutability {
    public static void main(String[] args) {
        
    
     StringBuffer sb = new StringBuffer("Virat");
    sb.append("kohli");
    // System.out.println(sb);
    sb = new StringBuffer("Sachin");
    System.out.println(sb);

    
}
}
