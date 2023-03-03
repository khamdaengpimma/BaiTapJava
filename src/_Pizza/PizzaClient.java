package _Pizza;

public class PizzaClient {
    public void run(){
        Pizza round = new Pizza (12.5, new Circle (3.5));
        Pizza rect =  new Pizza (19.9, new Rectangle (5, 4));
        PizzaDeal pid = new PizzaDeal();

        System.out.println(round + " is a better deal than " + rect
                + ": " + pid.betterDeal(round, rect));
    }
    public static void main(String[] args){
        new PizzaClient().run();
    }
}
