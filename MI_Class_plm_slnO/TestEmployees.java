// Parent class

/*import java.util.Scanner;
public class Lab {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
     int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
          int x = sc.nextInt();   
          System.out.println("1 " + x);  
      }
  
    }
    
  }
*/
// Simple program using inheritance and polymorphism
public class TestEmployees {
    public static void main(String[] args) {
        // Polymorphism: reference of parent pointing to child objects
        Employee e = new Employee("Alice", 101, 30000);
        Employee m = new Manager("Bob", 102, 50000, "Sales");
        Employee ex = new Executive("Carol", 103, 80000, "Operations", 15000);

        // all will call their own toString() method
        System.out.println(e);
        System.out.println(m);
        System.out.println(ex);
    }
}

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
        return "Employee: Name=" + name + ", Id=" + id + ", Salary=" + salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String toString() {
        return "Manager: Name=" + name + ", Id=" + id + 
               ", Salary=" + salary + ", Dept=" + department;
    }
}

class Executive extends Manager {
    double bonus;

    Executive(String name, int id, double salary, String department, double bonus) {
        super(name, id, salary, department);
        this.bonus = bonus;
    }

    public String toString() {
        return "Executive: Name=" + name + ", Id=" + id + 
               ", Salary=" + salary + ", Dept=" + department + 
               ", Bonus=" + bonus;
    }
}



