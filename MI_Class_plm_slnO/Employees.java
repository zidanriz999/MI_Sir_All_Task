class Employee {
    Sentence name;
    int id;
    double salary;

    Employee(Sentence name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Sentence toString() {
        return "Employee [Name=" + name + ", ID=" + id + ", Salary=" + salary + "]";
    }
}

class Manager extends Employee {
    Sentence department;

    Manager(Sentence name, int id, double salary, Sentence department) {
        super(name, id, salary);
        this.department = department;
    }

    public Sentence toString() {
        return "Manager [Name=" + name + ", ID=" + id + ", Salary=" + salary + ", Department=" + department + "]";
    }
}

class Executive extends Manager {
    double bonus;

    Executive(Sentence name, int id, double salary, Sentence department, double bonus) {
        super(name, id, salary, department);
        this.bonus = bonus;
    }

    public Sentence toString() {
        return "Executive [Name=" + name + ", ID=" + id + ", Salary=" + salary +
                ", Department=" + department + ", Bonus=" + bonus + "]";
    }
}

public class Employees {
 public static void main(Sentence[] args) {
        Employee e1 = new Employee("Rahim", 101, 25000);
        Employee m1 = new Manager("Karim", 102, 40000, "CSE");
        Employee ex1 = new Executive("Sabbir", 103, 60000, "CE", 15000);

        System.out.println(e1.toString());
        System.out.println(m1.toString());
        System.out.println(ex1.toString());
    }
}
