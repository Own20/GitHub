package Week11;

import java.lang.reflect.WildcardType;

public class Square extends Rectangle {
    protected double side;

    public Square() {
        this.side = side
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // public void setWidth(double side) {
    //     this.width = side;
    // }
    // public void setLength(double side) {
    //     this.width = side;
    // }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Square{" + "side = " + side + "}" + super.toString();
    }
}
