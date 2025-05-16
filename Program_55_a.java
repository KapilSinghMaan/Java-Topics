// Aggregation = Represents a "has-a" relationship between objects.
//               One object contains another object as part of its structure,
//               but the contained object/s can exist independently.

public class Program_55_a {
    public static void main(String[] args) {
        Program_55_c book1 = new Program_55_c("Mecbeth", 589);
        Program_55_c book2 = new Program_55_c("Pirates", 189);
        Program_55_c book3 = new Program_55_c("Tom and Jerry", 250);

        Program_55_c[] book = { book1, book2, book3 };
        Program_55_b library = new Program_55_b("The Jaat Library", 2003, book);
        library.display();
    }
}
