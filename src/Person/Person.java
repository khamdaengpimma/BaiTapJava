package Person;

public class Person {
    String name;
    int age;
    String address;
    public Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getaddress(){
        return address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setaddress(String address){
        this.address = address;
    }
    public void display(){
        System.out.print("Name = "+getName()+"\nAge = "+getAge()+"\nAddress = "+getaddress());
    }

    public static void main(String[] args){
        Person p1 = new Person("Khamdaeng",99,"LAOS");
            p1.display();
            }
}