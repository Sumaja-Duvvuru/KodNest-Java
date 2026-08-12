
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(int a, double b, int c) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(10, 3.5));
        System.out.println(a.add(1, 2));
        System.out.println(a.add(2, 3.5, 5));
        System.out.println(a.add(2.5, 4.0));
        System.out.println(a.add(2.5, 3));
        System.out.println(a.add(1, 2, 3));
        System.out.println(a.add(2.5, 5.7));
    }
}
