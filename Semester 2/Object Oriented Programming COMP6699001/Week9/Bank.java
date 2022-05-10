import java.beans.Customizer;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customerList = new ArrayList<>();
    private int numberOfCustomers = 0;
    private String bankName;
    private Customer customer;

    public Bank(String bankName, Customer customer) {
        this.bankName = bankName;
        this.customer = customer;
    }

    public String getBankName() {
        return bankName;
    }

    public void addCustomer(String f, String l) {
        // customerList.add(f + l);
        Customer newCustomer = new Customer(f, l);
        this.customerList.add(newCustomer);
    }

    public int getNumOfCustomers() {
        return customerList.size();
    }

    public Customer getCustomer(int index) {
        return customerList.get(index);
    }

    public Customer letCustomer() {
        return customer;
    }

    // public String toString() {
    //     System.out.println("This is " + bankName + " Bank");

    //     for (int i = 0; i < getNumOfCustomers() ; i++) {
    //         System.out.println(getCustomer(i).getFirstName() + " " + getCustomer(i).getLastName());
    //         System.out.println(Bank + getNumOfCustomers());
    //     }
    // }
}
