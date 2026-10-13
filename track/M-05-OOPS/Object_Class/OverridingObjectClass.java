
class Student {

    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.roll == s.roll && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }
}

public class OverridingObjectClass {

    public static void main(String[] args) {
        Student s1 = new Student(11, "John");
        Student s2 = new Student(12, "Smith");
        Student s3 = new Student(11, "John");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
