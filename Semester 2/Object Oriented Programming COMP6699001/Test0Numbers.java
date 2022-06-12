import java.util.ArrayList;

public class Test0Numbers {
    private int number1 = 50;
    private int number2 = 100;
    private ArrayList<Integer> list;

    public Test0Numbers() {
       list = new ArrayList<Integer>();
       list.add(number1);
       list.add(number2);
    }

    public ArrayList<Integer> getList() {
       return list;
    }
}
