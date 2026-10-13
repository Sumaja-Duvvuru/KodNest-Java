
class Student {

    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class Pgm1 {

    public static void main(String[] args) {
        Student s1 = new Student(11, "John");
        Student s2 = new Student(12, "Doe");
        Student s3 = new Student(11, "John");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


    ////overriding equals method by string class
        
    }
}
