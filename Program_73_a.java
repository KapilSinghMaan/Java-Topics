// Alarm clock in java

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Program_73_a {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime=null;
        String filePath="music.wav";
        while(alarmTime==null)
        {
            try
            {
                System.out.print("Enter time to set for Alarm (HH:MM:SS): ");
                String time=scanner.nextLine();
                alarmTime=LocalTime.parse(time,formatter);
            }
            catch(DateTimeParseException e)
            {
                System.out.println("Wrong alarm time format!!");
            }
        }
        System.out.println("Alarm Set for "+alarmTime);
        Program_73_b alarm=new Program_73_b(alarmTime,filePath,scanner);
        Thread thread=new Thread(alarm);
        thread.start();
    }
}
