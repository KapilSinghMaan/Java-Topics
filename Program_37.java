// 2D array = An array where each element is an array
//                    Useful for storing a matrix of data

public class Program_37 {
    public static void main(String[] args) {

        // ---------Example 1----------

        // String[][] foods = { { "apple", "banana", "orange" },
        // { "carrot", "patato", "peas" },
        // { "chips", "toffee", "chocolate", "ice cream" } };

        // for (String[] food : foods) {
        // for (String eat : food) {
        // System.out.print(eat+" ");
        // }
        // System.out.println();
        // }

        // ----------Example 2-------------

        char telephone[][] = { { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' } };

        for (char[] number : telephone) {
            for (char num : number) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }
    }
}
