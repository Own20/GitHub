import java.util.Scanner;
import java.util.ArrayList;;

public class TestMain {
    public static void main(String[] args) {
        boolean a = true;
        while(a) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter your name: ");
		    String inputName = scan.nextLine();

            System.out.print("Enter index: ");
		    int ind = scan.nextInt();

            TestArrayList test = new TestArrayList(ind);
            test.addCustomer(inputName);

            for(int i = 0; i < test.getNumOfCustomers(); i++) {
                System.out.println(test.getCustomer(i));
                System.out.println(test.getNumOfCustomers());
            }
        }
    }
}
