package com.comparator;

import java.util.Comparator;

public class SalaryComparatorDesc implements Comparator<Employee> {
	@Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}
