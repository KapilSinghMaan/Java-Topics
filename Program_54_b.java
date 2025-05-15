// Car class

public class Program_54_b {

    private String model;
    private String color;
    private int price;

    Program_54_b(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price can't be 0 or less");
        } else {
            this.price = price;
        }
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    int getPrice() {
        return this.price;
    }
}
