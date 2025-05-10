// constructor = A special method to initialize objects
//                         You can pass arguments to a constructor
//                         and set up initial values


public class Program_42_a {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Program_42_a(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study() {
        System.out.println(this.name + " is " + this.age + " years old.");
    }
}
