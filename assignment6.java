Sandy Achraf 
ID:20216500

package BankSystem;

class Human {
    private String name;
    private int age;
    private String gender;

    Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    final void greet() {
        System.out.println("Good Morning");
    }
}

class Employee extends Human {
    private double salary;
    private String department;

    Employee(String name, int age, String gender, double salary, String department) {
        super(name, age, gender);
        this.salary = salary;
        this.department = department;
    }

    @Override
    void printData() {
        super.printData();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    double getSalary() {
        return salary;
    }

    String getDepartment() {
        return department;
    }
}

final class BankAccount {
    private double balance;

    double getBalance() {
        return this.balance + balance*0.1;
    }

    void setBalance(double balance) {
        if (balance >= 0 && balance <= 1_000_000) {
            this.balance += balance;
        }
    }

    void setBalance(double balance, double taxPercent) {
        double taxAmount = balance * (taxPercent / 100);
        this.balance += balance - taxAmount;
    }
}

class Customer extends Human {
    private String ssn;
    private String address;

    Customer(String name, int age, String gender, String ssn, String address) {
        super(name, age, gender);
        this.ssn = ssn;
        this.address = address;

    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, "Male", 5000.0, "HR");
        Customer customer = new Customer("Jane Smith", 25, "Female", "123456789", "123 Main St");

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000.0);
        bankAccount.setBalance(2000.0, 10.0);
    }
}