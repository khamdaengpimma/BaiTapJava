package Duck;

public class DuckTestDrive {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        Duck redHead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();
        Duck[] list = {mallard,rubber,redHead,decoy};
        for(Duck i: list){
            System.out.println();
            i.display();  // "I'm a duck"
            i.quack();    // "Quack or not "
            i.Swim();     // "All ducks float, even decoys!"
            i.fly();  //  "can fly or not!"

            }
    }
}
