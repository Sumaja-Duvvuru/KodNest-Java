
public class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append("Hello"));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" Welcome to Java programming language"));
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        System.out.println(sb.insert(6, "Welcome "));
        System.out.println(sb.delete(6, 13));
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
    }
}
