// static = Modifies a variable or method belong to the class,
//               rather than to any specific object.
//               Commonly used for utility methods or shared resources.F

public class Program_45_a {
    String name;
    static int noOfFriends = 0;

    Program_45_a(String name) {
        this.name = name;
        noOfFriends++;
    }

    static void friends() {
        System.out.println("You have " + noOfFriends + " friends");
    }
}
