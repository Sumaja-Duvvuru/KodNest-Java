
import java.util.Scanner;

public class Pgm4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Elements of array a");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
        int b[] = new int[a.length];
        int j = b.length - 1;
        for (int i = 0; i <= a.length - 1; i++) {
            b[j] = a[i];
            j--;
        }
        System.out.println("elements of array b (reverse order of a)");
        for (int i = 0; i < b.length - 1; i++) {
            System.out.println(b[i]);
        }
    }
}
