
class Developer {

    void work() {
        System.out.println("Developer is working");
    }

    void project() {
        System.out.println("Developer is doing a project");
    }
}

class JavaDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("Java Developer is working");
    }

    @Override
    void project() {
        System.out.println("Java Developer is doing a Java Project");
    }
}

class PythonDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("Python developer is working");
    }

    @Override
    void project() {
        System.out.println("Python Developer is doing a Python Project");
    }
}

public class RunTimePolymorphism {

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);
        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer dev) { //runtime polymorphism ,which parameter to be accepted is decided during runtime rather than compile time as method overloading
        dev.work();
        dev.project();
    }

}
