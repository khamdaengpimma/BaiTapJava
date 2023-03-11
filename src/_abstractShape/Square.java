package _abstractShape;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled,double side) {
        super(color, filled,side,side);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Squre have Area = " + getArea() + " And Perimeter = " + getPerimeter() +" which is a subclass of "+ super.toString();
    }
}
