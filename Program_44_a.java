// Array of Objects

public class Program_44_a {

    String modelName;
    String color;

    Program_44_a(String modelName, String color) {
        this.modelName = modelName;
        this.color = color;
    }

    void drive() {
        System.out.println("You are driving " + this.color + " " + this.modelName);
    }
}
