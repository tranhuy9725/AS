package ocp;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = (length + width)*2;
        System.out.println("Area of rectangle is: " + area);
    }
}
