import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Класс, представляющий сотрудника
class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

// Класс, представляющий компанию
class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Employees of " + name + ":");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

public class CompanyManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Создаем компанию
        Company company = new Company("Tech Solutions");

        while (true) {
            // Запрашиваем данные сотрудника у пользователя
            System.out.print("Введите имя сотрудника: ");
            String name = scanner.nextLine();

            System.out.print("Введите возраст сотрудника: ");
            int age = scanner.nextInt();

            System.out.print("Введите зарплату сотрудника: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Чтение символа новой строки после nextDouble()

            // Создаем нового сотрудника и добавляем его в компанию
            Employee employee = new Employee(name, age, salary);
            company.hireEmployee(employee);

            // Спрашиваем пользователя, хочет ли он ввести еще одного сотрудника
            System.out.print("Хотите ввести еще одного сотрудника? (да/нет): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("нет")) {
                break;
            }
        }

        // Выводим список сотрудников компании
        company.displayEmployees();

        scanner.close();
    }
}
