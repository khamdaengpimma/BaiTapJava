package Person;

public class Student extends Person {
    double gpa;
    public Student(String name,int age,String address,double gpa){
        super(name,age,address);
        this.gpa = gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void display(){
        System.out.println("Person.Person.Student Information : ");
        System.out.println("Name = "+getName()+"\nAge = "+getAge()+"\nAddress = "+getaddress());
        System.out.println("Gpa = "+getGpa());
    }
    public static void main(String[] args){
        Person s1 = new Student("Khamdaeng",99,"LAOS",8.5);
            s1.display();
            }
}
