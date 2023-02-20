package _interface.IEmployee;

import _interface.IEmployee.Employee;

public class PartTimeEmployee extends Employee {
    int WorkingHours;
    public PartTimeEmployee(String name, int paymentPerHour,int WorkingHours) {
        super(name, paymentPerHour);
        this.WorkingHours = WorkingHours;
    }
    public int calculateSalary(){
        return WorkingHours*getPaymentPerHour();
    }
}
