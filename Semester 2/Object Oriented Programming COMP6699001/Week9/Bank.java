import java.beans.Customizer;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    private int numberOfCustomers = 0;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void addCustomer(String f, String l) {
        Customer newCustomer = new Customer(f, l);
        this.customerList.add(newCustomer);
        numberOfCustomers++;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return this.customerList.get(index);
    }
}