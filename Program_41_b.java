// Object = An entity that holds data (attributes)
//                and can perform actions (methods)
//                It is a reference data type

public class Program_41_b {
    public static void main(String[] args) {


        Program_41_a obj = new Program_41_a();

        System.out.println(obj.make);
        System.out.println(obj.model);
        System.out.println(obj.year);
        System.out.println(obj.price);
        System.out.println(obj.isRunning);

        obj.drive();
        obj.brake();
    }
}
