
class Parent {

    void disp1() {
        System.out.println("Parent class disp1 method");
    }

    void disp2() {
        System.out.println("Parent class disp2 method");
    }
}

class Child1 extends Parent {

    @Override
    void disp2() {
        System.out.println("Child class disp2 method overridden method");
    }

    void disp3() {
        System.out.println("Child class disp3 method specialized method");
    }

    class Child2 extends Parent {

        
            @override
        void disp2{
            System.out.println("Child 2 class overriding method");
        }

        void disp4() {
            System.out.println("Child 2 class disp4 method");
        }
    }
}

public class Downcasting {

    public static void main(String[] args) {
        Parent p = new Child1();
        p.disp1();
        p.disp2();
        if (p instanceof Child1) {
            ((Child) p).disp3();//downcasting
        } else if (p instanceof Child2) {
            ((Child2) p).disp4();
        } else {
            System.out.println("Cannot downcast");
        }

    }
}
