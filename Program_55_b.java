//Library Class

public class Program_55_b {
    String name;
    int year;
    Program_55_c[] books;

    Program_55_b(String name, int year, Program_55_c[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void display() {
        System.out.println("The " + this.year + " " + this.name);
        for (Program_55_c book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
