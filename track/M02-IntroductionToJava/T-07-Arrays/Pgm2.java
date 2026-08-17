
import java.util.Scanner;

public class Pgm2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
