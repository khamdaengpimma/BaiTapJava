package _interface;

public class TestInterface {
    public static void main(String[] args){
        IShape a = new Circle(3);
        IShape b = new Rectangle(3,4);
        System.out.println(a.getArea()+"\n"+a.getPerimeter());
        System.out.println(b.getArea()+"\n"+b.getPerimeter());
    }
}
