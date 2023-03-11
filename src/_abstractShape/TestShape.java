package _abstractShape;

public class TestShape {
    public static void main(String[] args) {
        Shape c1 = new Circle("White", false, 2);
        Shape r1 = new Rectangle("Black",false,5, 6);
        Shape q1 = new Square("Red",true,4);
        Shape[] list = {c1, r1, q1};
        for (Shape i : list) {
            System.out.println(i.toString());
        }
    }
}