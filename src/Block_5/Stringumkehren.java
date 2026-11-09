package Block_5;

public class Stringumkehren {
    static void main() {
        System.out.println(reverseString("Anna"));
        System.out.println(ispalindrom("An n a"));
    }

    public static String reverseString(String str, String rev) {
        if (str.isEmpty()) {
            return rev;
        }   else return reverseString(str.substring(0,str.length() - 1), rev.concat(str.substring(str.length()-1)));
    }
    public static String reverseString(String str) {
        String rev = "";
        if (str.isEmpty()) {
            return rev;
        }   else return reverseString(str.substring(0,str.length() - 1), rev.concat(str.substring(str.length()-1)));
    }
    public static boolean ispalindrom(String str) {
        if(str.replaceAll(" ","").equalsIgnoreCase(reverseString(str).replaceAll(" ",""))) return true;
        else return false;

    }
}
