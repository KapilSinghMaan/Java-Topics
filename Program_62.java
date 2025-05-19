// Music Player Using Java
// How to PLAY AUDIO with Java (.wav, .au, .aiff)

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.*;

// import javax.sound.sampled.AudioInputStream;
// import javax.sound.sampled.AudioSystem;
// import javax.sound.sampled.UnsupportedAudioFileException;

public class Program_62 {
    public static void main(String[] args) {
        String filePath = "music.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String choice = "";
            while (!choice.equals("Q")) {
                System.out.println("P - Play");
                System.out.println("S - Stop");
                System.out.println("R - Reset");
                System.out.println("Q - Quit");
                System.out.print("Enter your choice: ");
                choice = scanner.next().toUpperCase();

                switch (choice) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Wrong Choice!!!");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audion file is not supported");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Byeeee");
        }
    }
}
