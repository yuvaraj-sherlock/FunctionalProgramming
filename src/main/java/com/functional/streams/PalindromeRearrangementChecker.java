package com.functional.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Can palindrome be formed? Given a string, check if palindrome can be formed by rearranging its characters.
Ex1. string: bangalore ans : false
Ex2. string: abdybayd ans : true because string can be rearranged as abdyydba*/
public class PalindromeRearrangementChecker {

  public static boolean canFormPalindrome(String input) {
    Map<Character, Long> collect = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(collect);
    long count = collect.entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .count();
    return  count<=1;
  }
}
