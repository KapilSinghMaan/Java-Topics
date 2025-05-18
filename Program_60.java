// How to write a file using Java (4 popular options)

// FileWriter = Good for small or medium-sized text files
// BufferedWriter = Better performance for large amounts of text
// PrintWriter = Best for structured data, like reports or logs
// FileOutputStream = Best for binary files (e.g., images, audio files)

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Program_60 {
    public static void main(String[] args) {
        String filePath = "poem.txt";
        String text = """
                Roses are red
                Violets are blue
                My Laptop is Lenovo
                What is yours?""";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
            System.out.println("File written successfully!!!");
        } catch (FileNotFoundException e) {
            System.out.println("File location doesn't found");
        } catch (IOException e) {
            System.out.println("Couldn't write file");
        }
    }
}
