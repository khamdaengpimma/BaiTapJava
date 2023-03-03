package _interface.IEmployee;

public class TESTIEMPLOYEE {
    public static void main(String[] args){
        IEmployee a = new Employee("KH",20);
        System.out.println("Name = "+ a.getName()+", Salary = "+a.calculateSalary()+",000d/nam");
        IEmployee b = new PartTimeEmployee("DE",20,8);
        System.out.println("Name = "+ b.getName()+", Salary = "+b.calculateSalary()+",000d");
        IEmployee c = new FullTimeEmployee("NG",20);
        System.out.println("Name = "+ c.getName()+", Salary = "+c.calculateSalary()+",000d");
    }
}
