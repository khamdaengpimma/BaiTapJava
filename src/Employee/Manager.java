package Employee;

import Employee.Employee;

public class Manager extends Employee {
    int bonus;
    public Manager(String name, int salary,int bonus){
        super(name,salary);
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
