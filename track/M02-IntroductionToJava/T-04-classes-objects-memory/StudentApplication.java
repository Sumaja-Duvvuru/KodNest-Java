
class Student {

    int rollNo;
    String name;
    double height;

    void run() {
        System.out.println("Student is running");
    }

    void sleep() {
        System.out.println("Student is sleeping");
    }
}

class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 12;
        s1.name = "John";
        s1.height = 5.5;
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
    }
}
