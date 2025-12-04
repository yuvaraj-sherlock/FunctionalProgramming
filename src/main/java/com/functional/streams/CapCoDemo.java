package com.functional.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

public class CapCoDemo {
  public static void main(String[] args) {
    List<Student> student = new ArrayList<Student>();
    student.add(new Student("Tri","Male",37));
    student.add(new Student("Frini","Male",48));
    student.add(new Student("Srinivasan","Male",18));
    student.add(new Student("Srini","Male",18));

    //Find Max age
    Optional<Integer> first = student.stream()
            .map(std -> std.getAge())
            .sorted(Comparator.reverseOrder())
            .distinct()
            .findFirst();
    System.out.println(first.get());

    //To find the sum of odd numbers:
    List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
    int sum = lst.stream()
            .filter(num -> num % 2 != 0)
            .mapToInt(Integer::intValue)
            .sum();
    System.out.println(sum);

    List<Student> lststud = Arrays.asList(
            new Student("srini","male",25),
            new Student("srini","male",25),
            new Student("vasan","male",25),
            new Student("vasan","female",25),
            new Student("kaviya","male",25),
            new Student("varshini","male",25));
    student.addAll(lststud);

    Map<String, List<Student>> collect = student.stream()
            .collect(Collectors.groupingBy(std -> std.getName().toLowerCase()));
    System.out.println(collect);
  }

  @Data
  @AllArgsConstructor
  @ToString
  private static class Student {
    private String name;
    private String gender;
    private int age;

  }
}
