import com.functional.streams.AnagramGroupper;
import com.functional.model.Employee;
import com.functional.streams.EmployeeStreamProcessor;
import com.functional.streams.GroupingByProcessor;
import com.functional.streams.PalindromeRearrangementChecker;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalProgrammingMain {
  public static void main(String[] args) {

    /*
    Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
      Output: [["bat"], ["tan", "nat"], ["eat", "tea", "ate"]]
    */

    /*
    List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
    List<List<String>> list1 = AnagramGroupper.groupAnagram(list);
    System.out.println(list1);
    List<List<String>> list2 = AnagramGroupper.groupAnagramUsingJava8(list);
    System.out.println(list2);
    */

    /*Given a List<Emp>:
    ·Filters employees whose salary > 50000
    ·Converts their names to UPPERCASE
    ·Sorts the list by name in descending order
    ·Returns the result as a List<Emp>*/

    /*List<Employee> employees = EmployeeStreamProcessor.processEmployees(Employee.getDummyEmployees());
    System.out.println(employees);*/

    /*convert List<Employee> into Map<empName,salary>*/
   /*
   Map<String, Double> map = EmployeeStreamProcessor.convertToMap(Employee.getDummyEmployees());
    System.out.println(map);

    //sort map by Key
    Map<String, Double> sortByKey = EmployeeStreamProcessor.sortMapByKey(map);
    System.out.println(sortByKey);

    //sort map by Key Desc
    Map<String, Double> sortByKeyDesc = EmployeeStreamProcessor.sortMapByKeyDesc(map);
    System.out.println(sortByKeyDesc);

    //sort map by Value
    Map<String, Double> sortByValue = EmployeeStreamProcessor.sortMapByValue(map);
    System.out.println(sortByValue);

    //sort map by Value Desc
    Map<String, Double> sortByValueDesc = EmployeeStreamProcessor.sortMapByValueDesc(map);
    System.out.println(sortByValueDesc);
  */

    //Can Palindrome be formed?
   /* boolean isPalindrome = PalindromeRearrangementChecker.canFormPalindrome("abdybayd");
    System.out.println(isPalindrome);*/

    /*Map<String, List<Employee>> empListByCity =
            GroupingByProcessor.groupOfEmployeesByCity(Employee.getDummyEmployees());
    System.out.println(empListByCity);

    Map<String, List<String>> nameListByCity =
            GroupingByProcessor.nameOfEmployeesByCity(Employee.getDummyEmployees());
    System.out.println(nameListByCity);*/

   /* List<String> names = Arrays.asList("Alice", "Adam", "Bob", "Brian","Charlie");
    Map<Character, List<String>> collect = names.stream()
            .collect(Collectors.groupingBy(name -> name.charAt(0)));
    System.out.println(collect);*/

   /* List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    Map<String, List<Integer>> stringListMap = GroupingByProcessor.groupByEvenOdd(numbers);
    System.out.println(stringListMap);*/

    //Find first nonrepeating character
    /*String str = "swiss";
    LinkedHashMap<Character, Long> collect = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    System.out.println(collect);

    Optional<Map.Entry<Character, Long>> first = collect.entrySet()
            .stream()
            .filter((entry) -> entry.getValue() == 1)
            .findFirst();
    System.out.println(first.get().getKey());*/

    //To remove duplicates from the given String
    String str = "hello world";
    Set<Character> collect = str.chars().mapToObj(c -> (char) c)
            .filter(c -> c != ' ')
            .collect(Collectors.toCollection(LinkedHashSet::new));
    System.out.println(collect);

    String collect1 = collect.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    System.out.println(collect1);
  }
}
