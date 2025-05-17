public class Program_56_b {

    String model;
    int year;
    Program_56_c engine;

    Program_56_b(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Program_56_c(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println("The " + this.model + " is running");
    }
}