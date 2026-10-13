
class Pgm1 {

    final double PI = 3.14;

    final void display1() {
        System.out.println("Final method can't be overridden");
    }

    void display2() {
        System.out.println("Not a final method in Parent class");
    }
}

class Pgm2 extends Pgm1 {

    void display2() {
        System.out.println("Overriding method display2 in child class");
    }

}

final class Pgm3 {

    void disp() {
        System.out.println("Final class can't be extended");
    }
}

public class FinalKeyword {

    public static void main(String[] args) {
        Pgm1 p = new Pgm2();
        p.display1();
        p.display2();
        System.out.println("Value of PI = " + p.PI);
        Pgm3 p3 = new Pgm3();
        p3.disp();
    }
}
