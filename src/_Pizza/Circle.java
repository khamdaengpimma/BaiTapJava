package _Pizza;

public class Circle implements IShape{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
    public String toString(){
            return "("+getArea()+ " cm^2)";
    }

}
