package strings;

public class Palindrome{
    public static void main(String[] args) {
        String str1 = "MADAM";
        String str2 = "";
        for(int i=str1.length()-1;i>=0;i--){
            str2 = str2 + str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println("Given string is Palindrome");
        }
        else{
            System.out.println("Given string is not Palindrome");
        }
    }
}