package com.functional.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Employee {
  private int id;
  private String name;
  private String gender;
  private double salary;
}
/*Given a List<Employee> where each Employee object has fields id, name, and gender,
how would you use Java 8 Stream API to count the number of male and female employees based on the gender field?*/
public class GenderCount {
  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "Female",5000),
            new Employee(2, "Bob", "Male",6000),
            new Employee(3, "Charlie", "Male",7000),
            new Employee(4, "Diana", "Female",9000),
            new Employee(5, "Raju", "Male",6000)
    );
    Map<String, Long> collect = mapGenderToCount(employees);
    System.out.println(collect);
    Map<String, List<String>> collect1 = mapGenderToListOfNames(employees);
    System.out.println(collect1);
    double sal = find3rdHighestSalary(employees);
    System.out.println(sal);
  }

  private static double find3rdHighestSalary(List<Employee> employees) {
    Optional<Double> first = employees.stream()
            .map(Employee::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(2)
            .findFirst();
    return first.get();
  }

  private static Map<String, List<String>> mapGenderToListOfNames(List<Employee> employees) {
    return employees.stream()
            .collect(
                    Collectors.groupingBy(Employee::getGender,
                            Collectors.mapping(Employee::getName, Collectors.toList())));
  }

  private static Map<String, Long> mapGenderToCount(List<Employee> employees) {
    return employees.stream()
            .collect(
                    Collectors.groupingBy(emp -> emp.getGender(),
                            Collectors.counting()));
  }
}
