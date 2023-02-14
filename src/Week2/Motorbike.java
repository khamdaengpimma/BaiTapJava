package Week2;

public class Motorbike{
   String name;
   String model;
   int year;
   int speed;
   int prices;

  public Motorbike(String name, String model, int year,int prices) {
    this.name = name;
    this.model = model;
    this.year = year;
    this.prices = prices;
    this.speed = 0;
  }

  public String getname() {
    return this.name;
  }

  public String getModel() {
    return this.model;
  }

  public int getYear() {
    return this.year;
  }

  public int getSpeed() {
    return this.speed;
  }

  public void setname(String name) {
    this.name = name;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void accelerate(int increment) {
    this.speed += increment;
  }

  public void brake(int decrement) {
    this.speed -= decrement;
  }
  public void display(){
    System.out.print("NaneBike = "+name+" model = "+model+ "Year = "+year+ "Price = "+prices+" speed= "+speed);
  }
  public static void main(String[] args){
    Motorbike m1 = new Motorbike("Yamaha","Msx-120",2012,36000000);
    m1.accelerate(10);
    m1.display();
  }
  
}
