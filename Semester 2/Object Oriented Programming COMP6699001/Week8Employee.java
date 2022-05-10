import javax.sql.rowset.spi.SyncResolver;

public class Week8Employee {
    public static void main(String[] args) {
        Week8EmployeeCons em = new Week8EmployeeCons(01, "hello", "world", 10);
        System.out.println(em.toString());

    }
}