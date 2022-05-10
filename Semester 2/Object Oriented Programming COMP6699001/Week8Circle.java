public class Week8Circle {
    public static void main(String[] args) {
        Week8CircleCons c1 = new Week8CircleCons();              // radius = 1.0 color = "red"

        // c1.color = "purple";
        // c1.radius = -10;

        Week8CircleCons c2 = new Week8CircleCons(3.5);           // radius = 3.5 color = "red"
        Week8CircleCons c3 = new Week8CircleCons(4.5, "purple"); // radius = 4.5 color = "purple"

        c1.setColor("biru");
        c1.setRadius(3.5);

        double tempRadius = c1.getRadius();
        String tempColor = c1.getColor();

        System.out.println(c1.toString() + "Area : ");
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}