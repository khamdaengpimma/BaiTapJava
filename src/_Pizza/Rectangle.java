package _Pizza;

public class Rectangle implements IShape{
    double width;
    double height;

    public Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width*height;
    }
    public String toString(){
        return "("+getArea()+" cm^2)";
//        "Rectangle(h = " + height + ", w = " + width + ")"
    }
}
