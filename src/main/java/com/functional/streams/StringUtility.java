package com.functional.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringUtility {

  //To remove duplicates from the given String
  public static String removeDuplicates(String str) {
    Set<Character> collect = str.chars().mapToObj(c -> (char) c)
            .filter(c -> c != ' ')
            .collect(Collectors.toCollection(LinkedHashSet::new));
    System.out.println(collect);

    String collect1 = collect.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    return collect1;
  }

  public static char findFirstNonRepeatingCharacter(String str){
    LinkedHashMap<Character, Long> collect = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    System.out.println(collect);

    Optional<Map.Entry<Character, Long>> first = collect.entrySet()
            .stream()
            .filter((entry) -> entry.getValue() == 1)
            .findFirst();
    System.out.println(first.get().getKey());
    return first.get().getKey();
  }


}
