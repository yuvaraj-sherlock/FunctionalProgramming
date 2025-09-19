package com.functional.streams;

import java.util.*;
import java.util.stream.Collectors;

/*
  Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
  Output: [["bat"], ["tan", "nat"], ["eat", "tea", "ate"]]
*/

public class AnagramGroupper {
  public static List<List<String>> groupAnagram(List<String> list){
    Map<String,List<String>> map = new HashMap<>();
    for(String str: list){
      char[] charArray = str.toCharArray();
      Arrays.sort(charArray);
      String sortedKey = new String(charArray);
      if(!map.containsKey(sortedKey)){
        map.put(sortedKey,new ArrayList<>());
      }
      map.get(sortedKey).add(str);
    }
    return new ArrayList<>(map.values());
  }

  public static List<List<String>> groupAnagramUsingJava8(List<String> list){
    Map<String, List<String>> map = list.stream()
            .collect(Collectors.groupingBy(word -> {
              char[] chars = word.toCharArray();
              Arrays.sort(chars);
              return new String(chars); // this acts as the key
            }));
    return new ArrayList<>(map.values());
  }
}
