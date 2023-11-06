import java.util.*;
class Employee {
     String name;
     double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class Sal {
    public static void main(String[] args) {
        List<Employee> a = new ArrayList<>();
        a.add(new Employee("adi", 25000));
        a.add(new Employee("raji", 30000));
        a.add(new Employee("shiva", 18000));
        a.add(new Employee("ram", 35000));
        double high = Double.MIN_VALUE;
        double low = Double.MAX_VALUE;
        for (Employee e : a) {
            double salary = e.salary;
            if (salary > high) {
                high = salary;
            }
            if (salary < low) {
                low = salary;
            }
        }
        for (Employee e : a) {
            if (e.salary == high) {
                System.out.println("Employee with highest salary: " + e.name);
            }
        }
        System.out.println("Lowest salary: " + low);
        System.out.println("Salaries between 20000 and 30000:");
        for (Employee e : a) {
            double salary = e.salary;
            if (salary >= 20000 && salary <= 30000) {
                System.out.println(e.name + ": " + salary);
            }
        }
    }
}