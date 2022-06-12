import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> customer = new ArrayList<String>();

        while(true) {
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Enter your name: ");
		    String inputName = scan.nextLine();

            customer.add(inputName);

            for(int i = 0; i < customer.size(); i++) {
                System.out.println(customer.get(i));
                System.out.println(customer.size());
            }
        }
    }
}
