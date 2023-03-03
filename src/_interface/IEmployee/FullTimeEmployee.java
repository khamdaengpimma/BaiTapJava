package _interface.IEmployee;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public int calculateSalary(){
        return 4*40*getPaymentPerHour();
    }
}
