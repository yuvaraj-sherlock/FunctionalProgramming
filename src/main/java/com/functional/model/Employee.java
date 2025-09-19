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
  private String city;

  public static List<Employee> getDummyEmployees() {
    return Arrays.asList(
            new Employee("Alice", 45000,"Mumbai"),
            new Employee("Charlie", 30000,"Delhi"),
            new Employee("Diana", 85000,"Mumbai"),
            new Employee("Eve", 55000,"Chennai"),
            new Employee("Yuvi", 60000,"Delhi"),
            new Employee("Bob", 75000,"Hyderabad"),
            new Employee("Frank", 40000,"Goa"));
  }
}