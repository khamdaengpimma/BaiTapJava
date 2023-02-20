package _interface;

public class Rectangle implements IShape{
    double length;
    double width;
    public Rectangle(double l,double w){
        this.length = l;
        this.width= w;
    }
    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length * width);
    }
}
