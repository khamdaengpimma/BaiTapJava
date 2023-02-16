package Employee;


public class Employee {
    int id;
    String name;
    int salary;
    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void display(){
        System.out.println("Name = "+getName()+"\nSalary = "+getSalary());
    }

    public static void main(String[] args){

        Employee e1 = new Employee("khamdaeng", 1000000);
        e1.display();
    }
}

