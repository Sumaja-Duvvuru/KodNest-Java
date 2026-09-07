
import java.util.Scanner;

public class GreaterThanAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            //a[i] = sc.nextInt();
            sum += a[i];
        }
        double avg = (double) sum / a.length;
        for (int i : a) {
            if (i > avg) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
