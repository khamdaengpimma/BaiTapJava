package _interface.IShape;

public class Circle implements IShape {
    double Radius;
    public Circle(double r){
        this.Radius = r;
    }
    @Override
    public double getArea() {
        return Radius*Radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*Radius*3.14;
    }
}
