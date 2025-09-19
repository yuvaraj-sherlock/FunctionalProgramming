import com.functional.streams.AnagramGroupper;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingMain {
  public static void main(String[] args) {

    /*
    Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
      Output: [["bat"], ["tan", "nat"], ["eat", "tea", "ate"]]
    */
    List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
    List<List<String>> list1 = AnagramGroupper.groupAnagram(list);
    System.out.println(list1);
    List<List<String>> list2 = AnagramGroupper.groupAnagramUsingJava8(list);
    System.out.println(list2);
  }
}
