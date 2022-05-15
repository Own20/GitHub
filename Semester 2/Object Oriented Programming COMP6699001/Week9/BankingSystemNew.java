import java.util.Scanner;
import java.beans.Customizer;
import java.util.ArrayList;

public class BankingSystemNew {
    public static void displayMenu() {
        System.out.println("Select Action");
        System.out.println("1. Create");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Display");
        System.out.println("5. Quit");
    }

    public static void main(String[] args) {
        Double firstDep = 0.0;
        String firstName = "a";
        String lastName = "b";
        String bankName = "c";

        Account acc1 = new Account(firstDep);
        Customer cst1 = new Customer(firstName, lastName);
        Bank bnk1 = new Bank(bankName);

        // ArrayList<Bank> bankCustomer = new ArrayList<Bank>();
        
        boolean a = true;
        while(a) {
            displayMenu();

            Scanner cho = new Scanner(System.in);
            System.out.print("Choice: ");
            int choice = cho.nextInt();

            System.out.print("\n");

            if(choice == 1) {
                Scanner ins = new Scanner(System.in);

                System.out.print("Insert bank name: ");
                bankName = ins.nextLine();

                System.out.print("Insert first name: ");
                firstName = ins.nextLine();

                System.out.print("Insert last name: ");
                lastName = ins.nextLine();

                System.out.print("Insert first deposit: ");
                firstDep = ins.nextDouble();

                System.out.print("\n");

                acc1 = new Account(firstDep);
                cst1 = new Customer(firstName, lastName);
                bnk1 = new Bank(bankName);
                
                bnk1.addCustomer(firstName, lastName);
                bnk1.getCustomer(bnk1.getNumOfCustomers() - 1).setAccount(acc1);

                for(int i = 0; i < bnk1.getNumOfCustomers(); i++) {
		        	System.out.println(bnk1.getCustomer(i).getFirstName() + " " + bnk1.getCustomer(i).getLastName() + " registered in " + bnk1.getBankName() + " Bank");
                    System.out.println("Your balance: $" + bnk1.getCustomer(i).getAccount().getBalance() + "\n");
		        }
            }

            else if(choice == 2) {
                int num;
                Scanner ins = new Scanner(System.in);
						
		        System.out.println("=======================================================");
		        System.out.printf("|%5s|%10s|%10s|%10s|\n", "Num", "Bank" ,"Name", "Balance");
		        System.out.println("=======================================================");
		        for(int i = 0; i < bnk1.getNumOfCustomers(); i++) {
		        	System.out.printf("|%5s|%10s|%10s|%10s|\n", i + 1, bnk1.getBankName(), bnk1.getCustomer(i).getFirstName() + " " + bnk1.getCustomer(i).getLastName(), "$" + bnk1.getCustomer(i).getAccount().getBalance());
		        }
		        System.out.println("=======================================================\n");
						
		        do {
		        	System.out.print("Enter customer number: ");
		        	num = ins.nextInt();
		        	ins.nextLine();
		        }
                while(num < 1 || num > bnk1.getNumOfCustomers());
						
		        System.out.println("\nDescription");
		        System.out.println("Name   : " + bnk1.getCustomer(num - 1).getFirstName() + " " + bnk1.getCustomer(num - 1).getLastName());
		        System.out.println("Balance: " + bnk1.getCustomer(num - 1).getAccount().getBalance() + "\n");

                System.out.print("Amount to deposit: ");
                double dep = ins.nextDouble();

                bnk1.getCustomer(num - 1).getAccount().deposit(dep);

                System.out.println("You have deposited: $" + dep);
                System.out.println("Your current balance: $" + bnk1.getCustomer(num - 1).getAccount().getBalance() + "\n");
            }

            else if(choice == 3) {
                int num;
                Scanner ins = new Scanner(System.in);
						
		        System.out.println("=======================================================");
		        System.out.printf("|%5s|%10s|%10s|%10s|\n", "Num", "Bank" ,"Name", "Balance");
		        System.out.println("=======================================================");
		        for(int i = 0; i < bnk1.getNumOfCustomers(); i++) {
		        	System.out.printf("|%5s|%10s|%10s|%10s|\n", i + 1, bnk1.getBankName(), bnk1.getCustomer(i).getFirstName() + " " + bnk1.getCustomer(i).getLastName(), "$" + bnk1.getCustomer(i).getAccount().getBalance());
		        }
		        System.out.println("=======================================================\n");
						
		        do {
		        	System.out.print("Enter customer number: ");
		        	num = ins.nextInt();
		        	ins.nextLine();
		        }
                while(num < 1 || num > bnk1.getNumOfCustomers());
						
		        System.out.println("\nDescription");
		        System.out.println("Name   : " + bnk1.getCustomer(num - 1).getFirstName() + " " + bnk1.getCustomer(num - 1).getLastName());
		        System.out.println("Balance: " + bnk1.getCustomer(num - 1).getAccount().getBalance() + "\n");

                System.out.print("Amount to withdraw: ");
                double wit = ins.nextDouble();

                bnk1.getCustomer(num - 1).getAccount().withdraw(wit);

                System.out.println("You have withdrawn: $" + wit);
                System.out.println("Your current balance: $" + bnk1.getCustomer(num - 1).getAccount().getBalance() + "\n");
            }

            else if(choice == 4) {
                System.out.println("=======================================================");
		        System.out.printf("|%5s|%10s|%10s|%10s|\n", "Num", "Bank" ,"Name", "Balance");
		        System.out.println("=======================================================");
		        for(int i = 0; i < bnk1.getNumOfCustomers(); i++) {
		        	System.out.printf("|%5s|%10s|%10s|%10s|\n", i + 1, bnk1.getBankName(), bnk1.getCustomer(i).getFirstName() + " " + bnk1.getCustomer(i).getLastName(), "$" + bnk1.getCustomer(i).getAccount().getBalance());
		        }
		        System.out.println("=======================================================\n");

            }
            else if(choice == 5) {
                System.out.println("Thank you for using our service!");
                a = false;

            }
            else {
                System.out.println("Invalid Action");
            }
        }
    }
}
