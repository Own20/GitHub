import java.beans.Customizer;
import java.util.ArrayList;

public class BankDiff {
    private String bankName;
    private Customer customer;

    public Bank(String bankName) {
        this.bankName = bankName;
    }
    public String getBankName() {
        return bankName;
    }
}
