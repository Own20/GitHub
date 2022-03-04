// number 12

public class Week312 {
    public static void main(String[] args) {
        System.out.println("number\tsquare\tcube");
        for (int i = 0; i < 11; i++) {
            System.out.print("   " + i);
            int square = i * i;
            System.out.print("\t" + square);
            int cube = i * i * i;
            System.out.println("\t" + cube);
        }
    }
}
