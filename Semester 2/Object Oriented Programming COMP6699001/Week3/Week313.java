// number 13
import java.text.BreakIterator;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Week313 {
    public static void main(String[] args) {
        double process0;
        double process1;
        double process2;
        double x1;
        double x2;

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);

        System.out.print("a: ");
        double a = num1.nextDouble();

        System.out.print("b: ");
        double b = num1.nextDouble();

        System.out.print("c: ");
        double c = num1.nextDouble();

        if (a == 0) {
            System.out.println("Number invalid!");
        }
        else {
            process0 = (Math.pow(b, 2)) - (4 * a * c);
            process1 = 0 - b + Math.sqrt(process0);
            process2 = 0 - b - Math.sqrt(process0);
            x1 = process1 / (2 * a);
            x2 = process2 / (2 * a);

            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("x1: " + df.format(x1));
            System.out.println("x2: " + df.format(x2));
        }
    }
}
