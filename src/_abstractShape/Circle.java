package _abstractShape;

public class Circle extends Shape{
    double radius;
    public Circle(){
        radius = 3.5;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    public String toString() {
        return "A Circle have Area= "+getArea()+" And Perimeter = "+getPerimeter()+super.toString();
    }
}
