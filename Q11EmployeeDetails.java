import java.util.Scanner;

class Employee {

    String firstName;
    String lastName;
    double monthlySalary;

    void initialize(String firstName, String lastName, double monthlySalary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    void displayDetails() {

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    void modifySalary(double salary) {

        monthlySalary = salary;
    }

    double calculateYearlySalary() {

        return monthlySalary * 12;
    }

    void increaseSalary() {

        monthlySalary = monthlySalary + (monthlySalary * 0.10);
    }
}

public class Q11EmployeeDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Enter details of Employee 1:");

        System.out.print("First Name: ");
        String firstName1 = sc.next();

        System.out.print("Last Name: ");
        String lastName1 = sc.next();

        System.out.print("Monthly Salary: ");
        double salary1 = sc.nextDouble();

        e1.initialize(firstName1, lastName1, salary1);

        System.out.println("\nEnter details of Employee 2:");

        System.out.print("First Name: ");
        String firstName2 = sc.next();

        System.out.print("Last Name: ");
        String lastName2 = sc.next();

        System.out.print("Monthly Salary: ");
        double salary2 = sc.nextDouble();

        e2.initialize(firstName2, lastName2, salary2);

        System.out.println("\nYearly Salary Before Increment:");

        System.out.println(e1.firstName + ": " + e1.calculateYearlySalary());
        System.out.println(e2.firstName + ": " + e2.calculateYearlySalary());

        e1.increaseSalary();
        e2.increaseSalary();

        System.out.println("\nYearly Salary After 10% Increment:");

        System.out.println(e1.firstName + ": " + e1.calculateYearlySalary());
        System.out.println(e2.firstName + ": " + e2.calculateYearlySalary());

        sc.close();
    }
}