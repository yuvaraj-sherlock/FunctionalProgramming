package com.functional.streams;

import com.functional.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByProcessor {

  public static Map<String, List<Employee>> groupOfEmployeesByCity(List<Employee> list){
    Map<String, List<Employee>> collect = list.stream()
            .collect(Collectors.groupingBy(emp -> emp.getCity()));
    return collect;
  }

  public static Map<String, List<String>> nameOfEmployeesByCity(List<Employee> list){
    Map<String, List<String>> collect = list.stream()
            .collect(
                    Collectors.groupingBy(
                            emp -> emp.getCity(),
                    Collectors.mapping(emp->emp.getName(),Collectors.toList())));
    return collect;
  }

  public static Map<String,List<Integer>> groupByEvenOdd(List<Integer> list){
    Map<String, List<Integer>> collect =
            list.stream().collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "ODD"));
    return collect;
  }
}
