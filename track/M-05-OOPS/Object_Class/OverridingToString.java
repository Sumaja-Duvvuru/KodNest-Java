
class Student {

    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.roll + " " + this.name;
    }
}

public class OverridingToString {

    public static void main(String[] args) {
        Student s1 = new Student(11, "John");
        Student s2 = new Student(12, "Smith");
        Student s3 = new Student(13, "Doe");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
