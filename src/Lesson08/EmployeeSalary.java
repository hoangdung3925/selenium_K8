package Lesson08;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalary {

    List<Employee> employeeList = new ArrayList();

    public void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            Employee FTE = new FullTimeEmployee();
            employeeList.add(FTE);
        }

        for (int i = 0; i < 3; i++) {
            Employee CTE = new ContractEmployee();
            employeeList.add(CTE);
        }

        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.salary;
        }
    }
}


