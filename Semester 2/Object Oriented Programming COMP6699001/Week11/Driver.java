package Week11;

public class Driver {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle(5, s);
        Rectangle r = new Rectangle(5, 5, s);
        Square sq = new Square(5, s);
    }
}
