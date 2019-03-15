package ParameterizeMethod.after;

public class Employee {

    private int salary;

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void raise(double factor) {
        salary *= (1 + factor);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(10);
        employee.raise(0.1);
        employee.raise(0.05);
    }
}
