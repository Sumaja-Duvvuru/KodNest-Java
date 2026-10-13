
class parent {

    parent() {
        System.out.println("parent 0-parameterized constructor");
    }
}

class child extends parent {

    child() {
        this(10);
        System.out.println("Inside child 0-parameterized constructor");
    }

    child(int a) {
        this(10, 20);
        System.out.println("Inside child 1-parameterized constructor");
    }

    child(int a, int b) {
        System.out.println("Inside child 2-parameterized constructor");
    }
}

public class LocalConstructorChaining {

    public static void main(String[] args) {
        child c1 = new child();
        child c2 = new child(10);
    }
}
