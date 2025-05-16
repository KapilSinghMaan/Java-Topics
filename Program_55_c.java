// Books class

public class Program_55_c {

    String name;
    int pages;

    Program_55_c(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    String displayInfo() {
        return this.name + " (" + this.pages + " pages)";
    }
}
