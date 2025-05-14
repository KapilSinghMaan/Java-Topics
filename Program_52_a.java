// Polymorphism = "POLY-" = "MANY"
//               "-MORPH" = "SHAPE"
//                Objects can identify as other objects.
//                Objects can be treated as objects of a common superclass.

public class Program_52_a {
    public static void main(String[] args) {

        Program_52_c bike = new Program_52_c();
        Program_52_d car = new Program_52_d();
        Program_52_e boat = new Program_52_e();

        bike.go();
        car.go();
        boat.go();

        System.out.println();

        Program_52_b[] vechiles = { bike, car, boat };

        for (Program_52_b vechile : vechiles) {
            vechile.go();
        }
    }

}
