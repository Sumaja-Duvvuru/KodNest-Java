
import java.util.Scanner;

class Frequency {

    int count = 0;

    void frequency(int a[], int key) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == key) {
                count++;
            }
        }
        System.out.println(key + " appeared " + count + " times");
    }

}

public class FrequencyOfElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30, 10, 40, 10};
        Frequency f = new Frequency();
        f.frequency(a, 10);
    }
}
