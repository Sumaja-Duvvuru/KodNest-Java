
import java.util.Scanner;

class ArraySearch {

    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                System.out.println("Element found");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}

public class ElementFound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println("Enter an element: ");
        int element = sc.nextInt();
        ArraySearch as = new ArraySearch();
        as.search(arr, element);
    }
}
