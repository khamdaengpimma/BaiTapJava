package Employee;

public class Manager extends Employee {
    int bonus;
    public Manager(int id,String name, int salary,int bonus){
        super(id,name,salary);
        this.bonus = bonus;
    }
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    public int getBonus(){
        return bonus;
    }
    public void display(){
        super.display();
        System.out.println("Bonus = "+getBonus());
    }
}
