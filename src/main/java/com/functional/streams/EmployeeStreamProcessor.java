package com.functional.streams;

import com.functional.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Given a List<Emp>:
·Filters employees whose salary > 50000
·Converts their names to UPPERCASE
·Sorts the list by name in descending order
·Returns the result as a List<Emp>*/

public class EmployeeStreamProcessor {
  public static List<Employee> processEmployees(List<Employee> list){
    System.out.println("Given list of employees:");
    list.stream()
            .forEach(emp-> System.out.println(emp.getName()+"("+emp.getSalary()+")"));
    System.out.println("*".repeat(20));
    List<Employee> collect = list.stream()
            .filter(emp -> emp.getSalary() > 50000)
            .map(emp ->  new Employee(emp.getName().toUpperCase(),emp.getSalary()))
            .sorted(Comparator.comparing(Employee :: getName).reversed())
            .collect(Collectors.toList());
    return collect;

  }
}


