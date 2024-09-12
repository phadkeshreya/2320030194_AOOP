package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "Engineering", 75000));
        employees.add(new Employee(102, "Bob", "Marketing", 55000));
        employees.add(new Employee(103, "Charlie", "Engineering", 80000));
        employees.add(new Employee(104, "David", "HR", 60000));
        employees.add(new Employee(105, "Eve", "Engineering", 70000));

        System.out.println("Employees sorted by salary (ascending):");
        Collections.sort(employees, new SalaryComparatorAsc());
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nEmployees sorted by salary (descending):");
        Collections.sort(employees, new SalaryComparatorDesc());
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nEmployees sorted by name (alphabetical):");
        Collections.sort(employees, new NameComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nEmployees sorted by department (alphabetical):");
        Collections.sort(employees, new DepartmentComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
