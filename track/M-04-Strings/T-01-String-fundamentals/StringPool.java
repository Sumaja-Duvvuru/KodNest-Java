
public class StringPool {

    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "JAvA";
        if (s1 == s2) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }
}
