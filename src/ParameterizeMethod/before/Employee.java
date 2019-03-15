package ParameterizeMethod.before;

public class Employee {

    private int salary;

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void tenPercentRaise() {
        salary *= 1.1;
    }

    public void fivePercentRaise() {
        salary *= 1.05;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(10);
        employee.tenPercentRaise();
        employee.fivePercentRaise();
    }


}
