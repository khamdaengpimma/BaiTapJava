package Shape;

import Shape.Shape;

public class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return this.length*this.width;
    }
    // public static void main(String[] args){
    //     Shape.Rectangle R1 = new Shape.Rectangle(3,4);
    //     System.out.print(R1.getArea());
    //     }
}