
class Student {

    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class StudentApp1 {

    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 5.5);
        s1.display();
    }
}
