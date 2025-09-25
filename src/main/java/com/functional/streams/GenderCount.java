package com.functional.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Employee {
  private int id;
  private String name;
  private String gender;
}
/*Given a List<Employee> where each Employee object has fields id, name, and gender,
how would you use Java 8 Stream API to count the number of male and female employees based on the gender field?*/
public class GenderCount {
  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "Female"),
            new Employee(2, "Bob", "Male"),
            new Employee(3, "Charlie", "Male"),
            new Employee(4, "Diana", "Female")
    );
    Map<String, Long> collect =
            employees.stream()
                    .collect(
                            Collectors.groupingBy(emp -> emp.getGender(),
                                    Collectors.counting()));
    System.out.println(collect);
    Map<String, List<String>> collect1 = employees.stream()
            .collect(
                    Collectors.groupingBy(Employee::getGender,
                            Collectors.mapping(Employee::getName, Collectors.toList())));
    System.out.println(collect1);
  }
}
