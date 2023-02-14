package Week2;

public class Fan {
    String Name;
    String model;
    Float prices;
    int blades;
    int nowspeed;
    Boolean Swing;

    public Fan(String Name, String model, Float prices, int blades) {
        this.Name = Name;
        this.model = model;
        this.prices = prices;
        this.blades = blades;
        this.nowspeed = 0;
        this.Swing = false;
    }

    public void on() {
        this.nowspeed = 1;
        System.out.println("the Week2.Fan is on");

    }

    public void off() {
        this.nowspeed = 0;
        System.out.println("Now off");
    }

    public void speed(int speed) {
        this.nowspeed = speed;
        System.out.println("change speed:" + speed);
    }

    public void swinggg() {
        if (this.nowspeed == 0) {
            
            System.out.println("the fan is stop");
        } else {
            
            System.out.println("The Week2.Fan is run");
        }
    }
    public void display(){
      System.out.print("Name ='" + Name + '\'' +
                ", model ='" + model + '\'' +
                ", prices =" + prices +
                ", blades =" + blades +
                ", nowspeed =" + nowspeed +
                ", Swing =" + Swing);
    }


    public static void main(String[] args) {


        Fan f1 = new Fan("HiTachi,", "AB47", 25.f, 12);
        f1.on();
        f1.speed(4);
        f1.swinggg();
        f1.display();
    }
}