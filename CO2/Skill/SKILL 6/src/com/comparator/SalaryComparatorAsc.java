package com.comparator;

import java.util.Comparator;


public class SalaryComparatorAsc implements Comparator<Employee> {
	@Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}
