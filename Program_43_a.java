// overloaded constructors = Allow a class to have multiple constructors
//                           with different parameter lists.
//                           Enable objects to be initialized in various ways.

public class Program_43_a {

    String username;
    String email;
    int age;

    Program_43_a() {
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    Program_43_a(String username) {
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    Program_43_a(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    Program_43_a(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
