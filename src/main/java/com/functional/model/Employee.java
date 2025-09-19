package com.functional.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
public class Employee{
  private String name;
  private double salary;

  public static List<Employee> getDummyEmployees() {
    return Arrays.asList(
            new Employee("Alice", 45000),
            new Employee("Charlie", 30000),
            new Employee("Diana", 85000),
            new Employee("Eve", 55000),
            new Employee("Yuvi", 60000),
            new Employee("Bob", 75000),
            new Employee("Frank", 40000));
  }
}