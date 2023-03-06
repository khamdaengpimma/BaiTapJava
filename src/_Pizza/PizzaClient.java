package _Pizza;

public class PizzaClient {
    public void run(){
        Pizza p1 = new Pizza (12.5, new Circle (3.5));
        Pizza p2 =  new Pizza (19.9, new Rectangle (5, 4));
        PizzaDeal pid = new PizzaDeal();

        System.out.println(p1 + " is a better deal than " + p2
                + ": " + pid.betterDeal(p1, p2));
    }
    public static void main(String[] args){
        new PizzaClient().run();
    }
}
