// Fish class (child of both parents)
public class Program_51_f implements Program_51_b, Program_51_c {

    @Override
    public void flee() {
        System.out.println("The fish is swiming away");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }

}
