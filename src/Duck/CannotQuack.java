package Duck;

public class CannotQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("Sorry, I cannot quack.");
    }
}
