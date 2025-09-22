package com.functional.streams;

import java.util.Arrays;
import java.util.List;

public class CustomPatternUtility {

  /*Input: 36,11,6,9,45,4
  Output: 6,4,11,9,45,36
  Pattern: a1>a2<a3>a4<a5*/
  public static Integer[]  arraySortAndSwapPattern(Integer[] input){
    for(int i: input){
      System.out.print(i+",");
    }
    System.out.println();
    Arrays.sort(input);
    for(int i=0;i<input.length;i++){
      if(i%2==0){
        int temp = input[i];
        input[i] = input[i + 1];
        input[i + 1] = temp;
      }
    }
    for(int i: input){
      System.out.print(i+",");
    }


    return null;
  }
}
