
class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Anu";
        age = 20;
        height = 5.5;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("John");
        Student s3 = new Student("Akash", 20, 5.5);

        s1.display();
        s2.display();
        s3.display();
    }
}
