import java.beans.Customizer;
import java.util.Scanner;

public class BankingSystem {
    public static void displayMenu() {
        System.out.println("Select Action");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Info");
        System.out.println("4. Quit");
    }
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);

        System.out.print("Insert bank name: ");
        String bankName = ins.nextLine();

        System.out.print("Insert first name: ");
        String firstName = ins.nextLine();

        System.out.print("Insert last name: ");
        String lastName = ins.nextLine();

        System.out.print("Insert first deposit: ");
        Double firstDep = ins.nextDouble();

        Account acc1 = new Account(firstDep);
        Customer cst1 = new Customer(firstName, lastName, acc1);
        Bank bnk1 = new Bank(bankName, cst1);

        System.out.println(firstName + " " + lastName + " registered in " + bankName + " Bank");
        System.out.println("Your first balance: $" + firstDep);

        boolean a = true;
        while(a) {
            displayMenu();

            Scanner num = new Scanner(System.in);
            System.out.print("Choice: ");
            int choice = num.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Amount to deposit: ");
                    double dep = num.nextDouble();

                    bnk1.letCustomer().getAccount().deposit(dep);

                    System.out.println("You have deposited: $" + dep);
                    System.out.println("Your current balance: $" + bnk1.letCustomer().getAccount().getBalance());

                    break;

                case 2:
                    System.out.print("Amount to withdraw: ");
                    double wit = num.nextDouble();

                    bnk1.letCustomer().getAccount().withdraw(wit);

                    System.out.println("You have withdrawn: $" + wit);
                    System.out.println("Your current balance: $" + bnk1.letCustomer().getAccount().getBalance());

                    break;

                case 3:
                    System.out.println("Your current balance: $" + bnk1.letCustomer().getAccount().getBalance());

                    break;

                case 4:
                    System.out.println("Thank you for using our service!");
                    a = false;

                    break;

                default:
                    System.out.println("Invalid Action");

                    break;
            }
        }
    }
}

// account
// account(balance)
// -setbalance
// getbalance
// deposit(amount)
// withdraw(amount)

// customer
// customer(f, l)
// -setfirstname
// -setlastname
// getfirstname
// getlastname
// getaccount
// setaccount

// bank
// bank(bankname)
// addcustomer(f, l)
// getnumofcustomers
// getcustomer(index)
// tostring