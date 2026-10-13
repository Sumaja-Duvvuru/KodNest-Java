
class parent {

    parent() {
        System.out.println("inside parent 0-parameterized constructor");
    }

    parent(int a) {
        System.out.println("parent 1-parameterized constructor");
    }
}

class child extends parent {

    child() {
        System.out.println("inside child 0-parameterized constructor");
    }

    child(int a) {
        super(a);
        System.out.println("inside child 1-parameterized constructor");
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {
        child c = new child(10);
        child c2 = new child();
    }
}
