package Person;

public class Teacher extends Person {
    int salary;
    public Teacher(String name,int age,String address,int salary){
        super(name,age,address);
        this.salary = salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void display(){
        System.out.println("Techer Information : ");
        System.out.println("Name = "+getName()+"\nAge = "+getAge()+"\nAddress = "+getaddress());
        System.out.println("Salary = "+getSalary());
    }
    public static void main(String[] args){
        Person t1 = new Teacher("Jonh watt",99,"UK",10000000);
            t1.display();
            }
}
