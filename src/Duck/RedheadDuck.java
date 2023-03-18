package Duck;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a Red Head duck");
//        super.display();
    }
}
