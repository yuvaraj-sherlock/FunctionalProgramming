package com.functional.streams;

import com.functional.model.Employee;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
            .forEach(emp-> System.out.println(emp.getName()+"("+emp.getSalary()+")"+emp.getCity()));
    System.out.println("*".repeat(20));

    List<Employee> collect = list.stream()
            .filter(emp -> emp.getSalary() > 50000)
            .map(emp ->  new Employee(emp.getName().toUpperCase(),emp.getSalary(),emp.getCity()))
            .sorted(Comparator.comparing(Employee :: getName).reversed())
            .collect(Collectors.toList());
    return collect;
  }

  public static Map<String,Double> convertToMap(List<Employee> list){
    return list.stream()
            .collect(Collectors.toMap(Employee::getName,Employee::getSalary));
  }

  public static Map<String,Double> sortMapByKey(Map<String,Double> map){
    return map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(
                    Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new));
  }

  public static Map<String,Double> sortMapByKeyDesc(Map<String,Double> map){
    return map.entrySet().stream()
            .sorted(Map.Entry.<String,Double>comparingByKey().reversed())
            .collect(
                    Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new));
  }

  public static Map<String,Double> sortMapByValue(Map<String,Double> map){
    return map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(
                    Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new));
  }

  public static Map<String,Double> sortMapByValueDesc(Map<String,Double> map){
    return map.entrySet().stream()
            .sorted(Map.Entry.<String,Double>comparingByValue().reversed())
            .collect(
                    Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new));
  }
}


