// printf() is a method used to format output

// % [flags] [width] [.precision] [specifier-character]

public class Program_12 {
    public static void main(String[] args) {

        // [specifier-character]

        String name = "Kapil Singh Maan";
        char firstChar = 'K';
        int age = 21;
        double height = 75.5;
        boolean inSchool = true;

        System.out.printf("Your name is %s\n", name);
        System.out.printf("First Character of your name is %c\n", firstChar);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Are you in school? %b\n", inSchool);

        System.out.printf("%s is %d years old\n", name, age);

        // [.precision]

        double value1 = 100.89;
        double value2 = 43249.9322;
        double value3 = -32.34;

        System.out.printf("%.3f\n", value1);
        System.out.printf("%.2f\n", value2);
        System.out.printf("%.1f\n", value3);

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        System.out.printf("% f\n", value1);
        System.out.printf("%,f\n", value2);
        System.out.printf("%(f\n", value3);

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
