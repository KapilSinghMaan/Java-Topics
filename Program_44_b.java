public class Program_44_b {
    public static void main(String[] args) {

        // --------------- Way 1 ---------------

        // Program_44_a obj1 = new Program_44_a("Ford", "black");
        // Program_44_a obj2 = new Program_44_a("Swift", "red");
        // Program_44_a obj3 = new Program_44_a("Honda", "white");

        // Program_44_a[] obj = { obj1, obj2, obj3 };

        // ---------------- Way 2 ---------------

        Program_44_a[] obj = { new Program_44_a("Ford", "black"), new Program_44_a("Swift", "red"),
                new Program_44_a("Honda", "white") };

        for (Program_44_a ob : obj) {
            ob.drive();
        }
    }
}
