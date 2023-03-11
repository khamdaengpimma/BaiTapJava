package _abstractShape;

public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
        width = 3;
        length = 4;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public  double getPerimeter(){
        return 2*(length*width);
    }

    @Override
    public String toString() {
        return String.format("A Rectangle have Area = %f And Perimeter = %f %s",getArea(),getPerimeter(),super.toString());
    }
}
