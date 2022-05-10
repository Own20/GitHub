public class Week8EmployeeCons {
    private int id;
    private String firstname;
    private String lastname;
    private double salary;

    public Week8EmployeeCons(int id, String firstname, String lastname, double salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }
    public String getFirstname() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public String getName() {
        return this.firstname + " " + this.lastname;
    }
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return this.salary * 12;
    }

    public double raiseSalary(int percent) {
        this.salary = ((percent + 100) / 100.0) * this.salary;
        return this.salary;
    }

    public String toString() {
        return "Employee [id = " + this.id + ", name = " + this.getName() + ", salary = " + this.getAnnualSalary() + "]";
    }
}