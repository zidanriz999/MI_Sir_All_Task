class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Employee [Name=" + name + ", ID=" + id + ", Salary=" + salary + "]";
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String toString() {
        return "Manager [Name=" + name + ", ID=" + id + ", Salary=" + salary + ", Department=" + department + "]";
    }
}

class Executive extends Manager {
    double bonus;

    Executive(String name, int id, double salary, String department, double bonus) {
        super(name, id, salary, department);
        this.bonus = bonus;
    }

    public String toString() {
        return "Executive [Name=" + name + ", ID=" + id + ", Salary=" + salary +
                ", Department=" + department + ", Bonus=" + bonus + "]";
    }
}

public class Employees {
 public static void main(String[] args) {
        Employee e1 = new Employee("Rahim", 101, 25000);
        Employee m1 = new Manager("Karim", 102, 40000, "CSE");
        Employee ex1 = new Executive("Sabbir", 103, 60000, "CE", 15000);

        System.out.println(e1.toString());
        System.out.println(m1.toString());
        System.out.println(ex1.toString());
    }
}
