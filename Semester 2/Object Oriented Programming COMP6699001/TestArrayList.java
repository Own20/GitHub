import java.util.ArrayList;

public class TestArrayList {
    private ArrayList<String> customer;
    private int numberOfCustomers = 0;
    int index;
    String name;

    public TestArrayList(int index) {
        this.index = index;
    }
    public int getTestArrayList() {
        return index;
    }

    public boolean addCustomer(String name) {
        numberOfCustomers++;
        customer = new ArrayList<String>();
        customer.add(name);
        return true;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    // public String getCustomer(int index) {
    //     return customer.get(index);
    // }
    public ArrayList<String> getCustomer(int index) {
        return customer.get(index);
    }
}
