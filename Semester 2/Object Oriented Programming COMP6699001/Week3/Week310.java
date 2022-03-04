// number 10
import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Week310 {
    public static void main(String[] args) {
        double mean;
        double variance;
        double standardDeviation;

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        
        System.out.print("First Number: ");
        double x1 = num1.nextDouble();

        System.out.print("Second Number: ");
        double x2 = num1.nextDouble();

        System.out.print("Third Number: ");
        double x3 = num1.nextDouble();

        mean = (x1 + x2 + x3) / 3;
        variance = (Math.pow((x1 - mean), 2) + Math.pow((x2 - mean), 2) + Math.pow((x3 - mean), 2)) / 3;
        standardDeviation = Math.sqrt(variance);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Mean: " + df.format(mean));
        System.out.println("Variance: " + df.format(variance));
        System.out.println("Standard Deviation: " + df.format(standardDeviation));
    }
}
