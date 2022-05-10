public class Week8CircleCons {
    private double radius;
    private String color;

    public Week8CircleCons() {
        radius = 1.0;
        color = "red";
    }
    public Week8CircleCons(double r) {
        radius = r;
        // this.setRadius(radius);
        color = "red";
    }
    public Week8CircleCons(double radius, String color) {
        this.radius = radius;
        // this.setRadius(radius);
        this.color = color;
    }
    
    public void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1.0;
        }
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String toString() {
        return "Circle [radius = " + this.radius + ", color = " + this.color + "]";
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}