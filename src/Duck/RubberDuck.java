package Duck;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new CannotFly();
        //quackBehavior = new Squeak();
        quackBehavior = () -> System.out.println("Squeak");
    }

    public RubberDuck(Flyable flyBehavior, Quackable quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
//        super.display();
    }
}
