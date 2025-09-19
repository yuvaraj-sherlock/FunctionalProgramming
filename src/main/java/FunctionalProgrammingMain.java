import com.functional.streams.AnagramGroupper;
import com.functional.model.Employee;
import com.functional.streams.EmployeeStreamProcessor;
import com.functional.streams.PalindromeRearrangementChecker;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
    boolean isPalindrome = PalindromeRearrangementChecker.canFormPalindrome("abdybayd");
    System.out.println(isPalindrome);
  }
}
