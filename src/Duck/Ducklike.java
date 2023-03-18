package Duck;

public interface Ducklike extends Flyable ,Quackable{
    @Override
    void fly();

    @Override
    void quack();
}
