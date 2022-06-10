package Week12;

public abstract class Plan {
    protected double rate;

    public abstract double getRate;

    public void calculateBill (int units){
        System.out.println(units * rate);
    }
}
