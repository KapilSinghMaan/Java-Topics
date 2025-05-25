// Alarm clock in java

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Program_73_b implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    Program_73_b(LocalTime alarmTime, String filePath,Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner=scanner;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                LocalTime now = LocalTime.now();
                Thread.sleep(1000);
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!!");
            }
        }
        System.out.println("\nWake up!!!");
        ringAlarm(filePath);
    }
    private void ringAlarm(String filePath)
    {
        File audioFile=new File(filePath);

        try(AudioInputStream audioStream=AudioSystem.getAudioInputStream(audioFile))
        {
            Clip clip=AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Press *Enter* to stop alarm");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        }
        catch(UnsupportedAudioFileException e)
        {
            System.out.println("Audio format is not acceptable");
        }
        catch(LineUnavailableException e)
        {
            System.out.println("No audio");
        }
        catch(IOException e)
        {
            System.out.println("Error loading audio");
        }
    }
}
