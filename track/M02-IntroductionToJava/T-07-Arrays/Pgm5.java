
import java.util.Scanner;

public class Pgm5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 Array Elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of elements of array a is : " + sum);

    }
}
