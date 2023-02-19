package Employee;

public class TestEmployee {
    public static void main(String[]args){
        Employee e1 = new Employee(4, "Kjonh", 50000000);
        Employee e2 = new Employee(5, "kalaban", 50000000);
        Employee e3 = new Employee(6, "Hollow", 50000000);
        Employee e4 = new Employee(7, "Flag", 50000000);

        Employee[] list = {e1, e2, e3, e4};
        for (Employee e: list
        ) {
              e.insertData();
              e.DeleteData();
              e.UpdateData();
              e.ShowData();

        }
//        e4.ShowData();
    }
}