package Duck;

public class CannotFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("I'm cannot Fly");
    }
}
