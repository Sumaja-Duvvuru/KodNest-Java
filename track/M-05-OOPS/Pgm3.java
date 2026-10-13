
class Parent {

    void disp1() {
        System.out.println("Parent class disp1 method");
    }

    void disp2() {
        System.out.println("Parent class disp2 method");
    }
}

class Child extends Parent {

    @Override
    void disp2() {
        System.out.println("Child class disp2 method");
    }

    void disp3() {
        System.out.println("Child class disp3 method");
    }
}

public class Pgm3 {

    public static void main(String args[]) {
        Child c = new Child();
        c.disp1();
        c.disp2();
        c.disp3();
    }
}
