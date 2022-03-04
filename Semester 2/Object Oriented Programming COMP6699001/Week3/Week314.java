// number 14
import java.util.Scanner;

public class Week314 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Input Total Seconds: ");
        int sec = num.nextInt();

        int totalHours = sec / 60;
        int totalMinutes = totalHours % 60;
        int totalSeconds = sec % 60;
        
        totalHours = totalHours / 60;

        if (totalHours == 1 && totalMinutes == 1 && totalSeconds == 1) {
            System.out.println(totalHours + " hour " + totalMinutes + " minute " + totalSeconds + " second ");
        } else if (totalHours == 1 && totalMinutes == 1) {
            System.out.println(totalHours + " hour " + totalMinutes + " minute " + totalSeconds + " seconds ");
        } else if (totalHours == 1 && totalSeconds == 1) {
            System.out.println(totalHours + " hour " + totalMinutes + " minutes " + totalSeconds + " second ");
        } else if (totalMinutes == 1 && totalSeconds == 1) {
            System.out.println(totalHours + " hours " + totalMinutes + " minute " + totalSeconds + " second ");
        } else if (totalHours == 1) {
            System.out.println(totalHours + " hour " + totalMinutes + " minutes " + totalSeconds + " seconds ");
        } else if (totalMinutes == 1) {
            System.out.println(totalHours + " hours " + totalMinutes + " minute " + totalSeconds + " seconds ");
        } else if (totalSeconds == 1) {
            System.out.println(totalHours + " hours " + totalMinutes + " minutes " + totalSeconds + " second ");
        } else {
            System.out.println(totalHours + " hours " + totalMinutes + " minutes " + totalSeconds + " seconds ");
        }
    }
}
