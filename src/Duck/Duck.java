package Duck;
public class Duck implements Ducklike {
    Flyable flyBehavior;
    Quackable quackBehavior;
    public void Duck(){};
    public void display() {

    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(Flyable flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(Quackable quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void Swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public  void dispaly(){
        fly();
        quack();
    };
}
