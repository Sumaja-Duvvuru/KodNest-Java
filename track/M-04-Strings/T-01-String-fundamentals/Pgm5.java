
public class Pgm5 {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Programming";
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println();
        System.out.println(s1.concat(s2));
        String s4 = new String("Java ");
        String s5 = new String("Programming");
        String res = s4.concat(s5);
        System.out.println();
        System.out.println(res);
    }
}
