package EmployeeClass;

public class EmployeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Vasile","Lupu",4000);
        Employee employee2 = new Employee("Andrei","Optorase",20000);
        employee.setMonthlySalary(employee.getMonthlySalary()*1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary()*1.1);
        System.out.printf("\nYearly salary for %s is %.2f",employee.getFirstName(),employee.getYearlySalary(employee.getMonthlySalary()));
        System.out.printf("\nYearly salary for %s is %.2f",employee2.getFirstName(),employee2.getYearlySalary(employee2.getMonthlySalary()));
    }
}
