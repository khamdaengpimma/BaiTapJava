package Shape;

import Shape.Shape;

public class Circle extends Shape {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * 3.14;
    }
    // public static void main(String[] args){
    //     Shape.Circle c1 = new Shape.Circle(3);
    //     System.out.print(c1.getArea());}
}
