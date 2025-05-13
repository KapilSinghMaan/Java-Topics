// Car class

public class Program_49_b {
    String name;
    String model;
    int year;
    String color;

    Program_49_b(String name, String model, int year, String color) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.name + " " + this.model + " " + this.year + " " + this.color;
    }
}
