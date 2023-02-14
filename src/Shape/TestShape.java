package Shape;

public class TestShape {
    public static void main(String[] args){
        Shape r1 = new Rectangle(2,3);
        Shape c1 = new Circle(5.6);
        Shape r2 = new Rectangle(7, 10);
        Shape c2 = new Circle(100);
        Shape r3 = new Rectangle(20,20);
        Shape c3 = new Circle(10);
        Shape r4 = new Rectangle(15, 15);
        Shape c4 = new Circle(5);
        Shape[] list = {r1, c1, r2, c2,r3, c3, r4, c4};
        for (Shape s: list) {
            System.out.println("The area = " + s.getArea());
        }
    }
}