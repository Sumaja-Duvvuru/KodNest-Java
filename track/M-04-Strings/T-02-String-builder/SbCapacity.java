
public class SbCapacity {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringBuilder sb1 = sb.append(" Programming");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

    }
}
